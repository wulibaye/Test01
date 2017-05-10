package com.imooc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Test02 {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args){
		try {
			URL url = new URL("http://www.hao123.com");
			InputStream is = url.openStream();//字节输入流
			InputStreamReader isr = new InputStreamReader(is);//字符输入流
			BufferedReader bf = new BufferedReader(isr);//缓冲流
			String data = bf.readLine();
			while(data !=null){
				System.out.println(data);
				bf.readLine();
			}
			bf.close();
			isr.close();
			is.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
//		try {
//			URL url = new URL("http://www.baidu.com");
//			InputStream is = url.openStream();//字节输入流
//			InputStreamReader isr = new InputStreamReader(is);//字符输入流
//			BufferedReader bf = new BufferedReader(isr);//缓冲流
//			String data = bf.readLine();
//			while(data !=null){
//				System.out.println(data);
//				bf.readLine();
//			}
//			bf.close();
//			isr.close();
//			is.close();
		
