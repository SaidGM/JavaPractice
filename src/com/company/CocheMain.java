package com.company;

public class CocheMain {
    public static void main(String[] args) {


        String coche = "alfa romeo";

        //Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche("rojo", "onda", "ultimo", "154", 120.54);
        System.out.println(cocheObj2);

        cocheObj2.acelerar(119);
        System.out.println(cocheObj2);

        cocheObj2.peso = "135.0";
        System.out.println(cocheObj2);
    }
}
