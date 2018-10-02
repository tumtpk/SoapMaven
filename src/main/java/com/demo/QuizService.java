package com.demo;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.swing.text.DateFormatter;

@WebService(endpointInterface="com.demo.QuizServiceInterface")

public class QuizService {

	@WebMethod
	public Date toDay() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		return date;
		
	}
	@WebMethod
	public String getMonth(@WebParam(name="num")int num) {
		
		 switch( num ) {
         case 1 : return "January"; 
         case 2 : return "February" ; 
         case 3 : return  "March" ; 
         case 4 : return "April"; 
         case 5 : return  "May"; 
         case 6 : return "June"; 
         case 7 : return "July"; 
         case 8 : return "August"; 
         case 9 : return "September"; 
         case 10: return "October"; 
         case 11: return "November"; 
         case 12 : return "December"; 
         default:
             return "hello world";
     }
		
	}
}
