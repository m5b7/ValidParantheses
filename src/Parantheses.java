import java.time.Duration;
import java.time.LocalDateTime;

public class Parantheses{

    public static void main(String[] args){

        String stringToCheck = "(())[{][}]{()}";

        // save time
        LocalDateTime startTime = LocalDateTime.now();

        System.out.println(validParantheses(stringToCheck));

        // print time difference
        System.out.println("Duration: " + Duration.between(startTime, LocalDateTime.now()).toMillis());
    }

    /* Decides whether parantheses are valid or not by removing "()", "[]" and "{}" repeatedly
        and finally comparing to "". */

    public static boolean validParantheses(String stringToCheck){

        String alteredString = stringToCheck;

        if (alteredString.length() % 2 == 1) {
            return false;
        } else {

            for (int i = 0; i <= stringToCheck.length()/2; i++) {

                alteredString = alteredString.replaceAll("(\\(\\))","");
                alteredString = alteredString.replaceAll("(\\[\\])","");
                alteredString = alteredString.replaceAll("(\\{\\})","");
            }

            return alteredString.equals("");
        }
    }
}