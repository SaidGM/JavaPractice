package com.company;

public class SwitchCase {
    public static void main(String[] args) {


        String weather = "sunny";

        switch (weather){

            case "sunny":
                System.out.println("El tiempo dice q hace sol");
                break;
            case "cloudy":
                System.out.println("El tiempo dice q esta nublado");
                break;
            default:
                System.out.println("Ne se ha podido conetar a la red");
                break;

        }

    }
}
