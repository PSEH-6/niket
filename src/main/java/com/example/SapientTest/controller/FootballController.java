package com.example.SapientTest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FootballController {

	@RequestMapping(value = "/football", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	public String test()
	{
		 final String uri = "https://apiv2.apifootball.com/?action=get_leagues&country_id=41&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
	     
		    RestTemplate restTemplate = new RestTemplate();
		    String result = restTemplate.getForObject(uri, String.class);
		     
		    System.out.println(result);
		    return result;
	}
}
