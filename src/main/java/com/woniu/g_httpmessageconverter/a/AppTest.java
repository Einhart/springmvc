package com.woniu.g_httpmessageconverter.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppTest {
	public static void main(String[] args) throws Exception {
		//创建服务器套接字，制定端口
		ServerSocket ss = new ServerSocket(8888);
		System.out.println("服务器已启动");
		//套接字服务器监听8888端口，
		//同步阻塞状态
		Socket client = ss.accept();
		System.out.println("客户端链接成功");
		
		//获取客户端输入流，输入流的起点：客户端，终点：服务器
		InputStream in = client.getInputStream();
		//字节输出流，起点：当前程序的内存，终点：当前程序的另外一片内存
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		byte[] b = new byte[1028*8];
		
		//此循环保证浏览器将数据发送到服务端
		while (in.available() == 0);
		
		while (in.available() > 0) {
			int len = in.read(b);
			bos.write(b, 0, len);
		}
		
		byte[] buf = bos.toByteArray();
		String str = new String(buf);
		System.out.println(str);
		
		bos.close();
		in.close();
	}
}
