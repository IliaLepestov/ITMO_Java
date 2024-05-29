import java.util.Scanner;

class Lab1 {

    public static void Task1() {
        System.out.println("Задание №1" + "\n");
        String line = System.lineSeparator();
        String Ex1 = ("Я" + line + "хорошо" + line + "знаю" + line + "Java");
        System.out.println(Ex1);
    }

    public static void Task2() {
        System.out.println("\n"+"Задание №2" + "\n");
        double result1 = (46 + 10) * ((double) 10 / 3);
        double result2 = 29 * 4 * -15;
        System.out.println(result1);
        System.out.println(result2);
    }

    public static void Task3() {
        System.out.println("\n"+"Задание №3" + "\n");
        int number = 10500;
        double result3 = ((double) number / 10) / 10;
        System.out.println(result3);
    }

    public static void Task4() {
        System.out.println("\n"+"Задание №4" + "\n");
        double result4 = 3.6 * 4.1 * 5.9;
        System.out.println(result4);
    }

    public static void Task5() {
        System.out.println("\n"+"Задание №5");
        Scanner Sk1 = new Scanner(System.in);
        int count = 0;
        System.out.println("Введите целое число");
        while (Sk1.hasNext()) {
            if (Sk1.hasNextInt()) {
                System.out.println(Sk1.nextInt());
                count++;
                if (count == 5) {
                    System.out.println("Продолжить ввод? (да/нет)");
                    Sk1.nextLine();
                    String response = Sk1.nextLine();
                    if (!response.equalsIgnoreCase("да")) {
                        break;
                    }
                    count = 4;
                }
            } else {
                System.out.println("Введите целое число.");
                Sk1.next();
            }
        }
    }

    public static void Task6() {
        System.out.println("\n"+"Задание №6");
        Scanner Sk2 = new Scanner(System.in);
        System.out.println("Введите целое число");
        while (Sk2.hasNext()) {
            if (Sk2.hasNextInt()) {
                int number = Sk2.nextInt();
                if (number % 2 != 0 && number < 100) {
                    System.out.println("Нечетное");
                }
                if (number % 2 == 0 && number < 100) {
                    System.out.println("Четное");
                }
                if (number > 100) {
                    System.out.println("Выход за пределы диапазона");
                }
            } else {
                System.out.println("Введено некорректное значение");
                System.out.println("Введите целое число");
                Sk2.next();
            }
        }
    }


    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
    }
}


