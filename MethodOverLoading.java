package myjavahomework4;

public class MethodOverLoading {
    static int myMethod(int a, int b){
        return a+b;
    }
    static double myMethod(double a, double b) {
    return a+b;
    }

    public static void main(String[] args) {
        int c = myMethod(20,30);
        double d= myMethod(30.20, 40.15);
        System.out.println(c);
        System.out.println(d);
    }
}
