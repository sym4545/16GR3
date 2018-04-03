/**
 * 
 */
package com.qhit.lh.grs.sym.exam.common.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.grs.sym.exam.common.bean.User;
import com.qhit.lh.grs.sym.exam.common.service.UserService;
import com.qhit.lh.grs.sym.exam.common.service.UserServiceImpl;


public class UserAction extends ActionSupport {
	private UserService userService = new UserServiceImpl();
	
	private User user;
	
	/**
	 * @return
	 * 鐧诲�?
	 */
	public String login(){
		
		user = userService.login(user);
		
		if(user != null){
			//鐧诲綍鎴愬姛
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
			return "loginSuccess";
		}else{
			super.addActionError("鐧诲綍澶辫触锛佽閲嶆柊鐧诲�?!");
			return "loginFail";
		}
	}
	
	/**
	 * @return
	 * 閫�鍑�
	 */
	public String logout(){
		//鑾峰彇seession瀵硅薄骞堕攢姣�
		ServletActionContext.getRequest().getSession().invalidate();
		return "logout";
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
}
