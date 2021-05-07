package com.cg.onlineshop;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestController {
	
	@RequestMapping(value="/sayHello")
	public ResponseEntity<String> sayHello(){
	return new ResponseEntity<String>("Hello To All",HttpStatus.OK);
	}
	@RequestMapping(value="/sayHi")
	public ResponseEntity<String> sayHi(){
	return new ResponseEntity<String>("Hi To All",HttpStatus.OK);
	}
	
	@RequestMapping(value="/sayWelcome")
	public ResponseEntity<String> saywelcome(){
	return new ResponseEntity<String>("Welcome to  All",HttpStatus.OK);
	}

}
