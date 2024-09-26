package Lab6.lab6_4;
import java.util.Scanner;

abstract class Parent {
    protected Integer parentNum;

    protected void initializeParentNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        parentNum = scanner.nextInt();
    }

    abstract void displayParentNum();
}
