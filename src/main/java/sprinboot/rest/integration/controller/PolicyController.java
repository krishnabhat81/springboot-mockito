package sprinboot.rest.integration.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author Krishna Bhat
*
*/

@RestController
public class PolicyController {

	public static final String URL = "/policy/{policyNumber}";
	
	
	@RequestMapping(URL)
	public String getPolicy(@PathVariable final int policyNumber){
		return "Krishna";
	}
	
}
