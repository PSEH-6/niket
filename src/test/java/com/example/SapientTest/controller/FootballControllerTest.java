package com.example.SapientTest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FootballControllerTest {
	FootballController footballController = new FootballController();
String countryId =41+"";
	@Test
	public void testCountryId() throws Exception {
		assertEquals(footballController.getLeagueDetails(countryId).contains("41"), true);

	}

	@Test
	public void testCountryName() throws Exception {
		assertEquals(footballController.getLeagueDetails(countryId).contains("England"), true);

	}

	@Test
	public void testLeagueId() throws Exception {
		assertEquals(footballController.getLeagueDetails(countryId).contains("149"), true);

	}

	@Test
	public void testLeagueName() throws Exception {
		assertEquals(footballController.getLeagueDetails(countryId).contains("Championship"), true);

	}
}
