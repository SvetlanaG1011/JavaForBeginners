package homework;

public class HW2 {

    public static void main(String[] args) {

        int k = 5;
        int l = 10;
        int m = 15;
        int sumKL = k + l;
        int mulKM = k * m;
        int subLM = l - m;
        int divKL = k / l;
        int remKl = k % l;
        int divKM = k / m;
        int remKM = k % m;
        int apple = 40;
        int student = 6;
        int divAppleStudent = apple / student;
        int remAppleStudent = apple % student;

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

        System.out.print(k);
        System.out.print(l);
        System.out.print("10\n");

        System.out.println(k + "," + l + "," + m);

        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);

        //16

        System.out.println(sumKL);
        System.out.println(k + l);
        System.out.println(mulKM);
        System.out.println(k * m);
        System.out.println(subLM);
        System.out.println(l - m);

        //17

        System.out.println("Результат деления k на l = " + divKL + ", а остаток от деления = " + remKl);
        System.out.println("Результат деления k на m = " + divKM + " а остаток от деления = " + remKM);
        System.out.println("Результат деления l на m = " + (l / m) + ", a остаток от деления = " + (l % m));
        System.out.println("Результат деления m на k = " + (m / k) + ", a остаток от деления = " + (m % k));

        //18
        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, \n"
                + "то каждый ученик получит по " + divAppleStudent + " яблок," + "\n"
                + "и " + remAppleStudent + " яблок(а) останется учителю.");

         apple = 100;
         student = 21;
         divAppleStudent = apple / student;
         remAppleStudent = apple % student;

        System.out.println("Если " + apple + " яблок поделить на " + student + " ученика, \n"
                + "то каждый ученик получит по " + divAppleStudent + " яблока," + "\n"
                + "и " + remAppleStudent + " яблок(а) останется учителю.");

        //19

        m++;
        int sumKLM = k + l + m;
        System.out.println(sumKLM);

        m--;

        m--;
        int sumKLM1 = (k + l + m);
        System.out.println(sumKLM1);

        System.out.println(sumKLM + sumKLM1);

        //2 вариант
        //int sumKLM1 = (k + l + (m - 2));
        //System.out.println(sumKLM1);

        m++;
        int sumLKM = l + k + m;

        m++;
        System.out.println(m - sumLKM);

        //20
        int a = 48;
        int b = 8;
        int c = 47;
        int d = 49;
        int remAB = a % b;
        int remCD = c % d;

        System.out.println(remAB);
        System.out.println(remCD);

        //part 3
        int x = 2;
        int y = 3;
        a = k;
        c = m;
        d = y - x;
        b = l;

        //21

        String exercise21 = "(x + 3)(x + 3)";
        System.out.println(exercise21);

        int result21 = (x + 3) * (x + 3);
        System.out.println(result21);

        //22
        String line20 = "_____________________________________";
        String exercise22 = ("((3 + 4 * x) / 5 - 10*(y - 5) * (a + b + c)) / x) + (9 * (4 / x + (9 + x) / y)");
        System.out.println(line20);
        System.out.println(exercise22);

        int result22 = (((3 + 4 * x) / 5) - ((10 * (y - 5) * (a + b + c)) / x) + (9 * (4 / x + (9 + x) / y)));

        System.out.println(result22);

        //23

        String line36 = "_______________________________________";
        int result1 = ((5 * x + 7 * y) / (8 * x + 10 * y)) / (3 * x - y) / (x + y);
        int result2 = a + b + c / d + (a + b) / (c + d) + a * b;
        int result23 = result1 / result2;

        System.out.println(line36);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result23);
        System.out.println(line36);

        String line1 = "____________________";
        String w = "|task    | result  |";
        String line2 = "|________|_________|";
        String line3 = "|21      | ";
        String line4 = "|________|_________|";
        String line5 = "|21      | ";
        String line6 = "|________|_________|";
        String line7 = "|23      | ";
        String line8 = "|________|_________|";


        System.out.println(line1);
        System.out.println(w);
        System.out.println(line2);
        System.out.println(line3 + result21 + "      |");
        System.out.println(line4);
        System.out.println(line5 + result22 + "     |");
        System.out.println(line6);
        System.out.println(line7 + result23 + "       |");
        System.out.println(line8);


    }


}
