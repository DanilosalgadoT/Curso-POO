package com.mycompany.ejercicio2.pagina95;

import java.util.Scanner;

public class Ejercicio2_5 {

    public static void main(String[] args) {

        String nombresTitular1;
        String apellidosTitular1;
        int numeroCuenta1;
        TipoCuenta tipoCuenta1;

        String nombresTitular2;
        String apellidosTitular2;
        int numeroCuenta2;
        TipoCuenta tipoCuenta2;

        int valorConsignar1;
        int valorConsignar2;
        int valorTransferencia;

        Scanner datos_entrada_teclado = new Scanner(System.in);

        // Datos de la primera cuenta
        System.out.println("--- Cuenta 1 ---");
        System.out.println("Ingrese los nombres del titular:");
        nombresTitular1 = datos_entrada_teclado.next();

        System.out.println("Ingrese los apellidos del titular:");
        apellidosTitular1 = datos_entrada_teclado.next();

        System.out.println("Ingrese el numero de cuenta:");
        numeroCuenta1 = datos_entrada_teclado.nextInt();

        System.out.println("Ingrese el tipo de cuenta (AHORROS / CORRIENTE):");
        tipoCuenta1 = TipoCuenta.valueOf(datos_entrada_teclado.next().toUpperCase());

        // Datos de la segunda cuenta
        System.out.println("--- Cuenta 2 ---");
        System.out.println("Ingrese los nombres del titular:");
        nombresTitular2 = datos_entrada_teclado.next();

        System.out.println("Ingrese los apellidos del titular:");
        apellidosTitular2 = datos_entrada_teclado.next();

        System.out.println("Ingrese el numero de cuenta:");
        numeroCuenta2 = datos_entrada_teclado.nextInt();

        System.out.println("Ingrese el tipo de cuenta (AHORROS / CORRIENTE):");
        tipoCuenta2 = TipoCuenta.valueOf(datos_entrada_teclado.next().toUpperCase());

        // Crear los objetos
        CuentaBancaria cuenta1 = new CuentaBancaria(nombresTitular1, apellidosTitular1,
                                                    numeroCuenta1, tipoCuenta1);
        CuentaBancaria cuenta2 = new CuentaBancaria(nombresTitular2, apellidosTitular2,
                                                    numeroCuenta2, tipoCuenta2);

        // Consignar valores
        System.out.println("Ingrese el valor a consignar en la cuenta 1:");
        valorConsignar1 = datos_entrada_teclado.nextInt();
        cuenta1.consignar(valorConsignar1);

        System.out.println("Ingrese el valor a consignar en la cuenta 2:");
        valorConsignar2 = datos_entrada_teclado.nextInt();
        cuenta2.consignar(valorConsignar2);

        // Comparar cuentas
        cuenta1.compararCuentas(cuenta2);

        // Transferencia de cuenta1 a cuenta2
        System.out.println("Ingrese el valor a transferir de la cuenta 1 a la cuenta 2:");
        valorTransferencia = datos_entrada_teclado.nextInt();
        cuenta1.transferencia(cuenta2, valorTransferencia);

        // Consultar saldos finales
        cuenta1.consultarSaldo();
        cuenta2.consultarSaldo();
    }
}
