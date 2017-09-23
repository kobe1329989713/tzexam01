package com.tz.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tz.dao.UserDao;
import com.tz.model.User;
import com.tz.util.TzStringUtils;

@Controller
public class LoginController {

	@Autowired
	private UserDao userDao;

	@RequestMapping("/login")
	public String index() {
		return "login";
	}

	/**
	 * 
	 * 用户登录
	 * 
	 * @author Administrator
	 * @param session
	 * @param request
	 * @return
	 * @since JDK 1.6
	 *
	 * password
	 */
	@ResponseBody
	@RequestMapping(value = "/logined", method = RequestMethod.POST)
	public String logined(HttpSession session, HttpServletRequest request) {
		String username = request.getParameter("account");
		String password = request.getParameter("password");
		if (TzStringUtils.isNotEmpty(username)
				&& TzStringUtils.isNotEmpty(password)) {
			password = TzStringUtils.md5Base64(password);
			User user = userDao.getLoginUser(username, password);
			if (user != null) {
				session.setAttribute("SESSION_USER", user);
				session.setAttribute("SESSION_USER_NAME", user.getUsername());
				return "success";
			} else {
				return "error";
			}
		} else {
			return "null";
		}
	}
	
	@RequestMapping("/loginout")
	public String loginOut(HttpSession session){
		if(session!=null)session.invalidate();
		return "redirect:login";
	}
}
