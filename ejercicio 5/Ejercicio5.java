/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author danil
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        double suma, x, y;
        suma =0;
        x=20;
        suma = suma + x;
        y = 40;
        x = x + Math.pow(y, 2);
        suma = suma + x/y;
        System.out.println("El valor de la x es: " + x );
        System.out.println("El valor de la y: " + y );
        System.out.println("El valor de la suma es: " + suma );
    }
}
