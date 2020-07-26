package com.epam.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAinFirstTwoChars {
	RemoveTwoChars removeTwoChars;

	@AfterAll
	static void fun() {
		System.out.println("All Executed");
	}
	@BeforeEach
	void setup()
	{
		removeTwoChars=new RemoveTwoChars();
	}
	@Test
	void testTwoAAchars() {
		assertEquals("", removeTwoChars.remove("AA"));
	}
	@Test
	void testZeroChars() {

		assertEquals("",removeTwoChars.remove(""));
	}
	@Test
	void testOneAChars() {
		assertEquals("", removeTwoChars.remove("A"));
		}
	@Test
	void testOneBChars1() {
		assertEquals("B",removeTwoChars.remove("B"));
		}
	@Test
	void testTwoABChars() {
		assertEquals("B", removeTwoChars.remove("AB"));	
	}
	@Test
	void testTwoBAChars() {
		 assertEquals("B", removeTwoChars.remove("BA"));
	}
	@Test
	void testNABChars() {
		 assertEquals("BAAA",removeTwoChars.remove("ABAAA"));
	}
	@Test
	void testNAAChars() {
		assertEquals("BAAA",removeTwoChars.remove("AABAAA"));
	}
	@Test
	void testNBAChars() {
		assertEquals("BBAAA",removeTwoChars.remove("BABAAA"));
	}
	@Test
	void testAllAAChars() {
		assertEquals("A",removeTwoChars.remove("AAA"));
	}
}