package com.demo;



import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "QuizServiceInterface")
public class QuizService {
	
	@WebMethod
	public String toDay() {
		Date dNow = new Date(0);
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		return  ft.format(dNow) ;
	}
	
	@WebMethod
	public String getMonth(@WebParam(name = "number") int num) {
		String month = null;
		switch (num) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June ";
			break;
		case 7:
			month = "July ";
			break;
		case 8:
			month = "August ";
			break;
		case 9:
			month = "September ";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;

		default:
			month = "hello world";
			break;
		}
		return month;
	}

}
















