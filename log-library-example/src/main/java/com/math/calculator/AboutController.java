package com.math.calculator;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.loglibrary.LogManagerA;
import com.loglibrary.LoggerA;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.math.calculator.dto.AboutDTO;
import com.math.calculator.util.Calculator;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@CrossOrigin
public class AboutController {

	private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	private static final LoggerA LOGGER = LogManagerA.getLoggerA(AboutController.class.getName());
	
	@GetMapping("/api/about")
	public AboutDTO aboutMath() {

		Date present = new Date();
		String temp = "Math Help from Spring Boot " + sdf1.format(present); 

		LOGGER.info("/api/about=>" + temp);
		AboutDTO a = new AboutDTO(temp);
		return a;
	}

	@GetMapping(value = "/api/calculator", produces = MediaType.APPLICATION_JSON_VALUE)
	@Tag(name = "Public Facing", description = "Yes")
	public Calculator calculate(@RequestParam("a") int a, @RequestParam("b") int b,
			@RequestParam("operator") String operator) {
		Calculator calc = new Calculator("Please try after some time.");
		
		LOGGER.info("/api/calculator=>" + calc.toString());
		return calc;
	}

}
