
package biblioteca.ed_avr;

import static biblioteca.ed_avr.Main.CalcularPeso;
import static biblioteca.ed_avr.Main.CalcularPeso2;
import static biblioteca.ed_avr.Main.CalcularPeso3;

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

        public static double IMC3(Persona_Avr pers3, Avr_GravedadPlaneta plan3) {
        double pesoJupiter = CalcularPeso3(pers3, plan3);
        return pesoJupiter;
    }

    public static double IMC2(Persona_Avr pers2, Avr_GravedadPlaneta plan2) {
        double pesoMarte = CalcularPeso2(pers2, plan2);
        return pesoMarte;
    }

    public static double IMC1(Persona_Avr pers1, Avr_GravedadPlaneta plan1) {
        double pesoTierra = CalcularPeso(pers1, plan1);
        return pesoTierra;
    }


}








