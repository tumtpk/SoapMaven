package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(endpointInterface = "com.demo.QuizService")

public interface QuizServiceInterface {
	@WebMethod
	public String toDay();
	
	@WebMethod
	public String getMonth(@WebParam (name = "number") int number);
	
	

}
