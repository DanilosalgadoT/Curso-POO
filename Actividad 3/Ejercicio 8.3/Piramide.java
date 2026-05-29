package com.mycompany.ejercicio8p3;

/**
 * Esta clase denominada Piramide es una subclase de FiguraGeometrica
 * que cuenta con una base, una altura y un apotema.
 * @version 1.2/2020
 */
public class Piramide extends FiguraGeometrica {

    private double base;    /* Atributo que identifica la base de una piramide */
    private double altura;  /* Atributo que identifica la altura de una piramide */
    private double apotema; /* Atributo que identifica el apotema de una piramide */

    // Constructor de la clase Piramide
    // @param base    Parametro de define la base de una piramide
    // @param altura  Parametro de define la altura de una piramide
    // @param apotema Parametro de define el apotema de una piramide
    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcularVolumen());      // Calcula el volumen y establece su atributo
        this.setSuperficie(calcularSuperficie()); // Calcula la superficie y establece su atributo
    }

    // Metodo para calcular el volumen de una piramide
    // @return El volumen de una piramide
    public double calcularVolumen() {
        double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
        return volumen;
    }

    // Metodo para calcular la superficie de una piramide
    // @return La superficie de una piramide
    public double calcularSuperficie() {
        double areaBase = Math.pow(base, 2.0);
        double areaLado = 2.0 * base * apotema;
        return areaBase + areaLado;
    }
}
