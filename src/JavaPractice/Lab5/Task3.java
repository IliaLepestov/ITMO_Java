package Lab5;

public class Task3 {
    private static String Censura(String text, String badword, String cens){
        String text1 = text.replace(badword, cens);
        return text1;
    }
    public static void main(String[] args){
        String text = "Язык программирования" +
                "\nСтрого типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems. " +
                "\nРазработка ведётся сообществом, организованным через Java Community Process; язык и основные реализующие его технологии распространяются по лицензии GPL." +
                "\nПрава на торговую марку принадлежат корпорации Oracle." ;
    System.out.println(Censura(text, "Язык", "[вырезано цензурой]"));
    }
}
