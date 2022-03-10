package br.com.lojaInfo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class InvoiceTest {

	Invoice invoice;

	@Before
	public void init() {
		invoice = new Invoice("123", "abc", 2, 10.5);
	}

	@Test
	public void getQtdeCompradaTeste() {
		assertEquals(2, invoice.getQtdeComprada(), 0);
	}
	
	@Test
	public void getPrecoTeste() {
		assertEquals(10.5, invoice.getPrecoItem(), 0);
	}

	@Test
	public void setNumeroTeste() {
		invoice.setNumero("579");
		assertFalse(false);
	}

	@Test
	public void setDescricaoTeste() {
		invoice.setDescricao("Livro fantasia");	
		assertTrue(true);
	}

	@Test
	public void setQuantidadeTeste() {
		invoice.setQtdeComprada(18);	
		assertTrue(true);
	}

	@Test
	public void setPrecoTeste() {
		invoice.setPrecoItem(50.0);	
		assertFalse(false);
	}

	@Test
	public void getInvoiceAmountTeste() {
		double result = invoice.getInvoiceAmount(2, 10.0);
		assertEquals(20.0, result, 0);
	}

	@Test
	public void getInvoiceAmount2Teste() {
		double result = invoice.getInvoiceAmount(-1, 10.0);
		assertEquals(0, result, 0);

		result = invoice.getInvoiceAmount(12, 10.0);
		assertEquals(120, result, 0);

		result = invoice.getInvoiceAmount(12, -10.0);
		assertEquals(0, result, 0);
	}
}
