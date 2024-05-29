package lab3_2;

public class main {
    public static void main(String[] args) {
        car lada = new car("красный");
        lada.setName("LADA Granta");
        lada.setWeight(2500);

        car ChanganLamore = new car("чёрный", 2000);
        ChanganLamore.setName("Changan LAMORE");

        lada.PrintCar();
        ChanganLamore.PrintCar();
    }
}
