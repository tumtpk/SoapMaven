package com.demo;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService (endpointInterface = "com.demo.TodayInterface") 
public class Today {
	@WebMethod
	public String toDay(@WebParam(name = "date")String date) {
		Scanner reader  = new Scanner(System.in);
		int date;
		return date ['02/10/2018 13:06:20'];
}
	
	@WebMethod
	public int getMonth(@WebParam(name = "months")String months)				  
	{	
		int months1;
		while ( months1 <= 12 ) {
			months1 = ['January', 'Febuary', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];
		}
	    return months1;
	}			
}
