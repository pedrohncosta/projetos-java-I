package MetodosDiferenteDeCalculo;

public class Metodos {
	private int Num;
	private int Num2;
	private int Num3;
	
	public double x2()
	{
		double resul=0, delta=0,raiz=0;
		delta=(Num2*Num2)-(4*Num*Num3);
		raiz = Math.sqrt(delta);
		resul = ((Num2*-1)-raiz)/(2*Num);
		return resul;
	}
	
	public double x1()
	{
		double resul=0, delta=0,raiz=0;
		delta=(Num2*Num2)-(4*Num*Num3);
		raiz = Math.sqrt(delta);
		resul = ((Num2*-1)+raiz)/(2*Num);
		return resul;
	}
	
	public int fibonacci()
	{
		int a=0,b=1, aux;
		// 0 - 1 - 1 - 2 - 3 - 5 - 8 - 13 ....
		if(Num==1)
			return a;
		else{
		for(int i=0;i<Num;i++)
		{
			aux = b;
			b = a+b;
			a = aux;
		}
		return a;
		}
	}
	
	public int fatorial()
	{
		int fatorial=1;
		for(int i=1;i<=Num;i++)
		{
			fatorial= fatorial*i;
		}
		return fatorial;
	}
	
	public boolean perfeito()
	{
		int soma=0;
		for(int i=1;i<Num;i++)
		{
			if(Num%i==0)
			{
				soma=soma+i;
				
			}
		}
		if(soma==Num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean primo()
	{
		int teste=0;
		for(int i=1;i<=Num;i++)
			{
				if(Num%i==0)
				{
					teste++;
				}
			}
		 if(teste <=2)
		 {
			 return true;
		 }
		 else 
		 {
			 return false;
		 }
	}
	
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public int getNum2() {
		return Num2;
	}
	public void setNum2(int num2) {
		Num2 = num2;
	}
	public int getNum3() {
		return Num3;
	}
	public void setNum3(int num3) {
		Num3 = num3;
	}
	public Metodos() {
		super();
		// TODO Auto-generated constructor stub
	}
}
