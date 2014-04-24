/**
 * Copyright HZCW (He Zhong Chuang Wei) Technologies Co.,Ltd. 2013-2015. All rights reserved.
 */
	
package com.weheros.account.domain;

import java.io.Serializable;

/**
 * @ClassName: Account
 * @author Administrator
 * @date 2014年4月24日 下午6:15:30
 */
public class Account implements Serializable {
	
	/**
	  * @Fields serialVersionUID 
	  */		
	private static final long serialVersionUID = -2007983614086784989L;
	private String account;
	private String password;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
