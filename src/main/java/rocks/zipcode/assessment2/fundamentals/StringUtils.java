package rocks.zipcode.assessment2.fundamentals;

import java.util.regex.Pattern;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        return String.format("%" + amountOfPadding + "s", stringToBePadded );
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        return String.format("%-" + amountOfPadding + "s", stringToBePadded );
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder builder = new StringBuilder();
        for(int i =1; i <= numberOfTimeToRepeat; i++) {
            builder.append(stringToBeRepeated);
        }
        return builder.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
//        char[] chars = string.toCharArray();
//        for(char c : chars) {
//            if(!Character.isLetter(c)) {
//                return false;
//            }
//        }
        //string.matches("[a-zA-Z] +");
       boolean allLetters = string.chars().allMatch(Character::isLetter);

        return allLetters;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        if(string.matches("[0-9]+") && string.length() >2) {
            return  true;
        }
        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String splchar = "-\\[/@#$%^&_!+=()";
        if(string.matches("[" + splchar + "]+")) {
            return true;
        }
        return false;
    }
}
