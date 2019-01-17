package com.naztech.Enum_Months;

	import static org.junit.Assert.*;
	import org.junit.Test;
	
	public class MonthTest {

		@Test
		public void testDaysInMonth() {
			assertEquals(31, Month.JANUARY.daysInMonth());
			assertEquals(28, Month.FEBRUARY.daysInMonth());
			assertEquals(31, Month.MARCH.daysInMonth());
			assertEquals(30, Month.APRIL.daysInMonth());
			assertEquals(31, Month.MAY.daysInMonth());
			assertEquals(30, Month.JUNE.daysInMonth());
			assertEquals(31, Month.JULY.daysInMonth());
			assertEquals(31, Month.AUGUST.daysInMonth());
			assertEquals(30, Month.SEPTEMBER.daysInMonth());
			assertEquals(31, Month.OCTOBER.daysInMonth());
			assertEquals(30, Month.NOVEMBER.daysInMonth());
			assertEquals(31, Month.DECEMBER.daysInMonth());
		}

		@Test
		public void testGetShortName() {
			assertEquals("Jan",Month.JANUARY.getShortName());
			assertEquals("Feb",Month.FEBRUARY.getShortName());
			assertEquals("Mar",Month.MARCH.getShortName());
			assertEquals("Apr",Month.APRIL.getShortName());
			assertEquals("May",Month.MAY.getShortName());
			assertEquals("Jun",Month.JUNE.getShortName());
			assertEquals("Jul",Month.JULY.getShortName());
			assertEquals("Aug",Month.AUGUST.getShortName());
			assertEquals("Sep",Month.SEPTEMBER.getShortName());
			assertEquals("Oct",Month.OCTOBER.getShortName());
			assertEquals("Nov",Month.NOVEMBER.getShortName());
			assertEquals("Dec",Month.DECEMBER.getShortName());
		}

		@Test
		public void testParse() {
			assertNotNull(Month.parse(("January")));
			assertNull(Month.parse(("Janu")));
			
			assertNotNull(Month.parse(("February")));
			assertNull(Month.parse(("febu")));
			
			assertNotNull(Month.parse(("March")));
			assertNull(Month.parse(("Marc")));
			
			assertNotNull(Month.parse(("April")));
			assertNull(Month.parse(("Janu")));
			
			assertNotNull(Month.parse(("May")));
			assertNull(Month.parse(("Janu")));
			
			assertNotNull(Month.parse(("June")));
			assertNull(Month.parse(("Janu")));
			
			assertNotNull(Month.parse(("July")));
			assertNull(Month.parse(("Janu")));
			
			assertNotNull(Month.parse(("August")));
			assertNull(Month.parse(("Janu")));
			
			assertNotNull(Month.parse(("September")));
			assertNull(Month.parse(("Janu")));
			
			assertNotNull(Month.parse(("October")));
			assertNull(Month.parse(("Janu")));
			
			assertNotNull(Month.parse(("November")));
			assertNull(Month.parse(("Janu")));
			
			assertNotNull(Month.parse(("December")));
			assertNull(Month.parse(("Janu")));
		}

	}