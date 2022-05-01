package lessons.lesson8;

import jdk.swing.interop.SwingInterOpUtils;

public class Lesson8 {

    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3};
        int[] arr1 = new int[3];
        int[] arr2 = {1, 2, 3};
        int[] arr4 = {};

        int[] arr5 = new int [1];
        int[] arr6 = {0};

        int[] arr7 = new int[3];
        int[] arr8 = {0, 0, 0};


        int a = 4;// лежит значение
        double b = 5.5;

        Integer intReg = 4;// лежит ссылка на обьект
        Integer intReg1 = 4;
        Double doubleReg = 5.5;

        //Integer intObject = new Integer(4);// depricated(устаревший). как выше - идентично
        //Double doubleObject = new Double(5.5);

        String str1 = "Hello";
        String str2 = "Hello";
        String strObject = new String ("Hello");
        System.out.println(str1==strObject); //false


        System.out.println(str1==str2);//true
        System.out.println(intReg==intReg1);//true


        String cat1 = "Cat";
        String cat2 = "Cat";
        String cat3 = new String("Cat");
        String cat4 = new String("Cat");
        String dog1 = new String("Dog");
        String dog2 = "Dog";

        System.out.println(cat3 == cat4);
        System.out.println("Cats");
        System.out.println(cat1 == Lesson8_1.cat1_1);


        System.out.println(dog1.equals(Lesson8_1.dog1_1));





    }


}
