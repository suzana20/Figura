package LogicaPresentacion;

import LogicaNegocio.Circulo;
import LogicaNegocio.Cuadrado;
import LogicaNegocio.Figura;
import LogicaNegocio.Rectangulo;

public class Main {
    //calcular el área y el perímetro
    // de cualquier figura sin importar su tipo
    public static void calcularOperaciones(Figura figura) {
        System.out.println("Area:" + figura.area());
        System.out.println("Perimetro:" + figura.perimetro());

    }

    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(5);
        Figura rectangulo = new Rectangulo(5, 8);
        Figura circulo = new Circulo(5);

        System.out.println("Cuadrado:");
        calcularOperaciones(cuadrado);
        System.out.println("Rectangulo:");
        calcularOperaciones(rectangulo);
        System.out.println("Circulo:");
        calcularOperaciones(circulo);


    }

}
