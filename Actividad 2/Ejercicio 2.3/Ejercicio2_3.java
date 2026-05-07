package com.mycompany.ejercicio2.pagina73;

import java.util.Scanner;

public class Ejercicio2_3 {

    public static void main(String[] args) {

        String marca;
        int modelo;
        int motor;
        TipoCombustible tipoCombustible;
        TipoAutomovil tipoAutomovil;
        int númeroPuertas;
        int cantidadAsientos;
        int velocidadMáxima;
        TipoColor color;

        Scanner datos_entrada_teclado = new Scanner(System.in);

        System.out.println("Ingrese la marca del automóvil:");
        marca = datos_entrada_teclado.next();

        System.out.println("Ingrese el modelo (año de fabricación):");
        modelo = datos_entrada_teclado.nextInt();

        System.out.println("Ingrese el motor (litros de cilindraje):");
        motor = datos_entrada_teclado.nextInt();

        System.out.println("Ingrese el tipo de combustible (GASOLINA / BIOETANOL / DIESEL / BIODIESEL / GAS_NATURAL):");
        tipoCombustible = TipoCombustible.valueOf(datos_entrada_teclado.next().toUpperCase());

        System.out.println("Ingrese el tipo de automóvil (CIUDAD / SUBCOMPACTO / COMPACTO / FAMILIAR / EJECUTIVO / SUV):");
        tipoAutomovil = TipoAutomovil.valueOf(datos_entrada_teclado.next().toUpperCase());

        System.out.println("Ingrese el número de puertas:");
        númeroPuertas = datos_entrada_teclado.nextInt();

        System.out.println("Ingrese la cantidad de asientos:");
        cantidadAsientos = datos_entrada_teclado.nextInt();

        System.out.println("Ingrese la velocidad máxima (km/h):");
        velocidadMáxima = datos_entrada_teclado.nextInt();

        System.out.println("Ingrese el color (BLANCO / NEGRO / ROJO / NARANJA / AMARILLO / VERDE / AZUL / VIOLETA):");
        color = TipoColor.valueOf(datos_entrada_teclado.next().toUpperCase());

        Automovil auto1 = new Automovil(marca, modelo, motor, tipoCombustible,
                                        tipoAutomovil, númeroPuertas, cantidadAsientos,
                                        velocidadMáxima, color);

        auto1.mostrar_datos_personales();

        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

        auto1.desacelerar(20);
    }
}
