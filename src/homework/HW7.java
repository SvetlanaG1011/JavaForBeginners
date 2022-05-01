package homework;

import java.util.Arrays;

public class HW7 {

    static int number = 1;

    public static void task() {
        System.out.println("             Task " + number);
        number++;
    }

    public static void line() {
        System.out.println("\u2665" + "================================" + "\u2665");

    }

    public static void printLine() {
        System.out.println("_________________________________________");
    }


    public static double midValue(int[] array){
        double midValue = 0;
        for (int i = 0; i < array.length; i++){
            midValue += array[i];
        }
        return  midValue / array.length;
    }


    public static void main(String[] args) {

        line();
        task();
        //String[] catNames = new String [8];
        String[] catNames = {"Барсик", "Мурзик", "Смоки", "Кузя", "Гарфилд", "Грей", "Рыжик", "Васька"};
        //System.out.println(Arrays.toString(catNames));
        for (int i = 0; i < 8; i++) {
            System.out.println(catNames[i]);
        }


        line();
        task();
        //Task 2
        catNames[4] = "Рыжик";
        catNames[1] = "Черныш";
        System.out.println(catNames[4]);
        System.out.println(catNames[1]);

        line();
        task();
        //Task 3
        String[] catsColors = {"Серый", "Черный", "Серый", "Серый", "Рыжий", "Серый", "Рыжий", "Серый"};
        for (int i = 0; i < 8; i++) {
            System.out.println(catsColors[i]);
        }

        line();
        task();

        //Task 4
        int[] catsAges = {2, 2, 1, 1, 3, 2, 4, 5};

        for (int i = 0; i < 8; i++) {
            System.out.println(catsAges[i]);
        }

        line();
        task();

        //Task 5
        boolean[] isCatRed = {false, false, false, false, true, false, true, false};
        for (int i = 0; i < 8; i++) {
            System.out.println(isCatRed[i]);
        }

        line();
        task();

        //Task 6
        System.out.println(catNames[6]);

        printLine();

        for (int i = 0; i <= 7; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " " + catNames[i]);
            }
        }

        printLine();
        for (int i = 0; i <= 7; i++) {
            if (i % 4 == 0) {
                System.out.println(catNames[i]);
            }
        }

        printLine();
        for (int i = 0; i <= 7; i++) {
            if (i % 2 != 0) {
                System.out.println(catsColors[i]);
            }
        }

        printLine();
        for (int i = 0; i <= 7; i++) {
            if (i % 3 == 0) {
                System.out.println(catsColors[i]);
            }
        }

        line();
        task();


        //Task 7
        for (int i = 0; i <= 7; i++) {
            if (catsColors[i].equals("Серый")) {
                System.out.println("Накорми кота " + i);
            }
        }


        line();
        task();

        //Task 8
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 0 || catsAges[i] > 50) {
                System.out.println("Error");
            } else if (catsAges[i] < 2) {
                System.out.println("Отнеси кота на прививку");
            }
        }

        line();
        task();

        //Task 9// можно проверить еше что длины !=0 и конечные индексы одинаковы
        for (int i = 0; i <= 7; i++) {
            if ((catNames.length == catsColors.length) && (catNames.length == catsAges.length)) {
                if (i == 7) {
                    System.out.println(catNames[i] + " " + catsColors[i] + " " + catsAges[i] + " лет");
                }
            }
        }
        line();
        task();

        //Task 10
        for (int i = 0; i <= 7; i++) {
            if (catsAges[i] > 2) {
                System.out.println("Cat with index " + i + " " + catNames[i]);
            }
        }

        line();
        task();

        //Task 11
        if ((catNames.length == isCatRed.length) && (catNames.length != 0)) {
            for (int i = 0; i <= 7; i++) {
                if (catNames[i].equals("Рыжик") && isCatRed[i] == true) {
                    System.out.println("Накорми кота! По имени " + catNames[i]);
                }
            }
        }
        line();
        task();

        //Task 12
        int sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum += catsAges[i];
            // sum = sum + catsAges[i];
        }
        System.out.println(sum / catsAges.length);

        line();
        task();

        //Task 13
        int min = catsAges[0]; //  предположим мин возраст у кота в 0 коробке//лучше присвоить (int min) 0 или min.Value
        for (int i = 1; i < catsAges.length; i++) { //перебираем возраст, начиная с коробки под №1
            if (catsAges[i] < min) {
                min = catsAges[i];
            }
        }
        System.out.println(min + " год ");

        line();
        task();

        //Task 14
        int max = catsAges[0];// предположим макс возраст у кота в 0 коробке//
        for (int i = 1; i < 8; i++) { //перебираем возраст с коробки под №1
            max = Math.max(catsAges[i], max);
        }
        System.out.println(max + " лет");

        line();
        task();

        //Task 15
        int count = 0;
        for (int i = 0; i < 8; i++) {
            if (catsColors[i].equals("Серый")) {
                count++;
            }
        }
        System.out.println(count++ + " штук");

        line();
        task();

        //Task 16
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0 && catsAges[i] <= 3) {
                System.out.println(catNames[i]);
            }
        }

        line();
        task();

        //Task 17
        int length = 0;// считаем длину массива
        for (int i = 0; i <= 10; i += 2) {//прошлись по всем числам от 0 до 10 (условие 17 задачи)
            length++; //посчитали длину массива                                //c шагом +2, чтобы считать только четные
        }
        int[] array17 = new int[length];
        int number = 0;//числа которыми заполняем коробки
        for (int i = 0; i < array17.length; i++) {//индекс! перебираем числа до длины массива
            array17[i] = number;// в каждую коробку складываем число
            number += 2;
        }
        System.out.println(Arrays.toString(array17));


            line();
            task();
            //Task 18
        System.out.println(midValue(catsAges));
        //HW5.verifyEquals();
            line();
            task();

            //Task 19
          count = 0;
          for (int i = -1000; i < -900; i++){
              if (i % 2 != 0) {
                  count++;
              }
          }

          int[] array19 = new int[count];
          number = -1000 + 1;
          for (int i = - 1000; i < array19.length; i++ ){
              if(i % 2 != 0){
                  array19[i] = number;
                  number++;
              }
              System.out.println(Arrays.toString(array19));
          }


            line();
            task();
            //Task 20
            int[] random = new int[10];
            for (int i = 0; i <= 9; i++){
            random[i] = (int) (Math.random() * Integer.MAX_VALUE);
            System.out.println(random[i]);
        }




        }

    }


