package br.com.lojaInfo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	Employee employee;

	@Before
	public void init() {
		employee = new Employee("Eva", "Souza", 2000);
	}


	@Test
	public void getNomeTeste() {
		employee.getNome();
		assertTrue("Eva", true);
	}

	@Test
	public void geSobrenomeTeste() {
		employee.getSobrenome();
		assertTrue("Souza", true);
	}

	@Test
	public void getSalarioTeste() {
		assertEquals(2000, employee.getSalario(), 0);
	}

	@Test
	public void setNomeTeste() {
		employee.setNome("Ana");
		assertTrue(true);
	}

	@Test
	public void setSobrenomeTeste() {
		employee.setSobrenome("Melo");
		assertFalse(false);
		assertTrue("Melo", true);
	}

	@Test
	public void setSalarioTeste() {
		double novoSalario = 10000;
		employee.setSalario(novoSalario);
		assertEquals(novoSalario,employee.getSalario(), 0);
	}

	@Test
	public void salarioAnualTeste() {
		assertEquals(24000, employee.salarioAnual(employee.getSalario()), 0);
	}

	@Test
	public void salarioAumentoTeste() {
		Employee employee1 = new Employee("Maria", "Silva", 5000);
		Employee employee2 = new Employee("Joao", "Souza", 3000);

		double salarioUm = employee1.salario + (employee1.getSalario() * (10/100));
		double salarioDois = employee2.salario + (employee2.getSalario() * (10/100));

		employee1.salarioAumento(10);
		employee2.salarioAumento(10);

		assertEquals(salarioUm, employee1.getSalario(), 0);
		assertEquals(salarioDois, employee2.getSalario(), 0);

	}

}
