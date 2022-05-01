package homework;

public class HW6 {

    static int number = 1;
    static int i;


    public static void task() {
        System.out.println("             Task " + number);
        number++;
    }

    public static void line() {
        System.out.println("\u2665" + "================================" + "\u2665");
    }

    // public static void printNumbers(double start, double end, double step) {
      //  for (double i = start; i < end; i += step) {

        //    System.out.println(i);
      //  }
  //  }

    public static void seq10(double start, double end, double step) {
        //increasing start < end, step > 0
        //decreasing start > end, step < 0
        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(start);
            }
        } else if (start > end && step < 0) {
            for (start = start; start > end; start += step) {
                System.out.println(start);
            }
        } else {
            System.out.println("invalid data");
        }
    }

    public static void printL(int l) {
        for (int i = 0; i <= l; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println((int) Math.pow(2, i));
        }

    }

    public static void task16(int n, int l, int m) {
        for (int i = n; i <= l; i += m) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //n + 1 = n + 2
    public static void task17(int n) {
        int l = n + 6;
        for ( ; n < l; n++) {
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));

        }
    }

    public static void task18(int n, int l) {
        if (n < l) {
            for (int i = n; i < l; i++) {
                if (i == n) {
                    System.out.println("[" + (n) + "]" + " = " + (n + 2));
                }
            }
                } else {
                    System.out.println("Invalid data");
                }

            }

    public static void task19(){
        for (int i = 10; i < 100; i++){
            if (Math.abs((i / 10) - (i % 10)) <= 3){
                System.out.println(i);
            }
        }
    }





    public static void main(String[] args) {

        line();
        task();
        //Task 1

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        line();
        task();

        //Task 2
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }

        line();
        task();
        //Task 3
        for (int i = 50; i < 56; i += 2) {
            System.out.println(i);
        }

        line();
        task();
        //Task 4
        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        line();
        task();
        //Task 5
        for (double i = 120; i <= 131; i++) {
            System.out.println(((double) i / 10) + " ");// or String.format
        }

        line();
        task();
        //Task 6
        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        line();
        task();
        //Task 7
        for (int i = 8; i <= 13; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            } else {
                System.out.println("No");
            }
        }

        line();
        task();
        // Task 8
        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i += 1) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
        }

        line();
        task();
        //Task 9
        for (int i = -10; i < 35; i++) {
            if (i == 0) {
                System.out.println("Zero");
            }else if (i % 11 == 0) {
                System.out.println("\u001B[34m" + i + "\u001B[0m");
            }else if (i % 12 == 0) {
                System.out.println("\u001B[31m" + i + "\u001B[0m");

            }

        }

        line();
        task();
        // Task 10
       // printNumbers(1, 2, 0.1);
        seq10(10.5, 20.75, 1.29);// happy path
        line();
        seq10(15.9, 0, -1.45);// happy path
        seq10(15.9, 0, 1);    // negative
        seq10(-15.9, 0, -1);//negative
        seq10(0, 0, -1);// negative



        line();
        task();
        //Task 11
        printL(16);

        line();
        task();
        //Task 12
        printN(4);

        line();
        task();
        //Task13
       String result = "";
       String result2 = "";
       String result3 = "";
       String result4 = "";

       for (int i = 0; i < 10; i++){
           result = result + i;
           result2 = result2 + i + i;
           result3 = result3 + i + i + i;
           result4 = result4 + i + i + i + i;
       }
        System.out.println(result + result2 + result3 + result4);

        System.out.println();
        line();
        task();
        //Task 14
        int a = 0;

        System.out.print(a + ", ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ", " + -i + ", ");
        }

        System.out.println();

        line();
        task();
        //Task 15
        for (int i = 0; i <= 25; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(" " + i + ", ");
            }
        }
        System.out.println();

        line();
        task();
        //Task 16
        task16(0, 7, 1);

        line();
        task();
        //Task 17
        task17(1);
        System.out.println("_______________________________");
        task17(2);

        line();
        task();

        //Task 18
        task18(2,4);

        line();
        task();

        //Task 19
        task19();


    }


}



