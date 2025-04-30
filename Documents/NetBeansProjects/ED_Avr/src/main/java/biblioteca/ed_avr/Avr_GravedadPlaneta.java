
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
}

