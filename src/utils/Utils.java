package utils;

import java.util.Arrays;

public class Utils {

    public static int num = 6;
    public static String expectedResultDouble = " ";
    public static String actualResultDouble = " ";


    public static void printLine(){
        System.out.println("_________________________________________");

    }


    public static void task() {
        System.out.println("             Task " + num);
        num++;
    }


    public static void line() {
        System.out.println("\u2665" + "=====================================" + "\u2665");

    }

    public static void verify(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verify(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static String verify(double expected, double actual) {
        if (expectedResultDouble.equals(actualResultDouble)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
        return actualResultDouble;
    }

        public static int arrayLength(int a, int b){
        int count = 0;
        for (int i = a; i <= b; i++){
            count++;
        }
        return count;
    }

    //public static void printArray(int[] array){
    //    System.out.println(array[]);
    //}


    public static double formatDouble1(double number, int d){
        int num = (int) Math.round(number * Math.pow(10, d));
        number = num / Math.pow(10, d);
        return number;
    }

        public static void printArray(int[] array){
            System.out.println(Arrays.toString(array));
        }

        public static void printArray(double[] array){
            System.out.println(Arrays.toString(array));
        }

        public static void printArray(String[] array){
        System.out.println(Arrays.toString(array));
        }







}
