package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface QuizServiceInterface {
	
	@WebMethod
	public String QuizService();
	@WebMethod
	public String getMonth();
	@WebMethod
	public String toDay();

	

}