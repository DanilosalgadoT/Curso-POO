package com.mycompany.ejercicio2.pagina86;

import java.util.Scanner;

public class Ejercicio2_4 {

    public static void main(String[] args) {

        int radioCirculo;
        int baseRectangulo;
        int alturaRectangulo;
        int ladoCuadrado;
        int baseTriangulo;
        int alturaTriangulo;

        Scanner datos_entrada_teclado = new Scanner(System.in);

        // Datos del circulo
        System.out.println("Ingrese el radio del circulo (cm):");
        radioCirculo = datos_entrada_teclado.nextInt();

        // Datos del rectangulo
        System.out.println("Ingrese la base del rectangulo (cm):");
        baseRectangulo = datos_entrada_teclado.nextInt();
        System.out.println("Ingrese la altura del rectangulo (cm):");
        alturaRectangulo = datos_entrada_teclado.nextInt();

        // Datos del cuadrado
        System.out.println("Ingrese el lado del cuadrado (cm):");
        ladoCuadrado = datos_entrada_teclado.nextInt();

        // Datos del triangulo rectangulo
        System.out.println("Ingrese la base del triangulo rectangulo (cm):");
        baseTriangulo = datos_entrada_teclado.nextInt();
        System.out.println("Ingrese la altura del triangulo rectangulo (cm):");
        alturaTriangulo = datos_entrada_teclado.nextInt();

        // Crear los objetos
        Circulo figura1 = new Circulo(radioCirculo);
        Rectangulo figura2 = new Rectangulo(baseRectangulo, alturaRectangulo);
        Cuadrado figura3 = new Cuadrado(ladoCuadrado);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(baseTriangulo, alturaTriangulo);

        // Resultados del circulo
        System.out.println("El area del circulo es = " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerimetro());
        System.out.println();

        // Resultados del rectangulo
        System.out.println("El area del rectangulo es = " + figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerimetro());
        System.out.println();

        // Resultados del cuadrado
        System.out.println("El area del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();

        // Resultados del triangulo rectangulo
        System.out.println("El area del triangulo es = " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }
}
