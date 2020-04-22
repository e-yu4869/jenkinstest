package com.example.demo;

import java.util.Calendar;
import java.util.Date;

public class MyBean {
	
	private Date date;
	private String message;
	
	public MyBean(String string) {
		
		super();
		this.date = Calendar.getInstance().getTime();
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "MyBean[message =" + message + ", date=" + date + "]"; 
	}

}
