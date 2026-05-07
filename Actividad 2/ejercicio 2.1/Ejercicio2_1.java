package com.mycompany.ejercicio2.pagina63;

import java.util.Scanner;

public class Ejercicio2_1 {

    public static void main(String[] args) {

        String nombre;
        String apellido;
        String númeroDocumentoIdentidad;
        int añoNacimiento;
        String paisNacimiento;
        char genero;

        Scanner datos_entrada_teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre:");
        nombre = datos_entrada_teclado.next();

        System.out.println("Ingrese el apellido:");
        apellido = datos_entrada_teclado.next();

        System.out.println("Ingrese el numero de documento de identidad:");
        númeroDocumentoIdentidad = datos_entrada_teclado.next();

        System.out.println("Ingrese el año de nacimiento:");
        añoNacimiento = datos_entrada_teclado.nextInt();

        System.out.println("Ingrese el pais de nacimiento:");
        paisNacimiento = datos_entrada_teclado.next();

        System.out.println("Ingrese el genero (H/M):");
        genero = datos_entrada_teclado.next().charAt(0);

        Persona personal = new Persona(nombre, apellido, númeroDocumentoIdentidad,
                                       añoNacimiento, paisNacimiento, genero);
        personal.mostrar_datos_personales();

    }
}
