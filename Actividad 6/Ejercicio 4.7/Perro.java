package com.mycompany.ejercicio4punto7pagina244;

public class Perro extends Canido {

    @Override
    public String getSonido() {
        return "Ladrido";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }
}
