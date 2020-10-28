package main;

public class Retangulo extends Forma{
	
	private int base;
	  private int altura;

	  public Retangulo(int base, int altura) {
	    this.base = base;
	    this.altura = altura;
	  }

	  public double obterArea() {
	    return this.base * this.altura;
	  }
	  
	  public  double calcularPerimetro() {
			
			return this.base * 2 + this.altura *2;
		
		}
	  
	  public  String getNome() {
			
			return "Retangulo!";
		
		}

}
