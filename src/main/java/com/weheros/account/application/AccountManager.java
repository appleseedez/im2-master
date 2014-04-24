/**
 * Copyright HZCW (He Zhong Chuang Wei) Technologies Co.,Ltd. 2013-2015. All rights reserved.
 */
	
package com.weheros.account.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.weheros.account.domain.Account;
import com.weheros.account.exception.AccountException;
import com.weheros.account.front.Head;
import com.weheros.account.front.LoginResponse;
import com.weheros.account.front.ResBody;
import com.weheros.platform.infrastructure.datasystem.IRelationalDataAccess;

/**
 * @ClassName: AccountManager
 * @author Yang
 * @date 2014年4月24日 下午6:04:51
 */
@Service("accountManager")
public class AccountManager implements IAccountManager {
	@Autowired
	@Qualifier("relationalDataAccessService")
	IRelationalDataAccess relationalDataAccess;
	
	
	@Override
	public LoginResponse verificate(String account, String password) {
		
		String sql="select * from account where account=? and password=?";
		Object[] values=new Object[]{account,password};
		int num= relationalDataAccess.queryCount(sql, values);
		// fail handle
		if(num==0){
			throw new AccountException("username_or_password_incorrect");
		}
		//initial the response		
		return encapslate(account, password);
	}


	private LoginResponse encapslate(String username, String password) {
		Account account=new Account();
		account.setAccount(username);
		//account.setPassword(password);
		ResBody body=new ResBody();
		body.setUserInfo(account);
		//TODO:find the signal server ip and port.
		
		//TODO:find the stunserver.
		
		//TODO: session token algorithm
		// based on username ,password,and random numbers
		
		//put in body and head
		Head head=new Head("sessiontoken",1<<4,0);
		LoginResponse res=new LoginResponse(head,body);	
		
		return res;
	}

}
