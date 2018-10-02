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
		if(number == 1) {
			return "January";
		}
		else if(number == 2) {
			return "February";
		}
		else if(number == 3) {
			return "March";
		}
		else if(number == 4) {
			return "April";
		}
		else if(number == 5) {
			return "May";
		}
		else if(number == 6) {
			return "June";
		}
		else if(number == 7) {
			return "July";
		}
		else if(number == 8) {
			return "August";
		}
		else if(number == 9) {
			return "September";
		}
		else if(number == 10) {
			return "October";
		}
		else if(number == 11) {
			return "November";
		}
		else if(number == 12) {
			return "December";
		}
		else  {
			return "hello world";
		}
	}
}
