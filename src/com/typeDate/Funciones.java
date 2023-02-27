package com.typeDate;

public class Funciones {
    public static void main(String[] args) {

        holaMundo();
        holaMundo("Pepe");
        holaMundo("Jhon");
        String hola = devolverTexto();
        System.out.println(hola);

    }

    private static void holaMundo() {
        System.out.println("Hola Mundo desde un metodo");

    }

    private static void holaMundo(String name){
        System.out.println("Hola " + name);
    }

    private static String devolverTexto(){
        return "Hola desde las consola";
    }
}
