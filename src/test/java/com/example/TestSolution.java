package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSolution {

	private Solution solution;
	@BeforeEach
	public void setup(){
		solution = new Solution();
	}

	@AfterEach
	public void tearDown(){
		solution = null;
	}
	@Test
	public void testStep1()
	{
		Map<String,String> inputStr = new HashMap<>();
		inputStr.put("3", "fizz");
		inputStr.put("5", "buzz");
		inputStr.put("15", "fizzbuzz");
		Map<String,Map<String,Integer>> map = solution.step1("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16",inputStr);
		Map<String, Integer> actual = map.get("1 2 fizz 4 buzz 6 7 8 9 10 11 12 13 14 fizzbuzz 16 ");
		assertNotNull(actual);
	}

	@Test
	public void testStep2()
	{
		Map<String,String> inputStr = new  HashMap<String, String>();
		inputStr.put("3", "lucky");
		inputStr.put("5", "buzz");
		inputStr.put("15", "fizzbuzz");
		Map<String,Map<String,Integer>> map = solution.step1("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16",inputStr);
		Map<String, Integer> actual = map.get("1 2 lucky 4 buzz 6 7 8 9 10 11 12 13 14 fizzbuzz 16 ");
		assertNotNull(actual);
	}
	
	
	@Test
	public void testStep3()
	{
		Map<String,String> inputStr = new  HashMap<String, String>();
		inputStr.put("3", "lucky");
		inputStr.put("5", "buzz");
		inputStr.put("15", "fizzbuzz");
		Map<String,Map<String,Integer>> map = solution.step1("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16",inputStr);
		Map<String, Integer> actual =  map.get("1 2 lucky 4 buzz 6 7 8 9 10 11 12 13 14 fizzbuzz 16 ");
		assertTrue(actual.get("lucky") ==1 && actual.get("buzz") ==1 && actual.get("fizzbuzz") ==1);
	}

	
	
}
