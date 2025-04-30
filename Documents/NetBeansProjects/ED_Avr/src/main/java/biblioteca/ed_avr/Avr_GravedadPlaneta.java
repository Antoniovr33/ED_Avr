
package biblioteca.ed_avr;

public class Avr_GravedadPlaneta {

    @Override
    public String toString() {
        return "Avr_GravedadPlaneta{" + "id=" + id + ", nombre=" + nombre + ", GravedadPlaneta=" + GravedadPlaneta + '}';
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

    public double getGravedadPlaneta() {
        return GravedadPlaneta;
    }

    public void setGravedadPlaneta(double GravedadPlaneta) {
        this.GravedadPlaneta = GravedadPlaneta;
    }

    public Avr_GravedadPlaneta(int id, String nombre, double GravedadPlaneta) {
        this.id = id;
        this.nombre = nombre;
        this.GravedadPlaneta = GravedadPlaneta;
    }

    public Avr_GravedadPlaneta() {
    }
	private int id;
	private String nombre;
	private double GravedadPlaneta;

        public static double CalcularPeso3(Persona_Avr pers3, Avr_GravedadPlaneta plan3) {
        //Calculo peso persona en tierra peso = masa por aceleracion
        double masaPersona3 = pers3.getMasa();
        double gravedadJupiter = plan3.getGravedadPlaneta();
        double pesoJupiter = masaPersona3*gravedadJupiter;
        return pesoJupiter;
    }

    public static double CalcularPeso2(Persona_Avr pers2, Avr_GravedadPlaneta plan2) {
        //Calculo peso persona en marte peso = masa por aceleracion
        double masaPersona2 = pers2.getMasa();
        double gravedadMarte = plan2.getGravedadPlaneta();
        double pesoMarte = masaPersona2*gravedadMarte;
        return pesoMarte;
    }

    public static double CalcularPeso(Persona_Avr pers1, Avr_GravedadPlaneta plan1) {
        //Calculo peso persona en tierra peso = masa por aceleracion
        double masaPersona = pers1.getMasa();
        double gravedadTierra = plan1.getGravedadPlaneta();
        double pesoTierra = masaPersona*gravedadTierra;
        return pesoTierra;
    }    
}

