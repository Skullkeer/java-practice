package q5;

public class OverloadedMethods {

    OverloadedMethods() {

    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }


    public static void main() {
        OverloadedMethods calc = new OverloadedMethods();
        IO.println(calc.add(5, 3));
        IO.println(calc.add(5.3, 3.6));
        IO.println(calc.add(5, 3));
    }

}
