package sprinboot.rest.integration.services;

import org.springframework.stereotype.Service;

/**
* @author Krishna Bhat
*
*/

@Service
public class PolicyService {
	public String getPolicy(final int policyNumber){
		return policyNumber > 5 ? "Krishna" : "Bhat";
	}
}
