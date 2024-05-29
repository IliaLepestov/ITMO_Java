package lab3_4;

public class tree {
    private String name;
    private int age;
    private boolean isAlive;

    public tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public tree(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        if (isAlive) {
            return "Живое дерево " + this.name + " возрастом " + this.age + " лет.";
        } else {
            return "Неживое дерево " + this.name + " возрастом " + this.age + " лет.";
        }
    }
}
