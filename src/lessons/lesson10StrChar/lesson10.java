package lessons.lesson10StrChar;

import java.util.Locale;

public class lesson10 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";
        char a = 'a';
        Character aa = 'a';
        //Character aaa = new Character('a');// depricated
        System.out.println(a == aa);
        // System.out.println(aa.equals(aaa));

        String strA = "a";
        //System.out.println(a == strA);different types, can't compare

        System.out.println(str1 + space + str2 + space + str3);//just cancatination, it's not saved
        String str4 = str1 + space + str2 + space + str3;// saved all words together
        System.out.println(str4);

        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(4));

        for (int i = 0; i <= 4; i++) {
            System.out.println(str4.charAt(i));
        }

        for (int i = 0; i < str4.length(); i++) {//idem po vsei dline stroki
            if (str4.charAt(i) == 'a') {//i- tii simvol; '' t.k. eto char
                System.out.println(str4.charAt(i));//print letters
                System.out.println(i);//print indexes;
            } else {
                System.out.println("Letter isn't a");
            }

        }
        System.out.println();

        for (int i = 0; i < str4.length(); i++) {//idem po vsei dline stroki
            if (str4.charAt(i) < 'i') {//chislennoe value < i (po ascii code)
                System.out.println(str4.charAt(i));//print letters
                System.out.println(i);//print indexes;
            } else {
                System.out.println(" >= i");
            }

        }
        System.out.println( "__________________________________________________");

        System.out.println(Character.toString('i' - 1));//ascii code ,use  to print a letter Character.toString
        System.out.println('i' + 1);// to print value


        System.out.println(str4.toLowerCase());//vse perevodim v lowercase i potom reshaem zadachy
        System.out.println(str4.toUpperCase());
        String str5 = str4.toUpperCase();
        System.out.println(str4.compareToIgnoreCase(str5));



    }
}
