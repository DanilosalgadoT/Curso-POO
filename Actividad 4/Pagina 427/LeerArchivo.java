package com.mycompany.ejerciciopagina427;

import java.io.*;

public class LeerArchivo {

    public static String leer(String rutaArchivo) throws IOException {
        FileInputStream archivo = new FileInputStream(rutaArchivo);
        InputStreamReader conversor = new InputStreamReader(archivo);
        BufferedReader filtro = new BufferedReader(conversor);
        StringBuilder contenido = new StringBuilder();
        String linea = filtro.readLine();
        while (linea != null) {
            contenido.append(linea).append("\n");
            linea = filtro.readLine();
        }
        filtro.close();
        return contenido.toString();
    }
}
