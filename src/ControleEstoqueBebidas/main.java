package ControleEstoqueBebidas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//Controle de estoque de produtos frios e bebidas

public class main {
	static Frio obj = new Frio();
	static Bebida beb = new Bebida();
	static List<Estoque> produtos = new ArrayList<Estoque>();
	public static void InserirFrio()
	{
		String aux ="";
		double auxD=0;
		int auxI=0;
		
		aux = JOptionPane.showInputDialog("Digite o nome do produto");
		obj.setNome(aux);
		aux = JOptionPane.showInputDialog("Digite a quantidade do estoque minimo");
		auxI=Integer.parseInt(aux);
		obj.setQtdminima(auxI);
		aux = JOptionPane.showInputDialog("Digite a quantidade do estoque atual");
		auxI=Integer.parseInt(aux);
		obj.setQtdatual(auxI);
		aux = JOptionPane.showInputDialog("Digite a valida do produto");
		obj.setValidade(aux);
		aux = JOptionPane.showInputDialog("Digite o tempo max de congelamento");
		auxD=Double.parseDouble(aux);
		obj.setTempomaxcongelado(auxD);
		produtos.add(obj);
	}
	public static void InserirBebida()
	{
		String aux ="";
		double auxD=0;
		int auxI=0;
		aux = JOptionPane.showInputDialog("Digite o nome do produto");
		beb.setNome(aux);
		aux = JOptionPane.showInputDialog("Digite a quantidade do estoque minimo");
		auxI=Integer.parseInt(aux);
		beb.setQtdminima(auxI);
		aux = JOptionPane.showInputDialog("Digite a quantidade do estoque atual");
		auxI=Integer.parseInt(aux);
		beb.setQtdatual(auxI);
		aux = JOptionPane.showInputDialog("Digite o volume");
		auxD=Double.parseDouble(aux);
		beb.setVolume(auxD);
		auxI = JOptionPane.showConfirmDialog(null, "A bebida é alcoolica?");
		if(auxI==0)
		{
			beb.setAlcoolico(true);
		}
		else
		{
			beb.setAlcoolico(false);
		}
		produtos.add(beb);
	}
	public static void Search()
	{
		String aux="";
		aux = JOptionPane.showInputDialog("Digite o nome que você deseja:");
		for(int i=0;i<produtos.size();i++)
		{
			if(aux.equals(produtos.get(i).getNome()))
			{
				JOptionPane.showMessageDialog(null, "Produto encontrado\n"+produtos.get(i));
				break;
			}
		}
	}
	public static void aumentarestoq()
	{
		String aux="",auxT="";
		int auxI,calc1;
		aux = JOptionPane.showInputDialog("Digite o nome do produto");
		for(int i=0;i<produtos.size();i++)
		{
			if(aux.equals(produtos.get(i).getNome()))
			{
				auxT= JOptionPane.showInputDialog("Digite o quanto deseja aumentar");
				auxI = Integer.parseInt(auxT);
				calc1 = auxI+produtos.get(i).getQtdatual();
				produtos.get(i).setQtdatual(calc1);
				break;
			}
		}
	}
	public static void diminuirestoq()
	{
		String aux="",auxT="";
		int auxI,calc1;
		aux = JOptionPane.showInputDialog("Digite o nome do produto");
		for(int i=0;i<produtos.size();i++)
		{
			if(aux.equals(produtos.get(i).getNome()))
			{
				auxT= JOptionPane.showInputDialog("Digite o quanto deseja aumentar");
				auxI = Integer.parseInt(auxT);
				calc1 = produtos.get(i).getQtdatual()-auxI;
				produtos.get(i).setQtdatual(calc1);
				break;
			}
		}
	}
	public static void estoquemin()
	{
		for(int i=0;i<produtos.size();i++)
		{
			if(produtos.get(i).precisaRepor())
			{
				JOptionPane.showMessageDialog(null, "Produto\n"+produtos.get(i));
			}
		}
	}
	public static void main(String[] args) {
		String aux = "";
		int menu=0,sair=1;
		
		while(sair==1)
		{
			aux = JOptionPane.showInputDialog("Menu\n1- Inserir um frio\n2- Inserir uma bebida\n3-Buscar por nome\n4-Aumentar Estoque\n5- Reduzir estoque\n6-Estoque minimo\n7-Sair");
			menu=Integer.parseInt(aux);
			switch (menu)
			{
			case 1:
				InserirFrio();
				break;
			case 2:
				InserirBebida();
				break;
			case 3:
				Search();
				break;
			case 4:
				aumentarestoq();
				break;
			case 5:
				diminuirestoq();
				break;
			case 6:
				estoquemin();
				break;
			case 7:
				sair=0;
				break;
			}
		}

	}

}
