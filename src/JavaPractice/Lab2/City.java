package Lab2;

public class City {
    private String Name; //Название города
    private int Population; //Численность населения
    private String Currency; //Валюта
    private String Country; //Страна
    private double Density; //Плотность населения м2

    public City() {}

    private City(String Name, int Population, String Currency, String Country, double Density){
        this.Name = Name;
        this.Population = Population;
        this.Currency = Currency;
        this.Country = Country;
        this.Density = Density;
    }


    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public int getPopulation(){
        return Population;
    }

    public void setPopulation(int Population){
        if (Population > 0){
            this.Population = Population;
        } else {
            System.out.println("Численность населения не может быть отрицательна!");
        }
    }

    public String getCurrency(){
        return Currency;
    }

    public void setCurrency(String Currency){
        this.Currency = Currency;
    }

    public String getCountry(){
        return Country;
    }

    public void setCountry(String Country){
        this.Country = Country;
    }

    public double getDensity(){
        return Density;
    }

    public void setDensity(double Density){
        if (Density > 0){
            this.Density = Density;
        } else {
            System.out.println("Плотность населения не может быть отрицательна");
        }
    }

    @Override
    public String toString(){
        return "Город{" +
                "Название города-'" + Name + '\'' +
                ", Численность населения ='" + Population +'\''+
                ", Валюта -'" + Currency + '\'' +
                ", Страна - '" + Country + '\'' +
                ", Плотность населения на м2 - '" + Density +
                '}';
    }
}
