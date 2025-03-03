package org.example;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if ((clock > 20 || clock < 8) && isBarking && (clock >= 0 && clock <=23)){
            return true;
        }else{
            return false;
        }
    }
    // return ((clock >= 8 && clock <= 20) && isBarking) ? true : false

    // return clock >= 0 && clock<=23 && (isBarking && (clock <8 || clock>=20))

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge>=13 && firstAge <=19) ||
                (secondAge >=13 && secondAge <=19) ||
                (thirdAge >=13 && thirdAge <=19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        return (isSummer) ? (temp >=25 && temp <=45) : (temp >=25 && temp <= 35);
    }

    public static double area(double width, double height) {
        return (width < 0 || height <0) ? -1 : width * height;
    }

    public static double area(double radius) {
        return (radius <0 ) ? -1 : radius*radius*Math.PI;
    }
}