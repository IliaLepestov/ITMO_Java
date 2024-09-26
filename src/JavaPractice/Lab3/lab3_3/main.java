package lab3_3;

public class main {
    public static void main(String[] args) {
        building house = new building();
        house.AddBuildingInfo("Многоквартирный дом", (short) 20, (short) 2010);
        house.DisplayInfo();

        building scyscrapper = new building();
        scyscrapper.FillBuildingInfo();
        scyscrapper.DisplayInfo();
}
}
