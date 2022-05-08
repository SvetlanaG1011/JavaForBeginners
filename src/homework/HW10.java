package homework;

import java.util.Arrays;

import static utils.Utils.*;

public class HW10 {

    public static String deleteSpaces(String str) {
        String str2 = " ";

        if (str.length() != 0) {
            str2 = str.replace(" ", "");

            if (str.length() != str2.length()) {

                return "Extra spaces removed";
            } else if (str.length() == str2.length()) {

                return "There were no spaces";
            }
        }

        return "String is empty";
    }

    public static void main(String[] args) {

        line();
        task();
        System.out.println(deleteSpaces("   QA4Everyone"));
        System.out.println(deleteSpaces("QA4Everyone"));
        System.out.println(deleteSpaces(""));

        line();
        task();

    }
}