package com.company;

public class Coche {

    // atributos

    String color;
    String fabricantee;
    String modelo;
    String peso;
    Double largo;
    Integer velocidad = 0 ;

    // contructores

    public Coche(String color, String fabricantee, String modelo, String peso, Double largo){
            this.color = color;
            this.fabricantee = fabricantee;
            this.modelo = modelo;
            this.peso = peso;
            this.largo = largo;
    }


    // comportamientos

    public void acelerar(Integer cantidad){

        if (cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }


    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fabricantee='" + fabricantee + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso='" + peso + '\'' +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
