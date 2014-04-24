/**
 * Copyright HZCW (He Zhong Chuang Wei) Technologies Co.,Ltd. 2013-2015. All rights reserved.
 */
	
package com.weheros.account.exception;

/**
 * @ClassName: AccountException
 * @author Administrator
 * @date 2014年4月24日 下午7:06:58
 */
public class AccountException extends RuntimeException {

	 /**
	  * @Fields serialVersionUID 
	  */
	private static final long serialVersionUID = -9024268958309011572L;
	public AccountException(String message) {
		super(message);
	}

	public AccountException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccountException(Throwable cause) {
		super(cause);
	}
}
