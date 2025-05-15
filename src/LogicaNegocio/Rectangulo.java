package LogicaNegocio;

public class Rectangulo extends Figura {

    //Atributos

    private int ancho;
    private int largo;

    //Constructores

    public Rectangulo(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public Rectangulo() {
        this.ancho = 0;
        this.largo = 0;
    }

    //Get y set

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    //Metodos heredados

    @Override
    public float area() {
        return ancho * largo;
    }

    @Override
    public float perimetro() {
        return 2 * ancho + 2 * largo;
    }

    @Override
    public String toString() {
        return "---- Rectangulo ----"
                + "\nAncho: " + ancho+" u"
                + "\nLargo: " + largo+" u";
    }
}
