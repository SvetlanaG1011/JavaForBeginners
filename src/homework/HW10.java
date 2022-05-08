package homework;

import java.util.Arrays;

import static utils.Utils.*;

public class HW10 {

    public static String deleteSpaces(String str) {
        String str2 = " ";

        if (str.isEmpty() == false) {
            str2 = str.trim();

            if (str.length() != str2.length()) {

                return "Extra spaces were removed";
            } else if (str.length() == str2.length()) {

                return "There were no spaces";
            }
        }

        return "String is empty";
    }

    public static String RemoveAllaAlgorithm(String str){

        if (str.length() != 0 ){
           str = str.replace("a", "");

          return str;
        }

        return " ";
    }

    public static void main(String[] args) {

        line();
        task();

        System.out.println((deleteSpaces("   QA4Everyone")));
        System.out.println((deleteSpaces("QA4Everyone")));
        System.out.println((deleteSpaces("")));

        line();
        task();

        System.out.println(RemoveAllaAlgorithm("QA4Everyone"));
        System.out.println(RemoveAllaAlgorithm("panda"));
        System.out.println("");
    }
}
