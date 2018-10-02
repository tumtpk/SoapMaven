package com.demo;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.QuizServiceInterface")
public class QuizService {
	@WebMethod
	public String toDay() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		String result = dateFormat.format(date);
		return result;
	}
	
	@WebMethod
	public String getMonth(@WebParam(name = "month_digit") int num) {
		
		String[] monList = {"","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		return monList[num];
	}
}
