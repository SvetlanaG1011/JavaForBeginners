package homework;


import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.function.DoubleToIntFunction;

public class HW3 {

    public static void main(String[] args) {

        System.out.println("Task 2");

        byte a = 10;
        byte b = 20;

        System.out.println("a =  " + a);
        System.out.println("b =  " + b);

        short s = -32000;
        short t = 28000;

        System.out.println("Task 3");
        System.out.println("s = " + s);
        System.out.println("t = " + t);

        System.out.println("Task 4");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int maxI = Integer.MAX_VALUE;
        int minI = Integer.MIN_VALUE;

        System.out.println("_________________________________________________________");
        System.out.println("|Integer min               |" + " значение   " + minI + "    |");
        System.out.println("_________________________________________________________");
        System.out.println("|Integer max               |" + " значение   " + maxI + "     |");
        System.out.println("_________________________________________________________");


        System.out.println("Task5");
        long phoneNumber = 19295097395L;
        System.out.println(phoneNumber);

        System.out.println("Task 6 and Task 7");
        float f = 100.101101F;
        double d = 1000.101101;
        Double dd = 10.09999 + 20.099999;
        Double ff = 10.09999 + 20.099999;

        System.out.println("_______________________________________________________________");
        System.out.println("| float f = " + f + "          | значение f                   |");
        System.out.println("_______________________________________________________________");
        System.out.println("| double d = " + d + "        | значение d                   |");
        System.out.println("_______________________________________________________________");
        System.out.println("| Double dd = " + dd + "| значение dd                  |");
        System.out.println("_______________________________________________________________");
        System.out.println("| Double ff = " + ff + "| значение ff                  |");
        System.out.println("_______________________________________________________________");

        System.out.println("Task 8");
        double result = 10.0 / 3;
        System.out.println(result);

        System.out.println("Task 9");
        double sumFD = f + d;
        double remFD = f % d;
        double product = f * d;
        double quotient = f / d;
        System.out.println(sumFD);
        System.out.println(remFD);
        System.out.println(product);
        System.out.println(quotient);

        System.out.println("Task 10");
        System.out.println(": :    :::   :    :    ::::     ");
        System.out.println(":::    :::   :    :    :  :    ");
        System.out.println(": :    :..   :..  :..  ::::      ");

        System.out.println("Task 11");
        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = 505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = 1000000.001;
        Short t9 = 1010;

        System.out.println("Byte t1 = " + t1);
        System.out.println("Short t2 = " + t2);
        System.out.println("Byte t3 = " + t3);
        System.out.println("Float t4 = " + t4);
        System.out.println("Integer t5 = " + t5);
        System.out.println("Long t6 = " + t6);
        System.out.println("Double t7 = " + t7);
        System.out.println("Double t8 = " + t8);
        System.out.println("Short t9 = " + t9);

        System.out.println("Task 12");

        System.out.println("_____________________________________________________________");
        System.out.println("|Type    |Size   |min                   |max                |");
        System.out.println("_____________________________________________________________");
        System.out.println("|Byte    |8      |-128                  |127                |");
        System.out.println("_____________________________________________________________");
        System.out.println("|Short   |" + Short.SIZE + "     |" + Short.MIN_VALUE + "                |" + Short.MAX_VALUE
                + "              |");
        System.out.println("_____________________________________________________________");
        System.out.println("|Integer |" + Integer.SIZE + "     |" + Integer.MIN_VALUE + "           |" + Integer.MAX_VALUE
                + "         |");
        System.out.println("_____________________________________________________________");
        System.out.println("|Long    |" + Long.SIZE + "     |" + Long.MIN_VALUE + "  |" + Long.MAX_VALUE
                + "|");
        System.out.println("_____________________________________________________________");
        System.out.println("|Float   |" + Float.SIZE + "     |" + Float.MIN_VALUE + "               |" + Float.MAX_VALUE
                + "       |");
        System.out.println("_____________________________________________________________");
        System.out.println("|Double  |" + Double.SIZE + "     |" + Double.MIN_VALUE + "              |" + Double.MAX_VALUE
                + "   ");
        System.out.println("_____________________________________________________________");


        System.out.println("Task 13");
        Integer num1 = 35000;
        Integer num2 = 35000;

        System.out.println("Если  num1 = num2, то результат сравнения методом .equals = " + num1.equals(num2));

        Integer num11 = 33000;
        Integer num22 = 35000;
        System.out.println("Если  num1 не равно num2, то результат сравнения методом .equals = " + num11.equals(num22));

        System.out.println("Task 14");
        int number1 = 40000;
        int number2 = 40000;
        String text = "Если number1 = number2, то результат сравнения методом compare =  ";
        System.out.println(text + Integer.valueOf(number1).compareTo(Integer.valueOf(number2)));

        int number11 = 40000;
        int number22 = 45000;
        String text2 = "Если number1 < number2, то результат сравнения методом compareUnsigned =  ";
        System.out.println(text2 + Integer.compareUnsigned(number11, number22));

        int number111 = 45000;
        int number222 = 40000;
        String text3 = "Если number1 > number2, то результат сравнения методом compare =  ";
        System.out.println(text3 + Integer.compare(number111, number222));

        System.out.println("Task 15");
        Float aa = 234.9999F;
        System.out.println(aa.intValue());

        System.out.println("Task 16");
        double x = 123.5555555;
        double y = 130.5555555;
        System.out.println(Double.sum(x, y));

        System.out.println("Task 17");
        Float c1 = 55.5555F;
        Float c2 = 44.4444F;
        int c11 = (c1.intValue());
        int c22 = (c2.intValue());
        System.out.println(Integer.sum(c11, c22));

        System.out.println("Task 18");
        Short short1;
        Short short2;
        short1 = 12000;
        short2 = 12300;
        System.out.println("12300 - 12000 = " + Short.compare(short1, short2));

        Short short11 = 12500;;
        System.out.println("12500 - 1200 = " + Short.compare(short11, short2));

        System.out.println("Task 19");
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        Double subDoub = doub1 -  doub2;
        System.out.println(subDoub);
        System.out.println(Double.parseDouble(str1) - Double.parseDouble(str2));

        // 2 variant
        System.out.println(Double.valueOf(str1));
        System.out.println(Double.valueOf(str2));

        System.out.println("Task 20");
        Float temp = 38.1F;
        Float temp2 = 39.4F;
        System.out.println((temp + temp2) / 2);
        Float average = (temp + temp2) / 2;
        System.out.println(Math.round(average));

        System.out.println("Task 21");
        Number n = Long.MAX_VALUE;
        n = 10;
        n = 10.999999999;
        System.out.println("Переменная n может принимать значения: ");
        System.out.println("n = " + Long.MAX_VALUE);
        System.out.println("n = " + n.byteValue() );
        System.out.println("n = " + n.doubleValue());
        System.out.println(" Это возможноб потому что n переменная абстрактного типа Number");

        System.out.println("Task 22");
        Integer numberInteger = 100;
        numberInteger.toString();
        System.out.println(numberInteger + numberInteger.toString());

        System.out.println("Task 23");

        System.out.println("36.6 градусов по Цельсию = ");















    }


}
