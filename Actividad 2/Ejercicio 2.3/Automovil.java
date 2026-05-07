package com.mycompany.ejercicio2.pagina73;

public class Automovil {

    // Atributo que define la marca de un automóvil
    String marca;
    // Atributo que define el modelo de un automóvil
    int modelo;
    // Atributo que define el motor de un automóvil
    int motor;
    // Atributo que define el tipo de combustible
    TipoCombustible tipoCombustible;
    // Atributo que define el tipo de automóvil
    TipoAutomovil tipoAutomovil;
    // Atributo que define el número de puertas de un automóvil
    int númeroPuertas;
    // Atributo que define la cantidad de asientos de un automóvil
    int cantidadAsientos;
    // Atributo que define la velocidad máxima de un automóvil
    int velocidadMáxima;
    // Atributo que define el color de un automóvil
    TipoColor color;
    // Atributo que define la velocidad actual de un automóvil
    int velocidadActual = 0;

    // Constructor de instancias de la clase Automóvil
    Automovil(String marca, int modelo, int motor, TipoCombustible tipoCombustible,
              TipoAutomovil tipoAutomovil, int númeroPuertas, int cantidadAsientos,
              int velocidadMáxima, TipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.númeroPuertas = númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMáxima = velocidadMáxima;
        this.color = color;
    }

    // Metodo que devuelve la marca de un automóvil
    String getMarca() {
        return marca;
    }

    // Metodo que devuelve el modelo de un automóvil
    int getModelo() {
        return modelo;
    }

    // Metodo que devuelve el volumen en litros del cilindraje del motor
    int getMotor() {
        return motor;
    }

    // Metodo que devuelve el tipo de combustible utilizado por el motor
    TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    // Metodo que devuelve el tipo de automóvil
    TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    // Metodo que devuelve el número de puertas de un automóvil
    int getNúmeroPuertas() {
        return númeroPuertas;
    }

    // Metodo que devuelve la cantidad de asientos de un automóvil
    int getCantidadAsientos() {
        return cantidadAsientos;
    }

    // Metodo que devuelve la velocidad máxima de un automóvil
    int getVelocidadMáxima() {
        return velocidadMáxima;
    }

    // Metodo que devuelve el color de un automóvil
    TipoColor getColor() {
        return color;
    }

    // Metodo que devuelve la velocidad actual de un automóvil
    int getVelocidadActual() {
        return velocidadActual;
    }

    // Metodo que establece la marca de un automóvil
    void setMarca(String marca) {
        this.marca = marca;
    }

    // Metodo que establece el modelo de un automóvil
    void setModelo(int modelo) {
        this.modelo = modelo;
    }

    // Metodo que establece el volumen en litros del motor de un automóvil
    void setMotor(int motor) {
        this.motor = motor;
    }

    // Metodo que establece el tipo de combustible de un automóvil
    void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    // Metodo que establece el tipo de automóvil
    void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    // Metodo que establece el número de puertas de un automóvil
    void setNúmeroPuertas(int númeroPuertas) {
        this.númeroPuertas = númeroPuertas;
    }

    // Metodo que establece la cantidad de asientos de un automóvil
    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    // Metodo que establece la velocidad máxima de un automóvil
    void setVelocidadMáxima(int velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    // Metodo que establece el color de un automóvil
    void setColor(TipoColor color) {
        this.color = color;
    }

    // Metodo que establece la velocidad actual de un automóvil
    void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    // Metodo que incrementa la velocidad de un automóvil
    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMáxima) {
            // Si el incremento de velocidad no supera la velocidad máxima
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else {
            // De otra manera no se puede incrementar la velocidad y se genera mensaje
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
        }
    }

    // Metodo que decrementa la velocidad de un automóvil
    void desacelerar(int decrementoVelocidad) {
        // La velocidad actual no se puede decrementar alcanzando un valor negativo
        if ((velocidadActual - decrementoVelocidad) > 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            // De otra manera no se puede decrementar la velocidad y se genera mensaje
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }

    // Metodo que coloca la velocidad actual de un automóvil en cero
    void frenar() {
        velocidadActual = 0;
    }

    // Metodo que calcula el tiempo que tarda un automóvil en recorrer cierta distancia
    double calcularTiempoLlegada(int distancia) {
        return distancia / velocidadActual;
    }

    // Metodo para mostrar características de una instancia
    void mostrar_datos_personales() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + númeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMáxima);
        System.out.println("Color = " + color);
    }
}
