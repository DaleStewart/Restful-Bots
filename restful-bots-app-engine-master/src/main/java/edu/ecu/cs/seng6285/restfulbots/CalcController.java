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
	 private String add(int n, int m) {
		 logger.info(String.format("performed calculation of %s", (n + " and " + m)));
		 return String.format("Answer is %s", (n + m));
	 }
	 
	 @GetMapping("/subtract")
	 private String subtract(int n, int m) {
		 logger.info(String.format("performed calculation of %s", (n + " and " + m)));
		 return String.format("Answer is %s", (n - m));
	 }
	 
	 @GetMapping("/times")
	 private String times(int n, int m) {
		 logger.info(String.format("perform multiplication of %s", (n + " and " + m )));
		 return String.format("Answer is %s", (n * m));
	 }
	 
	 @GetMapping("/div")
	 private String div(int n, int m) {
		 logger.info(String.format("perform division of %s", (n + " and " + m)));
		 return String.format("Answer is %s", (n/m));
	 }
	 
	 @GetMapping("/neg")
	 private String div(int n) {
		 logger.info(String.format("perform negation of %s", (n)));
		 return String.format("Answer is %s", (0 - n));
	 }

}
