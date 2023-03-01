package com.company;

public class WhileLoop {
    public static void main(String[] args) {


        boolean check = true;
        int count= 0;

        while(count < 10){
            count ++; // condition
            if(count == 6)
                break; //rompe el bucle desde la condicion colocada en el if
                //continue; //salta el valor 6 pero continua haciendo bucle
            System.out.println("Break " + count);
        }

        System.out.println("fin");
    }
}
