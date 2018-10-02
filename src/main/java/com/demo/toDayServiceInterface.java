package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface toDayServiceInterface {

	
@WebMethod
public String toDay();

@WebMethod
public String Month(@WebParam(name="num")int num);
}
