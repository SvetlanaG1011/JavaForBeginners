package homework;

import java.sql.SQLOutput;

public class HW4 {

    static int number = 3;

    public static void task() {
        System.out.println("         Task " + number);
        number++;
    }

    public static void line() {
        System.out.println("==========================");
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void divRem(int a1, int b1) {
        System.out.println("Результат деления " + a1 + " на " + b1 + " = " + a1 / b1 + " ,а остаток от деления = "
                + a1 % b1);
    }

    public static void countApples(int apples, int students) {
        System.out.println("Если " + apples + " яблок(а)" + "разделить на " + students
                + " учеников, то каждый ученик получит по "
                + apples / students + " яблок(а)" + " , и " + apples % students + " яблок(а) останется учителю.");
    }

    // public static void ending(String a, String b, int apples, int students){


    //if ( apples / students == 1 ){
    //   if (apples == 42){
    //   }
    //   System.out.println("Если " + apples + a + "разделить на " + students
    //           + a + ", то каждый ученик получит по "
    //           + apples / students + b + ", и " + apples % students + " яблок останется учителю.");
    // }

    // }

    public static void transferTemp(double tC) {
        double tF = ((tC * 1.8) + 32);
        System.out.println("tF = " + tF);
        System.out.println(tC);
    }

    public static int getMinValue(int i) {
        int a5 = Integer.MIN_VALUE;

        return a5;
    }

    public static int getMaxValue(int i) {
        int a6 = Integer.MIN_VALUE;

        return a6;
    }

    public static double getPow(int i) {
        double a7 = 2;
        a7 = Math.pow(i, a7);

        return a7;
    }

    public static void main(String[] args) {

        line();
        task();
        line();

        boolean a = (2 == 2);
        boolean b = (7 == 7);
        System.out.print("1)");
        System.out.println(a && b);
        print("(2==2) && (7==7)");

        System.out.print("2)");
        boolean c = !(15 < 3);
        System.out.println(c);
        System.out.println(15 >= 3);

        System.out.print("3)");
        String pine = "Сосна";
        String oak = "Дуб";
        String cherry = "Вишня";
        String maple = "Клен";
        System.out.println(pine == oak || cherry == maple);

        System.out.print("4)");
        System.out.println(pine != oak);

        System.out.print("5)");
        boolean d = 15 < 3;
        boolean e = 10 > 20;
        System.out.println(!d && e);

        System.out.print("6)");
        String eyes = "Глаза даны, чтобы видеть";
        String floor = " Под третьим этажом находится второй этаж";
        System.out.println(true && true);

        System.out.print("7)");
        boolean f = ((6 / 2) == 3);
        boolean g = ((7 * 5) == 20);
        System.out.println(f || g);

        line();
        task();
        line();

        System.out.print("1)");
        String text1 = "false";
        String text2 = "true";
        System.out.println(Boolean.parseBoolean(text1) || Boolean.parseBoolean(text2));

        System.out.print("2)");
        boolean p = !(28 > 7);
        boolean r = !(300 / 5 == 60);
        System.out.println(p && r);

        System.out.print("3)");
        String tv = "эл прибор";
        String glass = "tree";
        System.out.println(Boolean.parseBoolean(tv) && Boolean.parseBoolean(glass));

        System.out.println("4)");
        boolean s = 300 < 100;
        String text5 = "Жажду можно утолить водой";

        line();
        task();
        line();
        System.out.print("a)");
        int A = 20;
        int N = 21;
        int S = 15;

        if (A > S && N > S) {
            System.out.println("Андрей старще Светы и Наташа старше Светы ");
        }

        System.out.print("b)");
        String text8 = "На полке стоят учебники";
        String text9 = "На столе лежат справочники";
        System.out.println(text8.equalsIgnoreCase(text8) || text9.equalsIgnoreCase(text9));

        System.out.print("c)");
        String text10 = "Большая часть детей - девочки";
        String text11 = "А остальные мальчики";
        System.out.println(text10.equalsIgnoreCase(text10) && text11.equalsIgnoreCase(text11));

        line();
        task();
        line();

        //6
        String text12 = "Водительские права можно получить";
        int age = 16;
        System.out.println();
        if (age >= 16) {
            System.out.println(text12);
        } else {
            System.out.println("права получить нельзя");
        }

        line();
        task();
        line();

        //7
        String text14 = "Петя не едет в автобусе";
        String text15 = "но при этом читает книгу";
        String text16 = "не смотрит в окно";

        if (text14.equals("Петя не едет в автобусе")) {
            System.out.println(Boolean.valueOf(text15) || Boolean.valueOf(text16));
        }

        line();
        task();
        line();

        //8
        String conditionFriend = "с другом";

        if (conditionFriend.equals("с другом")) {
            System.out.println("Это хорошо");
        } else {
            System.out.println("плохо");
        }

        line();
        task();
        line();

        //9
        int age1 = 18;

        if (age1 >= 18) {
            System.out.println("то ты взрослый");
        } else {
            System.out.println("ты - ребенок");
        }

        String condition1 = "если земля сухая";

        if (condition1.equals("если земля сухая")) {
            System.out.println("значит нет дождя");
        } else {
            System.out.println("то идет дождь");
        }

        String condition3 = "если на небе тучи";

        if (condition3.equals("если на небе тучи")) {
            System.out.println("идет дождь");
        } else {
            System.out.println("идет слепой дождь");
        }

        Boolean clouds = true;
        if (clouds == true) {
            Boolean rain = true;
            System.out.println("идет дождь");
        } else {
            Boolean rain = false;
            System.out.println("идет слепой дождь");
        }

        String condition4 = "если сегодня суббота";
        String condition5 = "если сегодня пятница";
        String text28 = "вчера был не четверг, а завтра - не воскресенье";

        if (condition4.equals("если сегодня суббота")) {
            System.out.println("значит завтра воскресенье");
        }
        if (condition5 == "если сегодня пятница") {
            System.out.println("значит вчера был четверг");
        } else {
            System.out.println("вчера был не четверг, а завтра - не воскресенье");
        }

        String rak = "свистнул";

        if (rak == "свистнул") {
            System.out.println("значит прошла вечность");
        } else {
            System.out.println("ждите дальше");
        }

        int age3 = 18;
        String condition7 = "закончил школу";
        String text31 = "ты можешь не жить с родителями";
        String text32 = "живи с родителями";

        if (age3 >= 18) {
            if (condition7 == "закончил школу") {
                System.out.println(text31);
            }
        } else {
            System.out.println(text32);
        }

        line();
        task();
        line();

        //10
        int n = 5;

        if (n % 2 == 0) {
            n = n * 2;
        } else {
            n = n * n;
        }
        System.out.println("n = " + n);

        line();
        task();
        line();

        //11
        int voteAge = 19;
        String voteYes = "голосовать можно";
        String voteNo = "голосовать нельзя";

        if (voteAge >= 18) {
            System.out.println(voteYes);
        } else {
            System.out.println(voteNo);
        }

        //TEST
        voteAge = 11;
        String expectedResultVote = "голосовать нельзя";

        if (expectedResultVote == voteNo) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        //Drive
        int driveAge = 18;
        String driveYes = "машину водить можно";
        String driveNo = "машину водить нельзя";

        if (driveAge >= 16) {
            System.out.println(driveYes);
        }
        if (driveAge < 16) {
            System.out.println(driveNo);
        }
        System.out.println("______test_______");

        driveAge = 8;
        String expResultDrive = "машину водить нельзя";
        if (expResultDrive == driveNo) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("fail");
        }
        System.out.println("____________________");

        //School
        int schoolAge = 5;
        String schoolYes = "в школу можно идти";
        String schoolNo = "в школу нельзя идти";
        if (schoolAge >= 5) {
            System.out.println(schoolYes);
        } else {
            System.out.println(schoolNo);
        }

        schoolAge = 4;
        String expectedResultSchool = "в школу нельзя идти";

        if (expectedResultSchool == schoolNo) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("Fail");
        }


        line();
        task();
        line();

        //12
        int studentGrade = 3;
        int grade5 = 5;
        int grade4 = 4;
        int grade3 = 3;
        int grade2 = 2;

        if (studentGrade == 5) {
            System.out.println("Выдать похвальную грамоту и перевести в сл класс");
        }
        if (studentGrade == 4) {
            System.out.println("перевести в сл класс");
        }
        if (studentGrade == 3) {
            System.out.println("Дать задание на лето и перевести в сл класс");
        } else {
            System.out.println("Вызвать родителей и оставить в текущем классе на сл год");
        }

        line();
        task();
        line();

        //13
        int number1 = 20;
        int number2 = 10;

        if (number1 % 3 == 0) {
        }
        if (number2 % 3 == 0) {
            System.out.println(Integer.sum(number1, number2));
        }
        if (number1 < 0 || number2 < 0) {
            System.out.println(Integer.sum(number1, number2) * -1);
        }


        if (number1 % 5 == 0) {
        }
        if (number2 % 5 == 0) {
            System.out.println(number1 - number2);
        }
        if (number1 < 0 || number2 < 0) {
            System.out.println((number1 - number2) * -1);

        }

        if (number1 % 2 == 0) {
        }
        if (number2 % 2 == 0) {
            System.out.println(number1 * number2);
        }
        if (number1 < 0 || number2 < 0) {
                    System.out.println((number1 * number2) * -1);


        }

        line();
        task();
        line();

        //14
        int k = 5;
        int l = 10;
        int m = 15;

        divRem(k, l);
        divRem(k, m);
        divRem(l, m);
        divRem(m, k);
        divRem(k, k);
        divRem(m, m);
        divRem(l, l);

        line();
        task();
        line();

        //15
        int apples = 40;
        int students = 6;

        countApples(apples, students);

        apples = 100;
        students = 21;
        countApples(apples, students);

        line();
        task();
        line();

        //apples = 42;
        //students = 42;
        //   String end1 = "яблок(a)";
        //   String end2 = "яблок";
        //   String end3 = "яблок(у)";
        //   String end4 = "учеников";
        //  String end5 = "ученика";

        System.out.println("не решила");

        line();
        task();
        line();

        double tC = 20.0;
        transferTemp(tC);

        line();
        task();
        line();

        System.out.println("дорешать");

        line();
        task();
        line();

        // Task 19
        int n1 = 5;
        int expectedResult = 25;

        if (expectedResult == n) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }


        ////"\u001B[31m";
        //// "\u001B[32m";

        line();
        task();
        line();

        // Task 20

        int yourAge = 19;
        String result1 = "В школу можно идти";
        String result2 = "Машину можно водить";
        String result3 = "Голосовать можно";
        String result4 = "Ты еще маленький";

        if (yourAge >= 5) {
            System.out.println(result1);
            if (yourAge >= 16) {
                System.out.println(result2);

                if (yourAge >= 18) {
                    System.out.println(result3);
                }
            }
        } else {
            System.out.println(result4);
        }

        //TEST
        yourAge = 12;
        String expectedResultAge12 = "В школу можно идти";

        if (expectedResultAge12 == result1) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }

        yourAge = 19;
        String expectedResultAge19 = "Машину можно водить" + "Голосовать можно";


        if (expectedResultAge19.equals(result2 + result3)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }

        line();
        task();
        line();


        //Task 21
        Short w = 31000;

        if (w / 10 == 0) {
            System.out.println("it's a one-digit number");
        } else if (w / 100 == 0) {
            System.out.println("it's a two-digit number");
        } else if (w / 1000 == 0) {
            System.out.println("it's a three digit number");
        } else if (w / 10000 == 0) {
            System.out.println("it's a four digit number");
        } else if (w / 100000 == 0 && w <= Short.MAX_VALUE) {
            System.out.println("it's a five digit number");
        } else {
            System.out.println("error");
        }


    }

}