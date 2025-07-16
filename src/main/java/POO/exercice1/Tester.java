package POO.exercice1;

public class Tester extends Empleado {
    private String tipoPruebas;

    public Tester(String nombre, int edad, double salario, String tipoPruebas) {
        super(nombre, edad, salario);
        this.tipoPruebas = tipoPruebas;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está realizando pruebas de tipo: " + tipoPruebas);
    }

    public void trabajar(String herramienta, String proyecto) {
        System.out.println(nombre + " está probando el proyecto " + proyecto + " usando la herramienta " + herramienta + " con pruebas de tipo " + tipoPruebas);
    }
}