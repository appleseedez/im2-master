/**
 * Copyright HZCW (He Zhong Chuang Wei) Technologies Co.,Ltd. 2013-2015. All rights reserved.
 */
	
package com.weheros.account.domain;

/**
 * @ClassName: SessionTokenService
 * @author Yang
 * @date 2014年4月25日 下午6:47:05
 */
public class SessionTokenService {
    public static String generateSessionToken(String name,String pricinple){
    	//TODO:more secure agroithm
    	return name+"____"+pricinple;
    }
}
