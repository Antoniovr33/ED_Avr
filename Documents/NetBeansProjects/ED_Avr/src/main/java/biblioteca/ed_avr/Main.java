
package biblioteca.ed_avr;


public class Main {
    public static void main(String[] args){
    
        Persona_Avr pers1 = new Persona_Avr(1, "Papa", 85, 1.75,22);
        Persona_Avr pers2 = new Persona_Avr(2, "Pepe", 75, 1.80,25);
        Persona_Avr pers3 = new Persona_Avr(3, "Paco", 65, 1.90,20);

        Avr_GravedadPlaneta plan1 = new Avr_GravedadPlaneta(1, "Tierra", 9.81);
        Avr_GravedadPlaneta plan2 = new Avr_GravedadPlaneta(2, "Marte", 3.72);
        Avr_GravedadPlaneta plan3 = new Avr_GravedadPlaneta(3, "Jupiter", 24.79);

        double pesoTierra = IMC1(pers1, plan1); 
        
        double pesoMarte = IMC2(pers2, plan2); 
        
        double pesoJupiter = IMC3(pers3, plan3); 
        
        
        MostrarInformacion(pers1, pers2, plan1, plan2, plan3, pesoTierra, pesoMarte, pers3, pesoJupiter);
    }

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

    public static void MostrarInformacion(Persona_Avr pers1, Persona_Avr pers2, Avr_GravedadPlaneta plan1, Avr_GravedadPlaneta plan2, Avr_GravedadPlaneta plan3, double pesoTierra, double pesoMarte, Persona_Avr pers3, double pesoJupiter) {
        //Imprimir Informacion
        
        System.out.println(pers1);
        System.out.println("El IMC de la persona"+pers1.getNombre()+"es...");
        System.out.println(pers2);
        System.out.println("El IMC de la persona"+pers2.getNombre()+"es...");
        System.out.println(plan1);
        System.out.println(plan2);
        System.out.println(plan3);
        System.out.println("Peso "+ pers1.getNombre()+" en Tierra: "+pesoTierra);
        System.out.println("Peso "+ pers2.getNombre()+" en Marte: "+pesoMarte);
        System.out.println("Peso "+ pers3.getNombre()+" en Jupiter: "+pesoJupiter);
    }
}
