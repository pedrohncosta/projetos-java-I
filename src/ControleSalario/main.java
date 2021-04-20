package ControleSalario;

import javax.swing.JOptionPane;
//Programa de controle de salários, podendo exibir todas as informações inseridas, o maior saldo existente e a média dos salários

public class main {
	static mes Dados = new mes () ;
	static int valor = 4;
	static mes[] vetor = new mes [valor];
	
	public static void MaiorSaldo ()
	{
		mes maiorsaldo = vetor[0];
		
		for(int i=1;i<valor;i++)
		{
			if(maiorsaldo.Saldo()<vetor[i].Saldo())
				maiorsaldo = vetor[i];
		}
		JOptionPane.showMessageDialog(null, "Nome: "+maiorsaldo.getNome()+"\nasalario: "+maiorsaldo.getSalario()+"\ngastos: "+maiorsaldo.getGastos()+"\nimpostos: "+maiorsaldo.getImpostos()+"\nsaldo: "+maiorsaldo.Saldo());
	}
	public static void Media()
	{
		double salario=0,media;
		for(int i =0;i<valor;i++)
		{
			salario = salario + vetor[i].getSalario();
		}
		media = salario/valor;
		JOptionPane.showMessageDialog(null, "A media dos salários é: "+media);
	}
	public static void ExibirAll ()
	{
		for (int i=0; i<valor;i++)
		{
			JOptionPane.showMessageDialog(null, "Mes "+i+"\nNome: "+vetor[i].getNome()+"\nSaldo: "+vetor[i].Saldo());
		}
	}
	public static void main(String[] args) {
		int menu =0;
		double auxD =0;
		String aux="";
		
		
		for(int i=0;i<valor;i++)
		{
			Dados = new mes ();
			aux = JOptionPane.showInputDialog("Digite o nome:");
			Dados.setNome(aux);
			aux = JOptionPane.showInputDialog("Digite o salario: ");
			auxD = Double.parseDouble(aux);
			Dados.setSalario(auxD);
			aux = JOptionPane.showInputDialog("Digite os gastas:");
			auxD = Double.parseDouble(aux);
			Dados.setGastos(auxD);
			aux = JOptionPane.showInputDialog("Digite os impostos: ");
			auxD= Double.parseDouble(aux);
			Dados.setImpostos(auxD);
			vetor[i] = Dados;
		}
		aux = JOptionPane.showInputDialog("Menu\n1- Exibir os dados do mes com maior saldo\n2-Media entre os salarios\n3 - Exibir todos os meses");
		menu = Integer.parseInt(aux);
		switch(menu)
		{
		case 1:
			MaiorSaldo();
			break;
		case 2:
			Media();
			break;
		case 3:
			ExibirAll();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Error - Option not found");	
			break;
		}
}
}

