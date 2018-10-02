package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface TodayInterface {
	@WebMethod
	public String getMonth(@WebParam(name = "months") String months ) ;
		
	
	public String toDay (@WebParam(name = "date") String date);
}
