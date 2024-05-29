package Lab2;

public class Main {
    public static void main(String[] args){
        int a = 1703;
        int b = 1297;
        System.out.println(Calculator.sum(a, b));
        System.out.println(Calculator.sum(1234567890, 25));
        System.out.println(Calculator.sum(123.45, 678.99));
        System.out.println(Calculator.sum(1239L, 123.456));
        System.out.println(Calculator.dif(a,b));
        System.out.println(Calculator.dif(9876543211L,1234567890));
        System.out.println(Calculator.dif(15.6, 3.2));
        System.out.println(Calculator.dif(1234512L, 12.22));
        System.out.println(Calculator.div(a, b));
        System.out.println(Calculator.div(111111111111L,22222222222L));
        System.out.println(Calculator.div(11.1, 10.1));
        System.out.println(Calculator.div(1111111111L, 11.1));
        System.out.println(Calculator.multi(a,b));
        System.out.println(Calculator.multi(132009876545L, 12.3));
        System.out.println(Calculator.multi(33.3, 3));


        City City = new City();
        City.setName("Санкт - Петербург");
        City.setPopulation(559776);
        City.setCurrency("Российский Рубль");
        City.setCountry("Россия");
        City.setDensity(3631.47);
        System.out.println(City);
    }
}

