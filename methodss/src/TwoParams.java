public class TwoParams {
    public static void twoParams(int x, int y){
        System.out.println("First Parameter is " + x);
        System.out.println("Second Parameter is " + y);
    }
    public static void main(String [] args){
        int x = 5;
        int y = 10;

        int a;
        int b;

        twoParams(10, 20);
        twoParams(x + 2, y * 10);

        a = -2;
        b = 22;
        twoParams(a, b);

    }
}
