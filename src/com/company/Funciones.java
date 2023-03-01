package com.company;

public class Funciones {
    public static void main(String[] args) {

        holaMundo("Pepe");
        holaMundo("Jhon");
        String hola = devolverTexto();
        System.out.println(hola);
        holaMundo("Martin", "Perez");

    }

    public static void holaMundo(String name) {
        System.out.println("Hola Mundo desde un metodo");
        System.out.println("Hola Mundo desde un metodo");
    }

    private static void holaMundo(String name, String nameTwo){
        System.out.println("Hola " + name + " " + nameTwo);
    }

    private static String devolverTexto(){
        return "Hola desde las consola";
    }
}
