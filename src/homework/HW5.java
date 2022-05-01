package homework;

import com.sun.source.tree.BreakTree;
import com.sun.source.tree.ReturnTree;

import java.sql.SQLOutput;
import java.util.Arrays;

public class HW5 {

    static int number = 2;
    static String expectedResult = " ";
    static String actualResult = " ";
    static String expectedResultDouble = " ";
    static String actualResultDouble = " ";
    static double averageTemp;
    static int median = number;
    static double summa = number;
    static int random_number1 = number;


    public static void task() {
        System.out.println("         Task " + number);
        number++;
    }

    public static void line() {
        System.out.println("\u2665" + "======================" + "\u2665");
    }

    public static void verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static String verifyEqualsDouble(double expected, double actual) {
        if (expectedResultDouble.equals(actualResultDouble)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
        return actualResultDouble;
    }

    public static String verifyDay(int a) {
        String day = " ";
        if (a <= 0 || a > 7) {
            day = "Enter correct number from 1 to 7";
            System.out.println(day);
        } else if (a == 1) {
            day = "Monday";
            System.out.println(day);
        } else if (a == 2) {
            day = "Tuesday";
            System.out.println(day);
        } else if (a == 3) {
            day = "Wednesday";
            System.out.println(day);
        } else if (a == 4) {
            day = "Thursday";
            System.out.println(day);
        } else if (a == 5) {
            day = "Friday";
            System.out.println(day);
        } else if (a == 6) {
            day = "Saturday";
            System.out.println(day);
        } else if (a == 7) {
            day = "Sunday";
            System.out.println(day);
        }

        return day;

    }

    public static double returnMaxOfThree(double x, double y, double z) {
        double max;

        if (x > y) {
            max = x;
        } else {
            max = y;
            double largest = max;
        }
        if (max > z) {
            return max;
        } else {
            max = z;
            double largest = max;
        }

        return max;

    }

    public static double returnMinOfThree(double a1, double b, double c) {
        double min1;

        if (a1 < b) {
            min1 = a1;
        } else {
            min1 = b;
        }
        if (min1 < c) {
            return min1;
        } else {
            min1 = c;
        }

        return min1;

    }


    public static double averageCatsTemp(double temp1, double temp2, double temp3, double temp4, double temp5) {
        if (temp1 <= 35.0 || temp1 >= 42.0) {
            System.out.println("Please, enter correct cat's temp from 35.0 to 42.0");
            averageTemp = 0;
        } else if (temp2 <= 35.0 || temp2 >= 42.0) {
            System.out.println("Please, enter correct cat's temp from 35.0 to 42.0");
            averageTemp = 0;
        } else if (temp3 <= 35.0 || temp3 >= 42.0) {
            System.out.println("Please, enter correct cat's temp from 35.0 to 42.0");
            averageTemp = 0;
        } else if (temp4 <= 35.0 || temp4 >= 42.0) {
            System.out.println("Please, enter correct cat's temp from 35.0 to 42.0");
            averageTemp = 0;
        } else if (temp5 <= 35.0 || temp5 >= 42.0) {
            System.out.println("Please, enter correct cat's temp from 35.0 to 42.0");
            averageTemp = 0;
        } else {

            averageTemp = ((temp1 + temp2 + temp3 + temp4 + temp5)) / 5;
        }

        return averageTemp;
    }

    public static String rubCop(double a) {
        if (a > 0) {
            int rub = (int) a;
            String b = Integer.toString(rub);
            double kop = (a - rub) * 100;
            int kop1 = (int) kop;
            String c = Integer.toString(kop1);
            return (b + " руб " + c + " коп");
        } else {
            return ("Enter a positive number");

        }
    }

    public static String massToString(double b) {
        if (b > 0) {
            int kilo = (int) b;
            String k = Integer.toString(kilo);
            double gr = (b - kilo) * 1000;
            int gr1 = (int) gr;
            String g = Integer.toString(gr1);
            return (k + " кг " + g + " гр");
        } else {
            return ("Enter a positive number");
        }
    }


    public static double total(double price, double quantity) {
        if (price > 0 && quantity > 0) {
            return (price * quantity);
        } else {
            return (0);
        }
    }


    public static void receipt(String product, String count, double price, double quantity) {
        String line = "___________________________";

        System.out.println(product + "\n" + "Цена за 1 шт " + "\t\t\t" + rubCop(price) + "\n"
                + "Количество товара" + "\t\t" + quantity + "\n" + line + "\n" + "Сумма к оплате"
                + "\t\t\t" + total(price, quantity));
    }


    public static double salaryAmount(int hour, double money) {
        if (hour > 0) {
            return (hour * money);
        } else {

            return (0);
        }
    }

    public static void statement(String month, String name, int year, int hour, double money) {

        System.out.println(month + year + "\n" + name + "\t\t\t" + salaryAmount(hour, money));

    }

    public static int task12(int x) {
        if (x < 0) {
            x = -x;
            System.out.println("X is negative");
        } else if (x > 0) {
            x = x;
            System.out.println("X is positive");
        } else {
            x = 0;
            System.out.println("X is zero");
        }

        return x;
    }

    public static int luckyNumber(int yearOfBirth) {

        int firstNum = yearOfBirth / 1000;
        int secondNum = yearOfBirth / 100 % 10;
        int thirdNum = yearOfBirth % 100 / 10;
        int fourNum = yearOfBirth % 10;
        int lucky = (firstNum + secondNum + thirdNum + fourNum);
        if (lucky <= 9) {
            System.out.println("Счастливое число = " + lucky);
        } else {
            firstNum = lucky / 10;
            secondNum = lucky % 10;
            lucky = (firstNum + secondNum);
            System.out.println("Счастливое число = " + lucky);
        }

        return lucky;

    }

    public static void verifyInt(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static int getMedian(int a, int b, int c) {
        return Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));
    }

    public static double differenceBetweenMiddleAndMedian(int a, int b, int c) {
        int middle = ((a + b + c) / 3);
        int difference = ((a + b + c) / 3) - getMedian(a, b, c);
        if (difference > 2) {
            System.out.println("Среднее значение " + middle + " отличается от медианы "
                    + getMedian(a, b, c) + " на " + difference);
        } else {
            System.out.println("Среднее значение = " + middle + " медиана = " + getMedian(a, b, c));

        }
        return difference;

    }

    public static String summaTotal(double a) {
        if (a > 0) {
            a = Math.ceil(a);
        } else {
            System.out.println("Enter valid sum");
        }

        return rubCop(a);

    }

    public static int getRandomTask19() {
        int x = 1;
        int y = 99;
        random_number1 = x + (int) (Math.random() * y);

        return random_number1;

    }

    public static double task16(int a, int b, int c) {
        double result = (Math.sqrt(a * b + c) * Math.pow(a, b)) / Math.PI;

        return Math.ceil(result);
    }

    public static int assignOne(int x, int y) {
        if (y > 0) {
            x = 1;
        } else {
            return x;
        }
        return x;
    }

    public static boolean rewrite(int i, int v) {
        boolean item = (i >= 10 && (v < 50));
        // boolean item = !((i < 10) || (v > 50));
        return item;
    }


    public static double task18(int pow) {
        if (pow >= 0 && pow <= 10) {
            return Math.pow(Math.random(), pow);
        } else {
            System.out.println("Error");
            return Double.MIN_VALUE;
        }

    }

    public static double increaseTask17(double score) {
        if (score >= 80 && score <= 90) {
            score += 5;
        }
        return score;
    }

    public static void printOddPositive(int a) {
        if (a >= 0 && a % 2 != 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static int[] minMaxMid(int[] array, int index1, int index2) {
        int min = 0;
        int max = 0;
        int sum = 0;
        int count = 0;
        int average = 0;

        if (array.length == 0) {

            return null;

        }

        int[] result = {min, max, average};

        for (int i = index1; i <= index2; i++) {

            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int length = 0;

        for (int i = index1; i <= index2; i++) {
            sum += array[i];
            length++;
            average = sum / length;


        }

        int[] result2 = {min, max, average};

        return result2;

    }


    public static int[] minMaxAveAlgorithm(int[] array, int index1, int index2) {
        if (array == null || array.length < 1 || index1 < 0 || index1 > index2 || index2 >= array.length
                || index1 == index2 ) {
            return null;
        }
        int sum = 0;
        int midValue = 0;
        int minValue = array[index1];
        int maxValue = array[index2];

        for (int i = index1; i <= index2; i++) {
            if (array[index1] < array[i]) {
                maxValue = array[i];

            }
            if (array[index1] > array[i]) {
                minValue = array[i];
            }

        }

        int length = 0;
        for (int i = index1; i <= index2; i++) {
            sum += array[i];
            length++;
            midValue = sum / length;

        }

        int[] result2 = {minValue, maxValue, midValue};

        return result2;

    }


    public static int[] sameNumbersArray(int[] array1, int[] array2) {
        if (array1.length == 0 || array2.length == 0) {
            return new int[]{};
        }
        int length = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    length++;
                }
            }
        }
        int[] arrayResult = new int[length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    arrayResult[count] = array1[i];
                    count++;
                }
            }
        }

        return arrayResult;
    }


    public static void main(String[] args) {

        line();
        task();

        //Test "Day of the week"
        verifyEquals("Monday", verifyDay(1));

        //  Test 2
        verifyEquals("Enter correct number from 1 to 7", verifyDay(0));

        // Test 3
        verifyEquals("Enter correct number from 1 to 7", verifyDay(8));

        line();
        task();

        //Task 3
        System.out.println(returnMaxOfThree(12.24, 12.25, 12.26));
        // Test Task 3
        verifyEqualsDouble(12.26, returnMaxOfThree(12.24, 12.25, 12.26));


        line();
        task();

        //Task 4
        returnMinOfThree(2328420.4, 483919.43, 4839257.3);
        System.out.println(returnMinOfThree(2328420.4, 483919.43, 4839257.3));
        // Test Task 4
        verifyEqualsDouble(6.01, returnMinOfThree(6.01, 13.01, 6.1));

        line();
        task();

        // Task 5 Cat Temp
        System.out.println(averageCatsTemp(36.0, 37.1, 36.4, 35.5, 38.8));
        System.out.println("Test");
        verifyEqualsDouble(43.74, averageCatsTemp(34.9, 37.1, 36.4, 35.5, 38.8));
        verifyEqualsDouble(40.0, averageCatsTemp(37.0, 42.0, 37.0, 42.0, 42.0));

        line();
        task();

        rubCop(10.75);
        System.out.println(rubCop(10.75));

        /// Test Task 6
        verifyEquals("10 руб 15 коп", rubCop(10.15));
        verifyEquals("10 руб 5 коп", rubCop(10.05));
        verifyEquals("8 руб 0 коп", rubCop(8.0));

        line();
        task();

        //Task 7
        massToString(10.075);
        System.out.println(massToString(10.075));

        //Test Task 7
        verifyEquals("10 кг 5 гр", massToString(10.05));
        verifyEquals("10 кг 500 гр", massToString(10.5));

        line();
        task();
        //Task 8
        total(10, 5);
        System.out.println(total(10, 5));

        //  Test

        verifyEqualsDouble(50, total(10, 5));
        verifyEqualsDouble(0, total(0, 0));

        line();
        task();
        //Task 9
        receipt("Хлеб", "5 шт", 30.50, 5.0);


        line();
        task();

        //Task 10
        System.out.println(salaryAmount(8, 250.50));
        //Test Task 10
        verifyEqualsDouble(44000, salaryAmount(10, 200));
        verifyEqualsDouble(0, salaryAmount(0, 0));
        verifyEqualsDouble(2000.00, salaryAmount(10, 200.00));

        line();
        task();

        //Task 11

        statement("Март", "Иванова Мария", 2020, 10, 200);


        line();
        task();

        // Task 12
        task12(7);

        line();
        task();

        // Task 13

        luckyNumber(1989);
        //Test Lucky
        verifyInt(4, luckyNumber(2002));
        verifyInt(2, luckyNumber(2000));
        verifyInt(6, luckyNumber(1959));
        verifyInt(5, luckyNumber(1931));
        verifyInt(6, luckyNumber(2022));


        line();
        task();
        //Task 14
        System.out.println(getMedian(10, 20, 30));
        differenceBetweenMiddleAndMedian(10, 20, 30);
        verifyEqualsDouble(176.666667, differenceBetweenMiddleAndMedian(500, 20, 10));
        verifyEqualsDouble(0, differenceBetweenMiddleAndMedian(0, 0, 0));
        verifyEqualsDouble(-1, differenceBetweenMiddleAndMedian(0, 1, -2));


        line();
        task();
        //Task 15
        System.out.println(summaTotal(15.50));
        // Test
        verifyEquals("11 руб 0 коп", summaTotal(10.50));
        verifyEquals("Enter valid sum", summaTotal(0));
        verifyEquals("21 руб 0 коп", summaTotal(20.25));

        line();
        task();

        // Task 16
        task16(3, 4, 20);


        //Tak 19
        System.out.println(getRandomTask19());

        line();
        task();
        //Task 17.1
        System.out.println(assignOne(5, 5));
        verifyInt(1, assignOne(1, 0));
        //Task 17.2
        System.out.println(increaseTask17(85));
        verifyEqualsDouble(86, increaseTask17(81));
        verifyEqualsDouble(75, increaseTask17(75));
        //Task 17.3
        System.out.println(rewrite(5, 10));
        //Task 17.4
        printOddPositive(17);

        //Task 17.5


        line();
        task();

        int[] array20 = {1, 2, 6, 4, 7};
        int[] array21 = {4, 222, 7, 2};

        //System.out.println(Arrays.toString(sameNumbersArray(array20, array21)));


        // System.out.println(Arrays.toString(minMaxMid(array20, 1, 3)));


        System.out.println(Arrays.toString(minMaxAveAlgorithm(array20, 7, 6)));


       // System.out.println(Arrays.toString(sameNumbersArray(array20, array21)));


    }
}



