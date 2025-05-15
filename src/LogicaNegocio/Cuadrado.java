package LogicaNegocio;

public class Cuadrado extends Figura {
    //Atributos
    private int lado;

    //Constructores

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public Cuadrado() {
        this.lado = 0;
    }

    //Get y Set

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    //Metodos heredados
    @Override
    public float area() {
        return lado * lado;
    }

    @Override
    public float perimetro() {
        return 4*lado;
    }



}
