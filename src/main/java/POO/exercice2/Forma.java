package POO.exercice2;

public abstract class Forma {
    protected String color;

    public Forma(String color) {
        this.color = color;
    }

    public abstract double calcularArea(); // Polimorfismo dinámico

    public double calcularArea(String mensaje) { // Polimorfismo estático (Overload)
        System.out.println(mensaje);
        return calcularArea(); // Llama al método abstracto sobrescrito por las subclases
    }
}