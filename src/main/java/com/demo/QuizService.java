package com.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class QuizService {
		
		@WebMethod
		public String toDayString() {
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			return dateFormat.format(date) ;			
		}
}
