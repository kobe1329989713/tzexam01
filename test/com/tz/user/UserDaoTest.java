/**
 * Project Name:tzexam
 * File Name:UserDaoTest.java
 * Package Name:com.tz.user
 * Date:2015年10月19日上午12:56:20
 * Copyright (c) 2015, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.tz.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.tz.dao.UserDao;
import com.tz.model.User;
import com.tz.util.TzStringUtils;

import java.util.Locale;

/**
 * ClassName:UserDaoTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年10月19日 上午12:56:20 <br/>
 * @author   Administrator
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void handler(){
		String password = TzStringUtils.md5Base64("kobe");
        System.out.println(userDao + "======");
		User user = userDao.getLoginUser("kobe", password);
		System.out.println(user.getId());
	}


	// 测试国际化。
	@Test
	public void handler2(){
		Object[] params = {"校长","星期六","23423423"};
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        Locale.CHINA 中文，Locale.US 英文。
		String str3 = context.getMessage("name",params, Locale.US);
		System.out.println(str3);
	}

}

