package com.imooc;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {
	public static void main(String[] args) throws UnknownHostException {
	InetAddress iddress = InetAddress.getLocalHost();
	System.out.println("�������"+ iddress.getHostName());
	System.out.println("Ip��ַ"+ iddress.getHostAddress());
	}
}
