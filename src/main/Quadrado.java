package main;

public class Quadrado extends Forma {

	private int lado;

	  public Quadrado(int lado) {
	    this.lado = lado;
	  }
	  
	  public double obterArea() {
		    return this.lado * this.lado;
		  }
	  
	  public  double calcularPerimetro() {
			
			return this.lado * 4;
		
		}
	  
	  public  String getNome() {
			
			return "Quadrado!";
		
		}
		
}
