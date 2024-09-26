package Lab5;

public class Task1 {
    public static void main(String[] args) {
        String text = "Язык программирования" +
                "\nСтрого типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems. " +
                "Разработка ведётся сообществом, организованным через Java Community Process; язык и основные реализующие его технологии распространяются по лицензии GPL." +
                "Права на торговую марку принадлежат корпорации Oracle." ;

        theLongestWord(text);
    }

    public static void theLongestWord(String text) {

        String[] words = text.split("[,\\s.!?:;]+");
        String result = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > result.length()) {
                result = words[i];
            }
        }
        System.out.print(result);
    }
}