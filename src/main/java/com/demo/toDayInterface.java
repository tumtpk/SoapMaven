package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface toDayInterface {
	
	@WebMethod
	public String toDay();
	@WebMethod
	public double calculate(@WebParam(name="n") int n);
	@WebMethod
	public String getMonth();
	

}