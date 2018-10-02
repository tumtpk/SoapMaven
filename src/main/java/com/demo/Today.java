package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService (endpointInterface = "com.demo.TodayInterface") 
public class Today 
{
	@WebMethod
	public String getMonth(@WebParam(name = "months")String month)
						  
	{
	    return months = ['January', 'Febuary', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']; 
	}
	public String toDay(@WebParam(name = "date")int date) {
		return dates;
	}
				
}
