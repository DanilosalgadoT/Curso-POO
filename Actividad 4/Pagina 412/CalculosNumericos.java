/*
 * Ejercicio 6.6 - Catchs múltiples
 * Clase CálculosNuméricos adaptada para interfaz gráfica JFrame
 */
package com.mycompany.ejerciciopagina412;

import java.util.InputMismatchException;

/**
 * Esta clase denominada CálculosNuméricos permite realizar dos
 * cálculos matemáticos: calcular el logaritmo neperiano de un valor y
 * calcular la raíz cuadrada de un valor.
 */
public class CalculosNumericos {

    public static String calcularLogaritmoNeperiano(double valor) {
        try {
            if (valor <= 0) {
                throw new ArithmeticException("El valor debe ser un número positivo");
            }
            double resultado = Math.log(valor);
            return String.format("%.6f", resultado);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("El valor debe ser positivo para calcular el logaritmo");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("El valor debe ser numérico para calcular el logaritmo");
        }
    }

    public static String calcularRaizCuadrada(double valor) {
        try {
            if (valor < 0) {
                throw new ArithmeticException("El valor debe ser un número positivo");
            }
            double resultado = Math.sqrt(valor);
            return String.format("%.6f", resultado);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("El valor debe ser positivo para calcular la raíz cuadrada");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("El valor debe ser numérico para calcular la raíz cuadrada");
        }
    }
}
