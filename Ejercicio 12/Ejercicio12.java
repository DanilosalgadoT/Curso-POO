/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;

/**
 *
 * @author danil
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        double horas_trabajadas = 48;
        double valor_hora = 5000;
        double retencion = 12.5;
        double porcentaje_retefuente = 12.5/100;
        double salario_bruto = Nomina.calcular_salario_bruto(horas_trabajadas, valor_hora);
        double valor_retefuente = Nomina.calcular_valor_retefuente (porcentaje_retefuente, salario_bruto);
        double salario_neto = Nomina.calcular_salario_neto(salario_bruto, valor_retefuente);
        
        System.out.println("Salario Bruto " + salario_bruto);
        System.out.println("Retencion en fuente " + valor_retefuente);
        System.out.println("Salario neto " + salario_neto );
    }
}
