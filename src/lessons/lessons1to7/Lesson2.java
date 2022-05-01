package lessons.lessons1to7;

public class Lesson2 {

    public static void main(String[] args) {

        int a = 5;
        int b = 13;
        int c = 113;
        int d = -5;
        int sumAB = (a + b);
        int sumABC = (a + b +c);
        int subBA = (b - a);
        int mulAB = a * b;
        int devBA = b / a;
        int devAB = a / b;

        // конкатенация
        System.out.println( "a =  " + a );
        System.out.println("b =  " + b);
        System.out.println("c =  " + c);
        System.out.println(a + b);
        System.out.println(sumAB);
        System.out.println(sumABC);

        // конкатенация
        System.out.println("" + a + b + c);
        System.out.println("" + a + "" + b + "" +c);
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);

        // конкатенация

        System.out.print("Сегодня ");
        System.out.println("Saturday");

        System.out.println("Он сказал \"поехали!\" и махнул рукой.");
        System.out.println("Сегодня\nSaturday"); // переход на новую строку
        System.out.println("Сегодня\t\tSaturday"); // пробел 4 знака от начала (escape sequence)

        //Ариф вычитание
        System.out.println(b - a);
        System.out.println(subBA);
        System.out.println(d);
        System.out.println(a-d);
        System.out.println(a + d);

        // умножение
        System.out.println(mulAB);
        System.out.println(a * b);
        System.out.println(5*13);

        // деление
        System.out.println(b / a);
        System.out.println(devBA);
        System.out.println(devAB);

        // остаток от деления

        System.out.println(a % b);
        System.out.println(b % a);




    }








}
