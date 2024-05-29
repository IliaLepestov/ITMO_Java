package lab3_4;

public class main {
    public static void main(String[] args) {
        tree appleTree = new tree("Яблоня", 5);
        tree oak = new tree("Дуб", 78, false);
        tree unknownTree = new tree();

        System.out.println(appleTree);
        System.out.println(oak);
    }
}
