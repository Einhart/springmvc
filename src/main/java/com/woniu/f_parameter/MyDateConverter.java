package com.woniu.f_parameter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class MyDateConverter implements Converter<String, Date> {
	
	private SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");

	@Override
	public Date convert(String source) {
		try {
			Date date = sdf1.parse(source);
			return date;
		} catch (ParseException e) {
			try {
				Date date = sdf2.parse(source);
				return date;
			} catch (ParseException e1) {
				throw new RuntimeException(e1);
			}
		}
	}


}
