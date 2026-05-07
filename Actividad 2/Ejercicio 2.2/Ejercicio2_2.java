package com.mycompany.ejercicio2.pagina66;

import java.util.Scanner;

public class Ejercicio2_2 {

    public static void main(String[] args) {

        String nombre;
        int cantidadSatélites;
        double masa;
        double volumen;
        int diámetro;
        int distanciaSol;
        Planeta.tipoPlaneta tipo;
        boolean esObservable;

        Scanner datos_entrada_teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre del planeta:");
        nombre = datos_entrada_teclado.next();

        System.out.println("Ingrese la cantidad de satélites:");
        cantidadSatélites = datos_entrada_teclado.nextInt();

        System.out.println("Ingrese la masa del planeta (kg):");
        masa = datos_entrada_teclado.nextDouble();

        System.out.println("Ingrese el volumen del planeta (km3):");
        volumen = datos_entrada_teclado.nextDouble();

        System.out.println("Ingrese el diámetro del planeta (km):");
        diámetro = datos_entrada_teclado.nextInt();

        System.out.println("Ingrese la distancia al sol (km):");
        distanciaSol = datos_entrada_teclado.nextInt();

        System.out.println("Ingrese el tipo de planeta (GASEOSO / TERRESTRE / ENANO):");
        tipo = Planeta.tipoPlaneta.valueOf(datos_entrada_teclado.next().toUpperCase());

        System.out.println("¿Es observable a simple vista? (true/false):");
        esObservable = datos_entrada_teclado.nextBoolean();

        Planeta planeta1 = new Planeta(nombre, cantidadSatélites, masa, volumen,
                                       diámetro, distanciaSol, tipo, esObservable);
        planeta1.mostrar_datos_personales();
        System.out.println("Densidad del planeta = " + planeta1.calcularDensidad());
        System.out.println("Es planeta exterior = " + planeta1.esPlanetaExterior());

    }
}
