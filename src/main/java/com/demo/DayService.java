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
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentDate = df.format(c.getTime());
		return ("Current Date : " + currentDate);
		
	}
	@WebMethod
	public int getMonth(@WebParam(name = "num") int num) {
		
		return 0;
		
	}

}
