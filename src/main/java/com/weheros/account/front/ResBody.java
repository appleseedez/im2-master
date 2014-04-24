/**
 * Copyright HZCW (He Zhong Chuang Wei) Technologies Co.,Ltd. 2013-2015. All rights reserved.
 */
	
package com.weheros.account.front;

import java.io.Serializable;

import com.weheros.account.domain.Account;

/**
 * @ClassName: ResBody
 * @author Administrator
 * @date 2014年4月24日 下午7:27:48
 */
public class ResBody implements Serializable{
	 /**
	  * @Fields serialVersionUID 
	  */
	private static final long serialVersionUID = 3635151688123862340L;
	private String ssIP;// signal server ip
    private int ssPort;// signal server port
    private String stunServer; //
    private Account userInfo;
	public String getSsIP() {
		return ssIP;
	}
	public void setSsIP(String ssIP) {
		this.ssIP = ssIP;
	}
	public int getSsPort() {
		return ssPort;
	}
	public void setSsPort(int ssPort) {
		this.ssPort = ssPort;
	}
	public String getStunServer() {
		return stunServer;
	}
	public void setStunServer(String stunServer) {
		this.stunServer = stunServer;
	}
	public Account getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(Account userInfo) {
		this.userInfo = userInfo;
	}
    
}