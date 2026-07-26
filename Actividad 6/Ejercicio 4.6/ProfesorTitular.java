package com.mycompany.ejercicio4punto6pagina239;

public class ProfesorTitular extends Profesor {

    int años = 0;

    @Override
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }

    protected void imprimirAños() {
        System.out.println("Años = " + años);
    }
}
