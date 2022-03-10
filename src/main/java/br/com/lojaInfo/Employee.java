package br.com.lojaInfo;

public class Employee {

	protected String nome;
	protected String sobrenome;
	protected double salario;


	public Employee(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if(salario > 0) {
			this.salario = salario;
		}
	}

	public double salarioAnual(double salario) {
		return salario * 12;
	}

	public void salarioAumento(int valorAumento) {
		double novoSalario = getSalario() + (getSalario() * (valorAumento/100));
		setSalario(novoSalario);
	}
}
