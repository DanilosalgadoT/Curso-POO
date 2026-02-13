/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio17;

/**
 *
 * @author danil
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        double radio = 3;
        
        double longitud_circunferencia = Calculos.calcular_longitud_circunferencia(radio);
        double area_circulo = Calculos.calcular_area_circulo(radio);
        System.out.println("longitud circunferencia: " + longitud_circunferencia);
        System.out.println("area circulo : " + area_circulo);
    }
}
