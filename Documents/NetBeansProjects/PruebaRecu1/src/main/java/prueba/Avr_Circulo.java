package prueba;

public class Avr_Circulo {
	private int id;
	private double radio;
	private String color;

	
	public Avr_Circulo() {}
	
	public Avr_Circulo(int id, double radio, String color) {
		this.id = id;
		this.radio = radio;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Avr_Circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
	}

	
}

