package ControleEstoqueBebidas;

public class Bebida extends Estoque{
	private double volume;
	private boolean alcoolico;
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public boolean isAlcoolico() {
		return alcoolico;
	}
	public void setAlcoolico(boolean alcoolico) {
		this.alcoolico = alcoolico;
	}
	public Bebida() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
