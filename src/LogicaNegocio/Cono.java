package LogicaNegocio;

public class Cono implements Figura3D {

    // Atributos

    double altura;
    double radio;
    double gereatriz;

    //Metodos heradados

    @Override
    public double area() {
        double hipotenusa = Math.sqrt((altura * altura) + (radio * radio));

        return pi * radio * (radio+hipotenusa);
    }

    @Override
    public double volumen() {
        return (pi * radio * radio * altura) / 3;
    }

}
