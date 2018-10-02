package com.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.QuizServiceInterface")
public class QuizService {
	
	@WebMethod
	public String toDay() {
		Calendar c = Calendar.getInstance();
	    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String currentDate = df.format(c.getTime());
		return currentDate;
	}
	
	@WebMethod
	public String getMonth(@WebParam(name = "month") int month) {
		String[] m = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
		if(month<1||month>12) {
			return "hello world";
		}
		return m[month];
	}

}
