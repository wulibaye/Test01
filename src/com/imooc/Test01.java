package com.imooc;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {
	public static void main(String[] args) throws UnknownHostException {
	InetAddress iddress = InetAddress.getLocalHost();
	System.out.println("计算机名"+ iddress.getHostName());
	System.out.println("Ip地址"+ iddress.getHostAddress());
	}
}
