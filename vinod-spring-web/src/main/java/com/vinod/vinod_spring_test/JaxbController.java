package com.vinod.vinod_spring_test;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mystate")
public class JaxbController {
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public State getState(@PathVariable String code) {
		String result;
		if (code.equals("KL")) {
			result = "Kerala";
		} else {
			result = "Default State";
		}
		State st = new State();
		st.setCode(code);
		st.setName(result);
		return st;

	}
}