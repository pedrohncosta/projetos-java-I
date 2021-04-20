package ControleEstoqueBebidas;

public class Frio extends Estoque {
	private String validade;
	private double tempomaxcongelado;
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public double getTempomaxcongelado() {
		return tempomaxcongelado;
	}
	public void setTempomaxcongelado(double tempomaxcongelado) {
		this.tempomaxcongelado = tempomaxcongelado;
	}
	public Frio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
