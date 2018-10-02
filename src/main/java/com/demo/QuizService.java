package com.demo;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class QuizService {

	@WebMethod
	public String toDay() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentDate = df.format(c.getTime());
		return "Output : " + currentDate; 
	}
	
	@WebMethod
	public String getMonth(@WebParam (name = "number") int number){
		switch(number){
		case 1 : return "January";
		case 2 : return "February";
		case 3 : return "March";
		case 4 : return "April";
		case 5 : return "May";
		case 6 : return "June";
		case 7 : return "July";
		case 8 : return "August";
		case 9 : return "September";
		case 10 : return "October";
		case 11 : return "November";
		case 12 : return "December";
		}
		return "Hello World";
	}
}
