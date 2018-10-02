package com.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class QuizService {
	
	@WebMethod
	public String toDay() {

	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss") ;  
	    Date date = new Date();  
	    
	    return formatter.format(date);
		
	}
	@WebMethod
	public String getMonth(@WebParam(name = "number")int number) {
		String monthString = "";
		switch(number) {
		 case 1:  monthString = "January";
         break;
		 case 2:  monthString = "February";
         break;
		 case 3:  monthString = "March";
         break;
		 case 4:  monthString = "April";
         break;
		 case 5:  monthString = "May";
         break;
		 case 6:  monthString = "June";
         break;
		 case 7:  monthString = "July";
         break;
		 case 8:  monthString = "August";
         break;
		 case 9:  monthString = "September";
         break;
		 case 10: monthString = "October";
         break;
		 case 11: monthString = "November";
         break;
		 case 12: monthString = "December";
         break;
		 default: monthString = "hello world";
         break;
		}
		return monthString;
	}

}
