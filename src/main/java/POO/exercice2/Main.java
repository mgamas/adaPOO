package POO.exercice2;

public class Main {
    public static void main(String[] args) {
        // Polimorfismo por sustitución
        Forma f1 = new Circulo("Rojo", 5);
        Forma f2 = new Triangulo("Verde", 4, 6);
        Forma f3 = new Cuadrado("Azul", 3);
        Forma f4 = new Rectangulo("Amarillo", 2, 8);

        // Polimorfismo dinámico (Override)
        System.out.println("Área círculo: " + f1.calcularArea());
        System.out.println("Área triángulo: " + f2.calcularArea());

        // Polimorfismo estático (Overload)
        System.out.println("Área cuadrado: " + f3.calcularArea("Calculando área del cuadrado"));
        System.out.println("Área rectángulo: " + f4.calcularArea("Calculando área del rectángulo"));
    }
}