package com.vinod.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/state")
@EnableAutoConfiguration
public class StateController {
	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public @ResponseBody State getState(@PathVariable String code) {
		if (code.equals("KL")) {
			return new State("Kerala", "Trivandrum");
		} else {
			return new State("Default State", "Default Capital");
		}
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(StateController.class, args);
	}
}

class State {
	private String name;
	private String capital;

	public State(String name, String capital) {
		super();
		this.name = name;
		this.capital = capital;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}