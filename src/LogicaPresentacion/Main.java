package LogicaPresentacion;

import LogicaNegocio.Circulo;
import LogicaNegocio.Cuadrado;
import LogicaNegocio.Figura;
import LogicaNegocio.Rectangulo;

public class Main {

    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(5);
        Figura rectangulo = new Rectangulo(5, 8);
        Figura circulo = new Circulo(5);

        calcularOperaciones(cuadrado);

        calcularOperaciones(rectangulo);

        calcularOperaciones(circulo);


    }

    //calcular el área y el perímetro
    // de cualquier figura sin importar su tipo
    public static void calcularOperaciones(Figura figura) {
        System.out.println(figura);
        if (figura instanceof Circulo) {

            String perimetro = String.format("%.2f", figura.perimetro());
            String area = String.format("%.2f", figura.area());

            System.out.println("Perimetro: " + perimetro + " u"
                    + "\nArea: " + area + " u");
        } else {
            System.out.println("Area: " + figura.area() + " u");
            System.out.println("Perimetro: " + figura.perimetro() + " u");
        }

    }

}
