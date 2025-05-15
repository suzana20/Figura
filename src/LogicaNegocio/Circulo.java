package LogicaNegocio;

public class Circulo extends Figura{
    //Atributos
    private int radio;

    //Constructores

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo() {
        this.radio = 0;
    }
    //Get y set

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    //Metodos heredados

    @Override
    public float area() {
        return (float) (Math.PI*radio*radio); //se pone f al final pq el area maneja double
                                    //y 3,1416 es float
    }

    @Override
    public float perimetro() {
        return (float) (2*Math.PI*radio);
    }
}
