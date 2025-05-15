package LogicaPresentacion;

import LogicaNegocio.Circulo;
import LogicaNegocio.Cuadrado;
import LogicaNegocio.Figura;
import LogicaNegocio.Rectangulo;

public class Main {
    //calcular el área y el perímetro
    // de cualquier figura sin importar su tipo
    public static void calcularOperaciones(Figura figura) {

        System.out.println(figura);

        // Se comprueba si la instancia de figura es una Figura tipo Circulo
        if (figura instanceof Circulo) {

            // Se formatean los decimales para conseguir un formato conciso de decimales.
            String perimetro = String.format("%.2f", figura.perimetro());
            String area = String.format("%.2f", figura.area());


            System.out.println("Perimetro: " + perimetro + " u"
                                + "\nArea: " + area + " u");
        } else {
            System.out.println("Area: " + figura.area() + " u");
            System.out.println("Perimetro: " + figura.perimetro() + " u");
        }

    }

    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(5);
        Figura rectangulo = new Rectangulo(5, 8);
        Figura circulo = new Circulo(5);

        calcularOperaciones(cuadrado);

        calcularOperaciones(rectangulo);

        calcularOperaciones(circulo);


    }

}
