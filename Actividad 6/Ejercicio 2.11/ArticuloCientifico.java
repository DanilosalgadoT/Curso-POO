/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2punto11pagina132;


public class ArticuloCientifico {
    String título;
    String autor; 
    String[] palabrasClaves = new String[3];
    String publicación; 
    int año; 
    String resumen;
    
    
    public ArticuloCientifico(String título, String autor) {
        this.título = título;
        this.autor = autor;
    }
    
    public ArticuloCientifico(String título, String autor, String[] palabrasClaves, String publicación, int año) {
        this(título, autor); 
        this.palabrasClaves = palabrasClaves;
        this.publicación = publicación;
        this.año = año;
}
    public ArticuloCientifico(String título, String autor, String[] palabrasClaves, String publicación, int año, String resumen) {
        this(título, autor, palabrasClaves, publicación, año);
        this.resumen = resumen;
    }
    public void imprimir() {
        System.out.println("Título del artículo = " + título);
        System.out.println("Autor del artículo = " + autor);
        System.out.println("Palabras clave = ");
        for (int i = 0; i < palabrasClaves.length; i=i+1) {
            System.out.println(palabrasClaves[i]);
        }
        System.out.println("Publicación = " + publicación);
        System.out.println("Año = " + año);
        System.out.println("Resumen = " + resumen);
    }
}

    

