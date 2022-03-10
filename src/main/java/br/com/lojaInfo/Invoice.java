package br.com.lojaInfo;


public class Invoice {

	protected String numero;
	protected String descricao;
	protected int qtdeComprada;
	protected double precoItem;


	public Invoice(String numero, String descricao, int qtdeComprada, double precoItem) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.qtdeComprada = qtdeComprada;
		this.precoItem = precoItem;
	}


	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdeComprada() {
		return qtdeComprada;
	}

	public void setQtdeComprada(int qtdeComprada) {
		this.qtdeComprada = qtdeComprada;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}	

	public double getInvoiceAmount(int qtde, double preco) {
		if(qtde < 0) {
			qtde = 0;
		}
		if(preco < 0) {
			preco = 0.0;
		}
		return (preco * qtde);

	}

}
