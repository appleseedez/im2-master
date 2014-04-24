/**
 * Copyright HZCW (He Zhong Chuang Wei) Technologies Co.,Ltd. 2013-2015. All rights reserved.
 */
	
package com.weheros.account.front;

import java.io.Serializable;

import com.weheros.account.domain.Account;

/**
 * @ClassName: LoginResponse
 * @author Administrator
 * @date 2014年4月24日 下午6:24:07
 */
public class LoginResponse extends LoginRequest implements Serializable {

	/**
	  * @Fields serialVersionUID 
	  */		
	private static final long serialVersionUID = 1808425647326046304L;
	public LoginResponse(){
		
	}
	public LoginResponse(Head head, ResBody body) {
		this.head=head;
		this.body=body;
	}

}

