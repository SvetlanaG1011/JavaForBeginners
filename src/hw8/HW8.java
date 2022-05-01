package hw8;

import java.util.Arrays;

import static utils.Utils.*;

import static utils.Utils.line;

public class HW8 {

    public static int[] arrayIntReturn(int a, int b, int c, int d, int e) {

        int[] array = new int[5];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;
        array[4] = e;

        return array;
    }

    public static int[] array7(int a, int b, int c, int d, int e) {
        int[] array7 = {a, b, c, d, e};

        return array7;

    }

    public static double[] arrayDouble(double a, double b, double c, double d, double e) {
        double[] arrayDouble = {a, b, c, d, e};

        return arrayDouble;
    }

    public static String[] arrayString(String a, String b, String c, String d, String e) {
        String[] arrayString = {a, b, c, d, e};

        return arrayString;
    }

    public static double[] array10(int[] array) {

        double[] array2 = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i] * 2.5;

        }

        return array2;
    }

    public static int method11(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count++;

    }

    public static int[] method12(int[] array) {
        int oddNumQuantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array.length != 0) {
                oddNumQuantity++;
            }

        }
        int[] array2 = new int[oddNumQuantity];

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] > 0) {
                array2[index] = array[i];
                index++;

            }

        }

        return array2;

    }

    public static boolean[] method13(int[] array) {

        boolean[] array2 = new boolean[array.length];

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                array2[index] = true;
                index++;
            }
            if (array[i] <= 10 && array[i] > 0) {
                array2[index] = false;
                index++;
            }
        }

        return array2;

    }

    public static String method14(String[] array) {

        return String.join(" ", array);

    }

    public static int method15(int[] array) {
        if (array.length == 0){

            return 0;
        }
        int sum = 0;
        for (int i = (array.length / 2); i < array.length; i++) {
            sum += array[i];

        }
        return sum++;

    }

    public static int[] method16(int a) {
        int length = 0;
        for (int i = 1; i < 12; i++) {
            if (a >= 1 && a < 10) {
                length++;
            } else {
                System.out.println("Enter number from 1 to 9");
            }

        }
        int[] array = new int[length];

        int index = 0;
        for (int i = 0; i < 11; i++) {
            array[index] = a * i;
            index++;

        }

        return array;

    }

    public static int[] method17(int[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                length++;
            }
        }

        int length2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                length2++;
            }
        }
        int[] arrayEvenNum = new int[length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayEvenNum[index] = i;
                index++;
            }

        }

        int[] arrayOddNum = new int[length2];
        int index1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && length2 > length) {
                arrayOddNum[index1] = i;
                index1++;
                return arrayOddNum;

            }
            if (array[i] % 2 == 0 && length2 < length) {
                return arrayEvenNum;
            }

        }

        if (arrayEvenNum.length > arrayOddNum.length) {

            return arrayEvenNum;

        } else if (arrayEvenNum.length < arrayOddNum.length) {

            return arrayOddNum;

        } else if (length == length2) {


        }
        return array;


    }

    public static int[] method18(int l) {
        if (l <= 0){
            return  null;
        }
        int[] random = new int[l];
        for (int i = 0; i < l; i++) {
            random[i] =  (int) (Math.random() * 99) + 1 ;
        }

        return random;

    }

    public static int[] method19(int l, int d) {
        if (l <= 0 || d <= 0){
            return null;
        }
        int[] random19 = new int[l];

        int num = 0;
        for (int i = 0; i < l; i++) {
            if (d == 1) {
                random19[num] = 1 + (int) (Math.random() * 9);
                num++;
            } else if (d == 2) {
                random19[num] = 10 + (int) (Math.random() * 99);
                num++;
            } else if (d == 3) {
                random19[num] = 100 + (int) (Math.random() * 999);
                num++;
            } else if (d == 4) {
                random19[num] = 1000 + (int) (Math.random() * 9999);
                num++;
            } else if (d == 5) {
                random19[num] = 10000 + (int) (Math.random() * 99999);
                num++;
            } else if (d == 6) {
                random19[num] = 100000 + (int) (Math.random() * 999999);
                num++;
            } else if (d == 7) {
                random19[num] = 1000000 + (int) (Math.random() * 9999999);
                num++;
            } else if (d == 8) {
                random19[num] = 10000000 + (int) (Math.random() * 99999999);
                num++;
            } else if (d == 9) {
                random19[num] = 100000000 + (int) (Math.random() * 999999999);
                num++;
            }

        }

        return random19;

    }

    public static int[] method20(int[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] <= 99) {
                length++;
            }
        }
        int[] array20 = new int[length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] <= 99) {
                array20[index++] = array[i];
            }
        }

        return array20;

    }

    public static int[] method21(int[] array) {

        int[] array21 = new int[array.length];
        int index = 0;
        for (int i = 0; i < array21.length; i++) {
            if (array[i] > 9 && array[i] <= 99) {
                array21[index++] = Math.abs(array[i] / 10) - (array[i] % 10);
            }
        }
        return array21;
    }

    public static String[] method22(int[] array, String country) {
        String number = Arrays.toString(array);
        String[] phoneNumber = {number, country};

        return phoneNumber;

    }

    public static int sumArrayAlgorithm(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != 0) {
                sum+=array[i];
            }
        }

        return sum++;
    }






    public static void main(String[] args) {

        // Task 5
        Integer a2 = 8;
        Double b2 = 2.5;
        String str2 = "Cat";

        line();
        task();

        //Task 6
        printLine();
        System.out.println("Integer a1 =     |Integer a2=     |" + a2.equals(HW8_1.a1) + " |");
        printLine();
        System.out.println("Double b1 =      |Double b2 =     |" + b2.equals(HW8_1.b1) + " |");
        printLine();
        System.out.println("String str1 =    |String str2 =   |" + str2.equals(HW8_1.str1) + " |");
        printLine();


        line();
        task();

        //Task 7

        printArray(array7(5, 5, 5, 6, 6));
        printArray(arrayIntReturn(5, 5, 5, 6, 6));

        line();
        task();

        //Task 8
        printArray(arrayDouble(1.5, 2.5, 2.05, 3.05, 4.35));

        line();
        task();

        //Task 9

        printArray(arrayString("Cat", "Dog", "Horse", "Parrot", "Mouse"));

        line();
        task();

        // Task 10
        int[] mass = {0, 2, 10, 1};

        printArray(array10(mass));

        line();
        task();

        //Task 11
        System.out.println(method11(mass));

        line();
        task();

        //Task 12
        printArray(method12(mass));

        line();
        task();

        //Task 13

        int[] array13 = {5, 10, 11, 30};
        System.out.println(Arrays.toString(method13(array13)));

        line();
        task();

        //Task 14

        String[] words = {"Cat", "is", "red", "and", "white"};

        System.out.println(method14(words));

        line();
        task();

        //Task 15
        int[] array15 = {1, 2, 1, 5, 5};
        System.out.println(method15(array15));

        line();
        task();

        //Task 16
        printArray(method16(9));


        line();
        task();

        //Task 17

        int[] array5 = {1, 21, 1, 13};
        printArray(method17(array5));


        line();
        task();

        //Task 18

        printArray(method18(5));

        line();
        task();

        //Task 19

        printArray(method19(4, 6));


        line();
        task();

        //Task 20
        printArray(method20(method18(6)));


        line();
        task();

        //Task 21

        int[] mas21 = {25, 20, 15};

        printArray(method21(mas21));

        line();
        task();

        //Task 22


        int[] array22 = {1, 3, 4, 7, 5, 3, 7, 1, 4, 3, 4};
        method22(array22, "USA");



        int[] arr = {2, 5, 7};

        System.out.println(sumArrayAlgorithm(arr));













    }
}
