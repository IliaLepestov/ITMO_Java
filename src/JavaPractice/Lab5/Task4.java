package Lab5;

public class Task4 {

    public static void main(String[] args) {
        String text = "Язык программирования" +
                "\nСтрого типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems. " +
                "Разработка ведётся сообществом, организованным через Java Community Process; язык и основные реализующие его технологии распространяются по лицензии GPL." +
                "Права на торговую марку принадлежат корпорации Oracle." ;

        String subString = "язык";

        displayNumberOfOccurances(text, subString);
    }

    public static void displayNumberOfOccurances(String text, String substring) {
        int lastIndex = 0;
        int result = 0;

        while (lastIndex != -1) {
            lastIndex = text.toLowerCase().indexOf(substring, lastIndex);
            if (lastIndex != -1) {
                result++;
                lastIndex += substring.length();
            }
        }
        System.out.println(result);
    }
}
