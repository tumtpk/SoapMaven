package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface="com.demo.toDayServiceInterface")
public class toDayClass {

	
@WebMethod
public String toDay() {
	return " 02/10/2018 13:06:20";
}
@WebMethod
public String Month(@WebParam(name="num")int num) {
	if(num==1) {
		return "January";
	}
	else if(num==2) {
		return "February";
	}
	else if(num==3) {
		return "March";
	}
	else if(num==4) {
		return "April";
	}
	
	else if(num==5) {
		return "May";
		
	}
	else if(num==6) {
		return "June";
		
	}
	else if(num==7) {
		return "July";
		
	}
	
	else if(num==8) {
		return "August";
		
	}
	else if(num==9) {
		return "September";
		
	}
	else if(num==10) {
		return "October";
		
	}
	else if(num==11) {
		return "November";
		
	}
	else{
		return "December";
	}
	
	
	
	
	
	
	
}
	
	
	
}
