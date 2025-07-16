package POO.exercice1;

public class Empresa {
    public static void main(String[] args) {
        // Instancia directa
        Desarrollador dev = new Desarrollador("Ana", 28, 45000, "Java");
        Tester tester = new Tester("Luis", 30, 40000, "Funcionales");

        dev.trabajar(); // Polimorfismo dinámico
        dev.trabajar(6); // Sobrecarga
        dev.trabajar("Sistema de Ventas"); // Overload

        System.out.println();

        tester.trabajar(); // Polimorfismo dinámico
        tester.trabajar(4); // Sobrecarga
        tester.trabajar("Selenium", "App Móvil"); // Overload

        System.out.println();

        // Polimorfismo por sustitución
        Empleado emp1 = new Desarrollador("Carlos", 35, 50000, "Python");
        Empleado emp2 = new Tester("Laura", 26, 39000, "Automatizadas");

        emp1.trabajar(); // Llama al método de Desarrollador
        emp2.trabajar(); // Llama al método de Tester
    }
}


