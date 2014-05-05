/**
 * Copyright HZCW (He Zhong Chuang Wei) Technologies Co.,Ltd. 2013-2015. All rights reserved.
 */
	
package com.weheros.account.front;

import java.io.Serializable;

import com.weheros.account.domain.Account;

/**
 * @ClassName: LoginRequest
 * @author Administrator
 * @date 2014年4月24日 下午6:08:22
 */
public class LoginRequest implements Serializable {

	/**
	  * @Fields serialVersionUID 
	  */
		
	private static final long serialVersionUID = -8670985978816223950L;
	
	protected Head head;
	protected Object body;
	
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public Object getBody() {
		return body;
	}
	public void setBody(Object body) {
		this.body = body;
	}
	

}

