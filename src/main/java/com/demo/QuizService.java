package com.demo;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.toDay")

	public class QuizService {
	@WebMethod
	public double calculate(@WebParam(name = "n")int n) {
			
			Date date = new Date(0);
			System.out.println("Current Date : " + date.toString()); 
			Calendar c1 = Calendar.getInstance();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String currentDate = df.format(c1.getTime());
			System.out.println("Current Date : " + currentDate); 
			
		    GregorianCalendar gc = new GregorianCalendar();
		    System.out.println("Year : " + gc.get(Calendar.YEAR));
		    System.out.println("Month : " + gc.get(Calendar.MONTH));
		    System.out.println("Day : " + gc.get(Calendar.DATE));
		    System.out.println("Hour : " + gc.get(Calendar.HOUR));
		    System.out.println("Minute : " + gc.get(Calendar.MINUTE));
		    System.out.println("Second : " + gc.get(Calendar.SECOND));
			return n;
			
		   
			
		}
		
		

		}

	

	
		
		
	


