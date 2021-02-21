package edu.ecu.cs.seng6285.restfulbots;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
	private static String logClass = "CalcController";
	private Logger logger = LoggerFactory.getLogger(logClass);
	
	 @GetMapping("/add")
	 private String add(int a, int b) {
		 logger.info(String.format("performed calculation of %s", a," and ", b));
		 return String.format("Answer is %s", (a + b));
	 }

}
