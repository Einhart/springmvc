package com.woniu.g_httpmessageconverter.b;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MyHttpMessageConverter extends AbstractHttpMessageConverter {

	@Override
	protected boolean supports(Class clazz) {
		return User.class == clazz;
	}

	@Override
	protected Object readInternal(Class clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		System.out.println("MyHttpMessageConverter.readInternal()");
		//请求参数已经被封装在InputMessage对象中了
		InputStream in = inputMessage.getBody();
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		while (in.available() > 0) {
			int b = in.read();
			bos.write(b);
		}
		byte[] bb = bos.toByteArray();
		String str = new String(bb);
		//uid=1--uname='李四'
		String[] ss = str.split("--");
		User user = new User();
		user.setUid(Integer.parseInt(ss[0].split("=")[1]));
		user.setUname(ss[1].split("=")[1]);
		return user;
	}

	@Override
	protected void writeInternal(Object t, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		System.out.println("MyHttpMessageConverter.writeInternal()");
		User user = (User) t;
		OutputStream os = outputMessage.getBody();
		ObjectMapper om = new ObjectMapper();
		String str = om.writeValueAsString(user);
		os.write(str.getBytes("utf8"));
		os.close();
	}

}
