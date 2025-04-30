package prueba;

public class Main {

	public static void main(String[] args) {
		Avr_Circulo circulo1 = new Avr_Circulo(1, 3, "Naranja");
		Avr_Rectangulo rectangulo1 = new Avr_Rectangulo(1, 3, 5, "Verde");
		
		double areaCirculo = CalcularAreaCirculo(circulo1);
		
		double areaRectangulo = CalcularAreaRectangulo(rectangulo1);
		
		
		
		System.out.println(circulo1);
		System.out.println(rectangulo1);
		System.out.println("Area Circulo"+areaCirculo);
		System.out.println("Area Rectangulo"+areaRectangulo);
		
	}


	private static double CalcularAreaRectangulo(Avr_Rectangulo rectangulo1) {
		// Area rectangulo: 
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo1.getLadoB();
		double areaRectangulo = ladoA+ladoB;
		return areaRectangulo;
	}

	private static double CalcularAreaCirculo(Avr_Circulo circulo1) {
		//Calcular area Circulo: pi * r * r
		
		double radio = circulo1.getRadio();
		double pi = 3.14;
		double areaCirculo = radio * radio * pi;
		return areaCirculo;
	}

}
