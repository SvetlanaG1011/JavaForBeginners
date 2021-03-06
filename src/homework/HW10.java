package homework;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

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

    public static String RemoveAllaAlgorithm(String str) {

        if (str.length() != 0) {
            str = str.replace("a", "");

            return str;
        }

        return " ";
    }

    public static String RemoveAllZeros(String str) {

        if (str.length() != 0) {
            str = str.replace(" ", "");

            return str.replace("0", "");
        }

        return " ";
    }

    public static String removeAllSpaces(String str) {

        if (str.length() != 0) {
            str = str.replace(" ", "");

            return str;
        }

        return " ";
    }

    public static int aAndACounter(String str) {
        if (str.length() != 0 && str.toLowerCase().contains("a")) {

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.toLowerCase().charAt(i) == 'a') {
                    count++;
                }
            }

            return count;
        }

        return 0;
    }

    public static boolean wordJavaCheck(String str) {

        if (str.length() != 0 && str.contains("Java")) {

            return true;
        } else {

            return false;
        }
    }

    public static String methodConcatQuotesAndPointRemoveSpaces(String str) {

        if (str.length() != 0) {
            String noSpaces = str.trim();
            String result = "\"".concat(noSpaces).concat(".\"");

            return result;
        }

        return "String is empty";
    }

    public static String nameOfTheCity(String str) {

        if (str.length() != 0) {
            String noSpacesStr = str.trim();

            return noSpacesStr.substring(0, 1).toUpperCase() + noSpacesStr.substring(1).toLowerCase();
        }

        return "String is empty";
    }

    public static String methodIndexOf9(String str, String parameter){

        String newStr = str.toLowerCase();
        if (str.length() != 0 && parameter.isEmpty() == false){
            String result = newStr.substring(str.indexOf(parameter),  newStr.lastIndexOf(parameter) + 1);

            return result;
        }

        return "";
    }

    public static boolean wordsStartsAndEndsWithTheSameLetter(String str) {

        String result = str.toLowerCase();
        String firstLetter = result.substring(0, 1);
        String lastLetter = result.substring(str.length() - 1, (str.length()));

        if (str.length() != 0 && firstLetter.equals(lastLetter)) {

            return true;
        } else {

            return false;
        }
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

        line();
        task();

        System.out.println(RemoveAllZeros("  3 5 0 4 2 0 9 7 0 6 0 4 0    0 0 0"));
        System.out.println(RemoveAllZeros(" 0000000111"));

        line();
        task();

        System.out.println(removeAllSpaces("  QA  4 Everyone  "));
        System.out.println(removeAllSpaces("pa   n d a  "));

        line();
        task();

        String str13 = "Abracadabra";
        System.out.println(aAndACounter(str13));
        System.out.println(aAndACounter("Homenum Revelio"));

        line();
        task();

        System.out.println(wordJavaCheck("As of March 2022, Java 18 is the latest version, while Java 17,\n" +
                " 11 and 8 are the current long-term support (LTS) versions.\n" +
                " Oracle released the last zero-cost public update for the legacy version Java 8 LTS \n" +
                " in January 2019 for commercial use, although it will otherwise still support Java 8 \n" +
                " with public updates for personal use indefinitely. Other vendors have begun to offer \n" +
                " zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades."));

        System.out.println(wordJavaCheck("As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune???s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crown??d sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee. This wish I have; then ten times happy me."));

        line();
        task();

        System.out.println(methodConcatQuotesAndPointRemoveSpaces("One"));
        System.out.println(methodConcatQuotesAndPointRemoveSpaces("    TWO  "));
        System.out.println(methodConcatQuotesAndPointRemoveSpaces(""));

        line();
        task();

        System.out.println(nameOfTheCity("tashkent"));
        System.out.println(nameOfTheCity("ChicaGO"));
        System.out.println(nameOfTheCity(" tashkENt "));

        line();
        task();

        System.out.println(methodIndexOf9("Abracadabra", "b"));
        System.out.println(methodIndexOf9("Whippersnapper", "p"));

        line();
        task();

        System.out.println(wordsStartsAndEndsWithTheSameLetter("Abracadabra"));
        System.out.println(wordsStartsAndEndsWithTheSameLetter("Whippersnapper"));

    }
}
