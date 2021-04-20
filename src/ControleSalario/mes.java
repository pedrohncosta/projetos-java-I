package ControleSalario;

public class mes {
	private String nome;
	private double salario;
	private double gastos;
	private double impostos;

	public double Saldo() {
		
		return this.salario - this.impostos - this.gastos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getGastos() {
		return gastos;
	}
	public void setGastos(double gastos) {
		this.gastos = gastos;
	}
	public double getImpostos() {
		return impostos;
	}
	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
	public mes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
