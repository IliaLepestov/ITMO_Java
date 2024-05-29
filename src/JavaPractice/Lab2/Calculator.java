package Lab2;

public class Calculator {

    static long dif(int x, int y) {
        return (long) (x) - (long) (y);
    }

    static long dif(long x, long y) {
        return (x - y);
    }

    static double dif(double x, double y) {
        return (x - y);
    }




    static long sum(int x, int y) {
        return (long) (x) + (long) (y);
    }

    static long sum(long  x, long y){
        return (x + y);
    }

    static double sum(double x, double y){
        return (x + y);
    }




    static double div(int x, int y){
        return (double) (x)/(double) (y);
    }

    static double div(long x, long y){
        return (double) (x)/(double) (y);
    }

    static double div(double x,double y){
        return (x/y);
    }




    static long multi(long x, long y){
        return (x * y);
    }

    static long multi(int x, int y){
        return (long) (x) * (long) (y);
    }

    static double multi(double x, double y){
        return (x * y);
    }

}
