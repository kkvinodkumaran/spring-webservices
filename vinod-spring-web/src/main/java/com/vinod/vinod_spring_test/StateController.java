package com.vinod.vinod_spring_test;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/state")
public class StateController {
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public ResponseString getState(@PathVariable String code) {
		String result;
		if (code.equals("KL")) {
			result = "Kerala";
		} else {
			result = "Default State";
		}
		return new ResponseString(result);

	}
}

class ResponseString {
	String result;

	public ResponseString(String result) {
		super();
		this.result = result;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}