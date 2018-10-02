package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.text.SimpleDateFormat;  
import java.util.Date;

@WebService(endpointInterface = "com.demo.QuizServiceInterface")
public class QuizService {

	@WebMethod
	public String toDay() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();
	    return formatter.format(date);
	}
	
	@WebMethod
	public String getMonth(@WebParam(name = "num")int num) {
		String[] arrMon = {"","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		return arrMon[num];
	}
}
