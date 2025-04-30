
package biblioteca.ed_avr;

public class Persona_Avr {

    @Override
    public String toString() {
        return "Persona_Avr{" + "id=" + id + ", nombre=" + nombre + ", masa=" + masa + ", altura=" + altura + ", edad=" + edad + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona_Avr() {
    }

    public Persona_Avr(int id, String nombre, double masa, double altura, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.masa = masa;
        this.altura = altura;
        this.edad = edad;
    }
	private int id;
	private String nombre;
	private double masa;
        private double altura;
        private int edad;
}





