package Lab6.lab6_3;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(1200, "Vesta", 'c', 220);
        Truck gazelle = new Truck(2000, "Next", 'б', 180, 2800, 3);

        lada.outPut();
        gazelle.outPut();
        gazelle.newWheels(4);
    }
}
