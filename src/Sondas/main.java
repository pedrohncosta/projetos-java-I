package Sondas;

//Simula a posição de duas sondas, o usuário é responsável por informar o x e o y

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class main extends JFrame{
	static Sonda Dados;
	static Sonda[] vetor = new Sonda[2];
	
	public static void Inserirdados()
	{
		String aux="";
		int auxI;
		for(int i = 0; i<2;i++)
		{
			Dados = new Sonda();
			aux = JOptionPane.showInputDialog("Digite o nome: ");
			Dados.setNome(aux);
			aux= JOptionPane.showInputDialog("Digite a longitude: ");
			auxI = Integer.parseInt(aux);
			Dados.setLongitude(auxI);
			aux=JOptionPane.showInputDialog("Digite a latitude: ");
			auxI= Integer.parseInt(aux);
			Dados.setLatitude(auxI);
			vetor[i] = Dados;
		}
	}
	public main() 
	{
		setLayout(null);
		setBounds(20,20,600,600);
		setVisible(true);
	}

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawOval(vetor[0].getLongitude(), vetor[0].getLatitude(), 6, 6);
		g.drawOval(vetor[1].getLongitude(), vetor[1].getLatitude(), 6, 6);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inserirdados();
		new main();
		
	}

}
