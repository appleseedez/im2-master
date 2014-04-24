/**
 * Copyright HZCW (He Zhong Chuang Wei) Technologies Co.,Ltd. 2013-2015. All rights reserved.
 */
	
package com.weheros.account.application;

import com.weheros.account.front.LoginResponse;

/**
 * @ClassName: IAccountManager
 * @author Administrator
 * @date 2014年4月24日 下午6:04:01
 */
public interface IAccountManager {

	public LoginResponse verificate(String account, String password);
	
	

}
