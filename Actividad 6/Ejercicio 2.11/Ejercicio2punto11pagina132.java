/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2punto11pagina132;

/**
 *
 * @author danil
 */
public class Ejercicio2punto11pagina132 {

    public static void main(String[] args) {
        String[] palabras = {"Física","Espacio","Tiempo"};
        ArticuloCientifico artículo = new ArticuloCientifico("La teoría especial de la relatividad", "Albert Einstein",palabras, "Anales de Física", 1913, "Las leyes de la física son las mismas en todos los sistemas de referencia inerciales.");
        artículo.imprimir();
    }
}
