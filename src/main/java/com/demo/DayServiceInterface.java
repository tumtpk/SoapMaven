package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService

public interface DayServiceInterface {
	
	@WebMethod
	public String toDay();
	@WebMethod
	public int getMonth(@WebParam(name = "num") int num); 
	
}
