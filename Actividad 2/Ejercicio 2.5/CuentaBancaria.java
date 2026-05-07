package com.mycompany.ejercicio2.pagina95;

public class CuentaBancaria {

    // Atributo que define los nombres del titular de la cuenta bancaria
    String nombresTitular;
    // Atributo que define los apellidos del titular de la cuenta bancaria
    String apellidosTitular;
    // Atributo que define el numero de la cuenta bancaria
    int numeroCuenta;
    // Atributo que define el tipo de cuenta bancaria
    TipoCuenta tipoCuenta;
    /* Atributo que define el saldo de la cuenta bancaria con valor inicial cero */
    float saldo = 0;

    // Constructor de la clase CuentaBancaria
    // @param nombresTitular   Parametro que define los nombres del titular
    // @param apellidosTitular Parametro que define los apellidos del titular
    // @param numeroCuenta     Parametro que define el numero de la cuenta bancaria
    // @param tipoCuenta       Parametro que define el tipo de cuenta (AHORROS o CORRIENTE)
    CuentaBancaria(String nombresTitular, String apellidosTitular,
                   int numeroCuenta, TipoCuenta tipoCuenta) {
        /* Tener en cuenta que no se pasa como parametro el saldo ya que inicialmente es cero */
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    // Metodo para mostrar caracteristicas de una instancia
    void mostrar_datos_personales() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Numero de cuenta = " + numeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
    }

    // Metodo que imprime en pantalla el saldo actual de una cuenta bancaria
    void consultarSaldo() {
        System.out.println("El saldo actual es = " + saldo);
    }

    // Metodo que actualiza y devuelve el saldo de una cuenta bancaria a
    // partir de un valor a consignar
    // @param valor Parametro que define el valor a consignar. Debe ser mayor que cero
    // @return Valor booleano que indica si el valor a consignar es valido o no
    boolean consignar(int valor) {
        // El valor a consignar debe ser mayor que cero
        if (valor > 0) {
            saldo = saldo + valor; /* Se actualiza el saldo con el valor consignado */
            System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }

    // Metodo que actualiza y devuelve el saldo de una cuenta bancaria a
    // partir de un valor a retirar
    // @param valor Parametro que define el valor a retirar. Debe ser mayor que cero
    //              y no debe superar el saldo actual
    // @return Valor booleano que indica si el valor a retirar es valido o no
    boolean retirar(int valor) {
        /* El valor debe ser mayor que cero y no debe superar el saldo actual */
        if ((valor > 0) && (valor <= saldo)) {
            saldo = saldo - valor; /* Se actualiza el saldo con el valor retirado */
            System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual.");
            return false;
        }
    }

    // Metodo que compara los saldos de dos cuentas bancarias y
    // muestra el resultado en pantalla
    // @param cuenta Parametro que define otra cuenta bancaria con la
    //               cual se va a comparar la cuenta bancaria actual
    void compararCuentas(CuentaBancaria cuenta) {
        /* Determina si el saldo de la cuenta actual es mayor o igual que
           el saldo de la otra cuenta */
        if (saldo >= cuenta.saldo) {
            System.out.println("El saldo de la cuenta actual es mayor o igual al saldo de la cuenta pasada como parametro.");
        } else {
            System.out.println("El saldo de la cuenta actual es menor al saldo de la cuenta pasada como parametro.");
        }
    }

    // Metodo que transfiere un valor de una cuenta a otra
    // @param cuenta Parametro que define otra cuenta bancaria a la
    //               cual se le va a transferir un valor
    // @param valor  Parametro que define el valor a transferir
    void transferencia(CuentaBancaria cuenta, int valor) {
        if (retirar(valor)) { // Si se puede retirar el valor de la cuenta actual
            cuenta.consignar(valor); /* Se realiza la consignacion en la otra cuenta */
        }
    }
}
