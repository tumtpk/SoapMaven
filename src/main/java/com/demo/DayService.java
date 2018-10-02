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
	public String getMonth(@WebParam(name = "num") int num) {
		 switch (num) {
         case '1' :
             return "January";
         case '2' :
             return "February";
         case '3' :
             return "February";
         case '4' :
             return "February";
         case '5' :
             return "February";
         case '6' :
             return "February";
         case '7' :
             return "February";
         case '8' :
             return "February";
         case '9' :
             return "February";
		default:
        	 return "heoll world";
     }
		
	}

}
