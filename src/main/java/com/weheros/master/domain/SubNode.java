package com.weheros.master.domain;
/**
 * Now,there are two types of subnode.
 * <p>signal server,relay server
 * @ClassName: SubNode
 * @author Yang
 * @date 2014年4月25日 下午7:12:59
 */
public class SubNode{
	enum SubNodeType{
		SS("SS"),
		RS("RS");
		private String type;
		
		public String getType() {
			return type;
		}

		private SubNodeType(String type){
			this.type=type;
		}
	}
	
	private String ip;
	private int port;	
	private int capacity;
	//percent of performance
	//such as 50%,20%
	private double freeCpu;
	private double freeMemory;
	public SubNode( ){
		
	}
	public SubNode(String ip, int port) {
		super();
		this.ip = ip;
		this.port = port;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getFreeCpu() {
		return freeCpu;
	}
	public void setFreeCpu(double freeCpu) {
		this.freeCpu = freeCpu;
	}
	public double getFreeMemory() {
		return freeMemory;
	}
	public void setFreeMemory(double freeMemory) {
		this.freeMemory = freeMemory;
	}
	
	
}
