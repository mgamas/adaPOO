package POO.exercice2;

public class Rectangulo extends Forma {
    private double largo;
    private double ancho;

    public Rectangulo(String color, double largo, double ancho) {
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }
}
