package logic;

public class Calc {

    static int a;
    static int b;
    static String action;

    public static String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public static int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Calc() {

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int mnozh(int a, int b) {
        return a * b;
    }

    public static int dil(int a, int b) {
        return a / b;
    }
}
