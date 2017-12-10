/**
 * 
 */
package com.ming.sbm.conmon.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.ming.sbm.user.bean.User;

/**
 * @author admin
 */
public class ApplicationListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("应用程序停止销毁");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("应用程序初始化");
		List<User> users = new ArrayList<>();
		arg0.getServletContext().setAttribute("online", users);
	}

}
