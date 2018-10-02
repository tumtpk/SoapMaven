package com.demo;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.junit.runners.Parameterized.Parameters;

@WebService

public interface QuizServiceInterface {
	
	@WebMethod
	public String toDay(@WebParam(name = "") Date date);
	
	@WebMethod
	public int getMonth(@WebParam(name = "Month") int Month);

}
