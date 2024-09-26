package Lab6.lab6_1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person oleg = new Client("Олег", "Иванов");
        Client bob = new Client("Bob", "Marley", "VTB24");
        Person mike = new Bank("Mike", "Tyson", "Alfa-Bank");
        Bank john = new Bank("John", "Smith");
        Scanner sc = new Scanner(System.in);
        int hours;

        oleg.displayInfo();
        bob.displayInfo();
        System.out.print("Может войти в банк " + bob.hoursToEnterBank());
        mike.displayInfo();
        john.displayInfo();
        System.out.println("Введите часы (от 0 до 23): ");
        hours = sc.nextInt();
        System.out.print(mike.getName() + " может находиться в банке " + john.isAllowedToStayAtBank(hours));
    }
}
