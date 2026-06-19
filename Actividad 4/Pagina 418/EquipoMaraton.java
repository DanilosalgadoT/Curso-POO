package com.mycompany.ejerciciopagina418;

public class EquipoMaraton {

    String nombreEquipo;
    String universidad;
    String lenguajeProgramacion;
    Programador[] programadores;
    int tamanoEquipo;

    EquipoMaraton(String nombreEquipo, String universidad, String lenguajeProgramacion) {
        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.tamanoEquipo = 0;
        this.programadores = new Programador[3];
    }

    boolean estaLleno() {
        return tamanoEquipo == programadores.length;
    }

    void anadir(Programador programador) throws Exception {
        if (estaLleno()) {
            throw new Exception("El equipo está completo. No se pudo agregar el programador.");
        }
        programadores[tamanoEquipo] = programador;
        tamanoEquipo++;
    }

    static void validarCampo(String campo) throws Exception {
        if (campo == null || campo.trim().isEmpty()) {
            throw new Exception("El campo no puede estar vacío.");
        }
        for (int j = 0; j < campo.length(); j++) {
            char c = campo.charAt(j);
            if (Character.isDigit(c)) {
                throw new Exception("El nombre no puede tener dígitos.");
            }
        }
        if (campo.length() > 20) {
            throw new Exception("La longitud no debe ser superior a 20 caracteres.");
        }
    }

    String resumen() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipo: ").append(nombreEquipo).append("\n");
        sb.append("Universidad: ").append(universidad).append("\n");
        sb.append("Lenguaje: ").append(lenguajeProgramacion).append("\n");
        sb.append("Integrantes (").append(tamanoEquipo).append("/3):\n");
        for (int i = 0; i < tamanoEquipo; i++) {
            sb.append("  ").append(i + 1).append(". ")
              .append(programadores[i].nombre).append(" ")
              .append(programadores[i].apellidos).append("\n");
        }
        return sb.toString();
    }
}
