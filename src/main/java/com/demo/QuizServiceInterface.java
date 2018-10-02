package com.demo;

import java.sql.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService

public interface  QuizServiceInterface {

	@WebMethod
	public Date toDay();
	
	@WebMethod
	public String getMonth(@WebParam(name="num") int num);
	
}
