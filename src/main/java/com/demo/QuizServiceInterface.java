package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService

public interface QuizServiceInterface {
	
	@WebMethod
	public String toDay();
	
	@WebMethod
	public int getMonth(@WebParam(name = "Month") int Month);

}
