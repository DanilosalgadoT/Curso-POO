package com.mycompany.ejercicio2.pagina63;

public class Persona {

    // Atributos de la clase Persona
    String nombre;
    String apellido;
    String númeroDocumentoIdentidad;
    int añoNacimiento;
    String paisNacimiento;
    char genero;

    // Constructor de instancias de la clase Persona
    Persona(String nombre, String apellido, String númeroDocumentoIdentidad,
            int añoNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    // Metodo para mostrar características de una instancia
    void mostrar_datos_personales() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Número de documento de identidad = " + númeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("País de nacimiento = " + paisNacimiento);
        System.out.println("Género = " + genero);
        System.out.println();
    }
}
