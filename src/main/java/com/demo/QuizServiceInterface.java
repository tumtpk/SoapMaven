package com.demo;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService

public interface QuizServiceInterface {
	
	@WebMethod
	public Date toDay(@WebParam(name = "date") Date date);
	
	@WebMethod
	public int getMonth(@WebParam(name = "Month") int Month);

}
