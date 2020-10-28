package main;

import java.util.ArrayList;
import java.util.List;

public  class Forma {
	
	public  double obterArea() {
	
		return 0;
	
	}
	
	public  double calcularPerimetro() {
	
		return 0;
	
	}
	
	public  String getNome() {
	
		return null;
	
	}
private List<Forma> formas = new ArrayList<Forma>();
	
	public void adicionarForma(Forma forma) {
		this.formas.add(forma);
	}
	public void obterFormas() {
		for(Forma forma : this.formas) {
			
			System.out.print("\n \n"+forma.getNome());
			System.out.print("\nResultado do perimetro: "+forma.calcularPerimetro());
			System.out.print("\nResultado da area: "+forma.obterArea());
		}
	}

}
