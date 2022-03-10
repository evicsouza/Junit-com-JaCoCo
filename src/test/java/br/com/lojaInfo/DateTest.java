package br.com.lojaInfo;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DateTest {

	Date date;

	@Before
	public void init() {
		date = new Date(03, 03, 2022);
	}

	@Test
	public void setMesTeste() {
		date.setMes(3);
		assertTrue(true);
	}

	@Test
	public void setDiaTeste() {
		date.setDia(4);
		assertTrue(true);
	}

	@Test
	public void setAnoTeste() {
		date.setAno(2022);
		assertTrue(true);
	}

	@Test
	public void displayDateTeste() {
		String data = date.displayDate(3, 4, 2022);
		assertTrue(data, true);
	}

}
