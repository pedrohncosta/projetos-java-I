package ControleEstoqueBebidas;

public class Estoque {
	private String nome;
	private int qtdatual;
	private int qtdminima;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdatual() {
		return qtdatual;
	}
	public void setQtdatual(int qtdatual) {
		this.qtdatual = qtdatual;
	}
	public int getQtdminima() {
		return qtdminima;
	}
	public void setQtdminima(int qtdminima) {
		this.qtdminima = qtdminima;
	}
	public boolean precisaRepor()
	{
		if(this.qtdatual>this.qtdminima)
			return false;
		else
			return true;
	}
	public Estoque() {
		super();
		// TODO Auto-generated constructor stub
	}
}
