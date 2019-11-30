package com.example.SapientTest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FootballControllerTest {
	FootballController footballController = new FootballController();

	@Test
	public void testCountryId() throws Exception {
		assertEquals(footballController.getLeagueDetails().contains("41"), true);
		;
	}

	@Test
	public void testCountryName() throws Exception {
		assertEquals(footballController.getLeagueDetails().contains("England"), true);
		;
	}

	@Test
	public void testLeagueId() throws Exception {
		assertEquals(footballController.getLeagueDetails().contains("149"), true);
		;
	}

	@Test
	public void testLeagueName() throws Exception {
		assertEquals(footballController.getLeagueDetails().contains("Championship"), true);
		;
	}
}
