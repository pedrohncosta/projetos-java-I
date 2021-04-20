package MetodosDiferenteDeCalculo;

//O programa contém diversos metódos, onde podemos escolher se um número informado é primo, perfeito, saber o fatorial dele, saber a posição de fibonacci e calcular equação do segundo grau.

import javax.swing.JOptionPane;

public class main {
	static Metodos Dados;
	public static void main(String[] args) {
		int menu, cont=0,auxI;
		String aux ="";
		while(cont==0)
		{
		aux = JOptionPane.showInputDialog("\t\t\tMenu\n1- Conferir se é primo\n2- Conferir se é perfeito\n3- Calc Fatorial\n4- Calc Fibonnaci\n5- Calc x1\n6-Calc x2\n7- Sair");
		menu = Integer.parseInt(aux);
		switch(menu)
		{
		case 1:
			Dados= new Metodos();
			aux = JOptionPane.showInputDialog("Informe o numero: ");
			auxI = Integer.parseInt(aux);
			Dados.setNum(auxI);
			if(Dados.primo()==true)
			{
				JOptionPane.showMessageDialog(null, "O numero é primo");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "O numero não é primo");
			}
			break;
		case 2:
			Dados= new Metodos();
			aux = JOptionPane.showInputDialog("Informe o numero: ");
			auxI=Integer.parseInt(aux);
			Dados.setNum(auxI);
			if(Dados.perfeito())
			{
				JOptionPane.showMessageDialog(null, "O número é perfeito");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "O número não é perfeito");
			}
			break;
		case 3:
			Dados = new Metodos();
			aux = JOptionPane.showInputDialog("Informe um número: ");
			auxI = Integer.parseInt(aux);
			Dados.setNum(auxI);
			aux = "O fatorial é "+Dados.fatorial();
			JOptionPane.showMessageDialog(null, aux);
			break;
		case 4:
			Dados = new Metodos();
			aux = JOptionPane.showInputDialog("Informe um número: ");
			auxI = Integer.parseInt(aux);
			Dados.setNum(auxI);
			aux = "O fibonacci é "+Dados.fibonacci();
			JOptionPane.showMessageDialog(null, aux);
			break;
		case 5:
			Dados = new Metodos();
			aux = JOptionPane.showInputDialog("Informe a: ");
			auxI = Integer.parseInt(aux);
			Dados.setNum(auxI);
			aux = JOptionPane.showInputDialog("Informe b: ");
			auxI = Integer.parseInt(aux);
			Dados.setNum2(auxI);
			aux = JOptionPane.showInputDialog("Informe c: ");
			auxI = Integer.parseInt(aux);
			Dados.setNum3(auxI);
			aux= "A primeira raiz é: "+ Dados.x1();
			JOptionPane.showMessageDialog(null, aux);
			break;
		case 6: 
			Dados = new Metodos();
			aux = JOptionPane.showInputDialog("Informe a: ");
			auxI = Integer.parseInt(aux);
			Dados.setNum(auxI);
			aux = JOptionPane.showInputDialog("Informe b: ");
			auxI = Integer.parseInt(aux);
			Dados.setNum2(auxI);
			aux = JOptionPane.showInputDialog("Informe c: ");
			auxI = Integer.parseInt(aux);
			Dados.setNum3(auxI);
			aux= "A segunda raiz é: "+ Dados.x2();
			JOptionPane.showMessageDialog(null, aux);
			break;
		case 7:
			cont=1;
			break;
		default:
			break;
		}
		}
	}

}
