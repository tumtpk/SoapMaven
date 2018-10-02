package com.demo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "DayServiceInterface")

public class DayService {
	@WebMethod
	public String toDay() {
		return toDay();
		
	}
	@WebMethod
	public String getMonth(@WebParam(name = "month") int month) {
		 return ;
	}

}
