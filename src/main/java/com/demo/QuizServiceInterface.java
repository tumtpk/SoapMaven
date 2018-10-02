package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface QuizServiceInterface {
	
	@WebMethod
	public String toDay();
	public String getMonth(@WebParam(name = "number")int number);

}
