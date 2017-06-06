package sprinboot.rest.integration.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import sprinboot.rest.integration.services.PolicyService;


/**
* @author Krishna Bhat
*
*/
@RunWith(SpringRunner.class)
@WebMvcTest(PolicyController.class)
public class PolicyControllerTest {
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private PolicyService policyService;
	
	@Test
	public void test() throws Exception{
		final int policyNumber = 5;
		
		mvc.perform(get(PolicyController.URL, policyNumber).accept(MediaType.APPLICATION_JSON_UTF8))
		.andExpect(status().isOk())
		.andExpect(content().string("Krishna"));
	}
}
