package lab3_2;

public class car {
    private String name;
    private String color;
    private double weight;

    public car() {
    }

    public car(String color) {
        this.color = color;
    }

    public car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void PrintCar() {
        System.out.printf("Название автомобиля - %s, цвет - %s, вес - %.2f кг.\n", name, color, weight);
    }
}
