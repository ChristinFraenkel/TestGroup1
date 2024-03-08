package de.neuefische;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int calcSum(int a, int b){
        return a+b;
    }

    public static boolean isEven(int a){
        if (a%2==0){
            return true;
        }
        return false;
    }

    public static int calcProd(int a, int b){
        return a*b;
    }

    public static String stringUp(String str){
            return str.toUpperCase();
    }

    public static boolean checkPositive(int a){
        if(a > 0){
            return true;
        }
        return false;
    }
}