package SimulacaoCampoFutebol;

//Simula um campo de futebol com os jogadores na posição que o usuário escolher.

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main extends JFrame {
	static Jogador novo;
	static Jogador[] vetor= new Jogador[10];
	public main()
	{
		setLayout(null);
		setBounds(20,20,600,600);
		setVisible(true);
	}
	public static void InserirJ()
	{
		String aux="";
		int auxI;
		for(int i=0;i<10;i++)
		{
			novo = new Jogador();
			aux = JOptionPane.showInputDialog("Digite o nome do jogador: ");
			novo.setNome(aux);
			aux =JOptionPane.showInputDialog("Digite a posição do jogador em x: ");
			auxI = Integer.parseInt(aux);
			novo.setX(auxI);
			aux = JOptionPane.showInputDialog("Digite a posição do jogador em y: ");
			auxI = Integer.parseInt(aux);
			novo.setY(auxI);
			aux = JOptionPane.showInputDialog("Digite o nome do time do jogador: ");
			novo.setNomeTime(aux);
			vetor[i] = novo;
		}
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawRect(100, 100, 500, 250);
		g.drawRect(100, 150, 100, 150);
		g.drawRect(500, 150, 100, 150);
		g.drawLine(350, 100, 350, 350);
		g.drawOval(325, 200, 50, 50);
		for(int i=0;i<10;i++)
		{
			g.drawOval(vetor[i].getX(), vetor[i].getY(), 3, 3);
			g.drawString(vetor[i].getNome(), vetor[i].getX(), vetor[i].getY()+15);
			g.drawString(vetor[i].getNomeTime(), vetor[i].getX(), vetor[i].getY()-10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InserirJ();
		new main();

	}

}
