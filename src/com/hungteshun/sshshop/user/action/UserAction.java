package com.hungteshun.sshshop.user.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户模块Action的类
 * 
 * @author hungteshun黄调聪
 * 
 */
public class UserAction extends ActionSupport {

	/**
	 * 跳转到注册页面
	 * @return
	 */
	public String registPage() {
		return "registPage";
	}
}
