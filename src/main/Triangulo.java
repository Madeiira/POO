package main;

public class Triangulo extends Forma {
	
	private int lado;

	  public Triangulo(int lado) {
	    this.lado = lado;
	  }
	  
	  public double obterArea() {
		    return ((this.lado * this.lado) * 1.732)/4;  //Preferi usar um valor aproximado pra limitar as casas decimais professor, invés de usar o math.squart(3);
		  }
	  
	  public  double calcularPerimetro() {
			
			return this.lado * 3;
		
		}
	  
	  public  String getNome() {
			
			return "Triangulo!";
		
		}

}
