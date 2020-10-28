package main;



public class main {
	
	
	
	
	
	public static void main(String args[]) {
		Forma formas = new Forma();
		
		Forma f1 = new Circulo(3);
		formas.adicionarForma(f1);
		
		Forma f2 = new Quadrado(3);
		formas.adicionarForma(f2);
		
		Forma f3 = new Triangulo(3);
		formas.adicionarForma(f3);
		
		Forma f4 = new Retangulo(3,1);
		formas.adicionarForma(f4);
		
		formas.obterFormas();
	}
}
