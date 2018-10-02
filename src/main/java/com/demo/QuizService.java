package com.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class QuizService {
		
		@WebMethod
		public String toDay() {
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			return dateFormat.format(date) ;			
		}
		@WebMethod
		public String getMonth(@WebParam(name = "getmonth") String getmonth) {
//			Date date = new Date();
//			LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//			int month = localDate.getMonthValue();
			
			
			return getmonth;
		}
		
		
}
