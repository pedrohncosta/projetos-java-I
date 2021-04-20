package ControleDeProdutos;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;


//Controle de mercadorias e serviços


public class main extends JFrame{
	static Mercadoria merc = new Mercadoria();
	static Servico serv = new Servico();
	static List<Produto> prod= new ArrayList<Produto>();
	Manipulador mani = new Manipulador();
	private JButton btnSearchS;
	private JTextField tfdnameM;
	private JTextField tfdcodeM;
	private JTextField tfdpeso;
	private JTextField tfdnameServ;
	private JTextField tfdcodeServ;
	private JTextField tfdvalorhora;
	private JTextField tfdSearchM;
	private JTextField tfdbuscarS;
	private JButton btnConfirmSearchServ;
	private JButton btnConfirmSearchM; 
	private JButton btnConfirmRegisterServ;
	private JButton btnConfirmRegisterM;
	private JButton btnRegisterMerc;
	private JButton btnRegisterServ;
	private JButton btnSearchM;
	private JButton btnLeave;
	private JButton btnreturn;
	private JPanel BuscarServicos;
	private JPanel BuscarMerc;
	private JPanel RegistrarServicos;
	private JPanel pnlCadastrarMerc;
	private JTextArea txAserv;
	private JTextArea txAMerc;
	
	public void clearFields()
	{
		tfdnameM.setText(null);
		tfdcodeM.setText(null);
		tfdpeso.setText(null);
		tfdbuscarS.setText(null);
		tfdcodeServ.setText(null);
		tfdnameServ.setText(null);
		tfdSearchM.setText(null);
		tfdvalorhora.setText(null);
		
	}
	public void registerMercadoria()
	{
		String aux="";
		int auxI=0;
		double auxD=0;
		aux = tfdnameM.getText();
		merc.setNome(aux);
		aux = tfdcodeM.getText();
		auxI=Integer.parseInt(aux);
		merc.setCodigo(auxI);
		aux = tfdpeso.getText();
		auxD = Double.parseDouble(aux);
		merc.setPeso(auxD);
		prod.add(merc);
	}
	
	public void registerServ()
	{
		String aux="";
		int auxI=0;
		double auxD=0;
		aux=tfdnameServ.getText();
		serv.setNome(aux);
		aux =tfdcodeServ.getText();
		auxI=Integer.parseInt(aux);
		serv.setCodigo(auxI);
		aux=tfdvalorhora.getText();
		auxD=Double.parseDouble(aux);
		serv.setValorHora(auxD);
		prod.add(serv);
	}
	
	public void searchM()
	{
		String aux = "";
		aux = tfdSearchM.getText();
		for(int i=0;i<prod.size();i++)
		{
			if(prod.get(i).getNome().equals(aux))
				{
					aux = "Nome: "+prod.get(i).getNome()+"\nCodigo: "+prod.get(i).getCodigo();
					txAMerc.setText(aux);
					break;
				}
		}
	}
	
	public void searchServ()
	{
		String aux = "";
		aux = tfdbuscarS.getText();
		for(int i=0;i<prod.size();i++)
		{
			if(prod.get(i).getNome().equals(aux))
				{
					aux = "Nome: "+prod.get(i).getNome()+"\nCodigo: "+prod.get(i).getCodigo();
					txAserv.setText(aux);
					break;
				}
		}
	}
	
	public main()
	{
		getContentPane().setLayout(null);
		
		BuscarServicos = new JPanel();
		BuscarServicos.setBounds(10, 21, 364, 317);
		BuscarServicos.setVisible(false);
		
		RegistrarServicos = new JPanel();
		RegistrarServicos.setBounds(10, 28, 364, 310);
		RegistrarServicos.setVisible(false);
		getContentPane().add(RegistrarServicos);
		RegistrarServicos.setLayout(null);
		
		JLabel lblNameS = new JLabel("Nome");
		lblNameS.setBounds(145, 11, 27, 14);
		RegistrarServicos.add(lblNameS);
		
		JLabel lblcodeS = new JLabel("Codigo");
		lblcodeS.setBounds(145, 56, 33, 14);
		RegistrarServicos.add(lblcodeS);
		
		JLabel lblvalorH = new JLabel("Valor da Hora");
		lblvalorH.setBounds(129, 107, 77, 14);
		RegistrarServicos.add(lblvalorH);
		
		tfdnameServ = new JTextField();
		tfdnameServ.setBounds(86, 25, 161, 20);
		RegistrarServicos.add(tfdnameServ);
		tfdnameServ.setColumns(10);
		
		tfdcodeServ = new JTextField();
		tfdcodeServ.setBounds(86, 76, 161, 20);
		RegistrarServicos.add(tfdcodeServ);
		tfdcodeServ.setColumns(10);
		
		tfdvalorhora = new JTextField();
		tfdvalorhora.setBounds(86, 132, 161, 20);
		RegistrarServicos.add(tfdvalorhora);
		tfdvalorhora.setColumns(10);
		
		btnConfirmRegisterServ = new JButton("Registrar");
		btnConfirmRegisterServ.setBounds(117, 199, 89, 23);
		btnConfirmRegisterServ.addActionListener(mani);
		RegistrarServicos.add(btnConfirmRegisterServ);
		getContentPane().add(BuscarServicos);
		BuscarServicos.setLayout(null);
		
		JLabel lblNomeSearchServ = new JLabel("Nome");
		lblNomeSearchServ.setBounds(136, 11, 46, 14);
		BuscarServicos.add(lblNomeSearchServ);
		
		tfdbuscarS = new JTextField();
		tfdbuscarS.setBounds(80, 36, 160, 20);
		BuscarServicos.add(tfdbuscarS);
		tfdbuscarS.setColumns(10);
		
		btnConfirmSearchServ = new JButton("Buscar");
		btnConfirmSearchServ.setBounds(117, 67, 89, 23);
		btnConfirmSearchServ.addActionListener(mani);
		BuscarServicos.add(btnConfirmSearchServ);
		
		txAserv = new JTextArea();
		txAserv.setEditable(false);
		txAserv.setBounds(10, 93, 344, 213);
		BuscarServicos.add(txAserv);
		
		BuscarMerc = new JPanel();
		BuscarMerc.setBounds(10, 25, 364, 313);
		BuscarMerc.setVisible(false);
		getContentPane().add(BuscarMerc);
		BuscarMerc.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(146, 11, 46, 14);
		BuscarMerc.add(lblNome);
		
		txAMerc = new JTextArea();
		txAMerc.setEditable(false);
		txAMerc.setBounds(30, 96, 306, 206);
		BuscarMerc.add(txAMerc);
		
		tfdSearchM = new JTextField();
		tfdSearchM.setBounds(71, 35, 203, 20);
		BuscarMerc.add(tfdSearchM);
		tfdSearchM.setColumns(10);
		
		btnConfirmSearchM = new JButton("Buscar");
		btnConfirmSearchM.setBounds(129, 66, 89, 23);
		btnConfirmSearchM.addActionListener(mani);
		BuscarMerc.add(btnConfirmSearchM);
		
		pnlCadastrarMerc = new JPanel();
		pnlCadastrarMerc.setBounds(10, 28, 364, 310);
		pnlCadastrarMerc.setVisible(false);
		getContentPane().add(pnlCadastrarMerc);
		pnlCadastrarMerc.setLayout(null);
		
		JLabel lblName = new JLabel("Nome");
		lblName.setBounds(150, 21, 46, 14);
		pnlCadastrarMerc.add(lblName);
		
		tfdnameM = new JTextField();
		tfdnameM.setBounds(58, 46, 221, 20);
		pnlCadastrarMerc.add(tfdnameM);
		tfdnameM.setColumns(10);
		
		JLabel lblCode = new JLabel("Codigo");
		lblCode.setBounds(150, 77, 46, 14);
		pnlCadastrarMerc.add(lblCode);
		
		tfdcodeM = new JTextField();
		tfdcodeM.setBounds(58, 102, 221, 20);
		pnlCadastrarMerc.add(tfdcodeM);
		tfdcodeM.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(150, 133, 36, 14);
		pnlCadastrarMerc.add(lblPeso);
		
		tfdpeso = new JTextField();
		tfdpeso.setBounds(58, 158, 221, 20);
		pnlCadastrarMerc.add(tfdpeso);
		tfdpeso.setColumns(10);
		
		btnConfirmRegisterM = new JButton("Cadastrar");
		btnConfirmRegisterM.setBounds(123, 220, 89, 23);
		btnConfirmRegisterM.addActionListener(mani);
		pnlCadastrarMerc.add(btnConfirmRegisterM);
		
		btnRegisterMerc = new JButton("Cadastrar Mercadoria");
		btnRegisterMerc.setBounds(109, 79, 152, 23);
		btnRegisterMerc.addActionListener(mani);
		getContentPane().add(btnRegisterMerc);
		
		btnRegisterServ = new JButton("Cadastrar Servi\u00E7os");
		btnRegisterServ.setBounds(109, 130, 152, 23);
		btnRegisterServ.addActionListener(mani);
		getContentPane().add(btnRegisterServ);
		
		btnSearchM = new JButton("Buscar Mercadoria");
		btnSearchM.setBounds(109, 181, 152, 23);
		btnSearchM.addActionListener(mani);
		getContentPane().add(btnSearchM);
		
		btnSearchS = new JButton("Buscar Servi\u00E7os");
		btnSearchS.setBounds(109, 242, 152, 23);
		btnSearchS.addActionListener(mani);
		getContentPane().add(btnSearchS);
		
		btnLeave = new JButton("Sair");
		btnLeave.setBounds(109, 297, 152, 23);
		btnLeave.addActionListener(mani);
		getContentPane().add(btnLeave);
		
		btnreturn = new JButton("Voltar");
		btnreturn.setBounds(131, 370, 89, 23);
		btnreturn.addActionListener(mani);
		btnreturn.setVisible(false);
		getContentPane().add(btnreturn);
		setBounds(200, 200, 400, 500);
		setVisible(true);
	}
	public class Manipulador implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==btnRegisterMerc)
			{
				
				pnlCadastrarMerc.setVisible(true);
				btnreturn.setVisible(true);
				btnLeave.setVisible(false);
				btnConfirmRegisterM.setVisible(true);
				btnConfirmRegisterServ.setVisible(false);
				btnConfirmSearchM.setVisible(false);
				btnConfirmSearchServ.setVisible(false);
				btnSearchM.setVisible(false);
				btnSearchS.setVisible(false);
				btnRegisterMerc.setVisible(false);
				btnRegisterServ.setVisible(false);
			}
			if(e.getSource()==btnRegisterServ)
			{
				RegistrarServicos.setVisible(true);
				btnreturn.setVisible(true);
				btnLeave.setVisible(false);
				btnConfirmRegisterM.setVisible(false);
				btnConfirmRegisterServ.setVisible(true);
				btnConfirmSearchM.setVisible(false);
				btnConfirmSearchServ.setVisible(false);
				btnSearchM.setVisible(false);
				btnSearchS.setVisible(false);
				btnRegisterMerc.setVisible(false);
				btnRegisterServ.setVisible(false);
			}
			if(e.getSource()==btnSearchM)
			{
				BuscarMerc.setVisible(true);
				btnreturn.setVisible(true);
				btnLeave.setVisible(false);
				btnConfirmRegisterM.setVisible(false);
				btnConfirmRegisterServ.setVisible(false);
				btnConfirmSearchM.setVisible(true);
				btnConfirmSearchServ.setVisible(false);
				btnSearchM.setVisible(false);
				btnSearchS.setVisible(false);
				btnRegisterMerc.setVisible(false);
				btnRegisterServ.setVisible(false);
			}
			if(e.getSource()==btnSearchS)
			{
				BuscarServicos.setVisible(true);
				btnreturn.setVisible(true);
				btnLeave.setVisible(false);
				btnConfirmRegisterM.setVisible(false);
				btnConfirmRegisterServ.setVisible(false);
				btnConfirmSearchM.setVisible(false);
				btnConfirmSearchServ.setVisible(true);
				btnSearchM.setVisible(false);
				btnSearchS.setVisible(false);
				btnRegisterMerc.setVisible(false);
				btnRegisterServ.setVisible(false);
			}
			if(e.getSource()==btnreturn)
			{
				pnlCadastrarMerc.setVisible(false);
				BuscarServicos.setVisible(false);
				BuscarMerc.setVisible(false);
				RegistrarServicos.setVisible(false);
				btnreturn.setVisible(false);
				btnLeave.setVisible(true);
				btnConfirmRegisterM.setVisible(false);
				btnConfirmRegisterServ.setVisible(false);
				btnConfirmSearchM.setVisible(false);
				btnConfirmSearchServ.setVisible(true);
				btnSearchM.setVisible(true);
				btnSearchS.setVisible(true);
				btnRegisterMerc.setVisible(true);
				btnRegisterServ.setVisible(true);

			}
			if(e.getSource()==btnLeave)
			{
				System.exit(0);
			}
			if(e.getSource()==btnConfirmRegisterM)
			{
				registerMercadoria();
				clearFields();
				
			}
			if(e.getSource()==btnConfirmRegisterServ)
			{
				registerServ();
				clearFields();
			}
			if(e.getSource()==btnConfirmSearchM)
			{
				searchM();
				clearFields();
			}
			if(e.getSource()==btnConfirmRegisterServ)
			{
				searchServ();
				clearFields();
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main();

	}
}
