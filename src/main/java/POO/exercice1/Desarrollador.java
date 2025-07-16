package POO.exercice1;


public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, int edad, double salario, String lenguajeProgramacion) {
        super(nombre, edad, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public void trabajar(){
        System.out.println(this.nombre + "esta trabajando en " + this.lenguajeProgramacion);
    }

    public void trabajar(String proyecto){
        System.out.println(this.nombre + "esta trabajando en el projecto " + proyecto + "usando" + this.lenguajeProgramacion);
    }
}