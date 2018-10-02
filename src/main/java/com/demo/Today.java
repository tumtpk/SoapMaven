package com.demo;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService (endpointInterface = "com.demo.TodayInterface") 
public class Today {
	@WebMethod
	public String getMonth(@WebParam(name = "months")String months)				  
	{	
	    return months;
	}
	
	@WebMethod
	public String toDay(@WebParam(name = "date")String date) {
		
		return date;
	}			
}
