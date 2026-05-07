package com.mycompany.ejercicio2.pagina86;

public class Cuadrado {

    int lado; // Atributo que define el lado de un cuadrado

    // Constructor de la clase Cuadrado
    // @param lado Parametro que define la longitud del lado de un cuadrado
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // Metodo que calcula y devuelve el area de un cuadrado como el
    // lado elevado al cuadrado
    // @return Area de un Cuadrado
    double calcularArea() {
        return lado * lado;
    }

    // Metodo que calcula y devuelve el perimetro de un cuadrado como
    // cuatro veces su lado
    // @return Perimetro de un cuadrado
    double calcularPerimetro() {
        return (4 * lado);
    }
}
