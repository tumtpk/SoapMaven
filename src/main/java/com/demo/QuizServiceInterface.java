package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;

public interface QuizServiceInterface {

	@WebMethod
	public String toDay();
	
	@WebMethod
	public String 	getMonth(@WebParam(name = "getMonth") int getMonth);
}
