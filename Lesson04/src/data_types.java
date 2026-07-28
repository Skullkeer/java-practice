public class data_types {

    public static void main() {
        int a = 10;
        int b = 3;

        int sum = a + b;
        int diff = a -b;
        int prod = a * b;
        double quot = (double) a / b;
        int remainder = a % b;

        System.out.println("10 / 3 = " + quot);

        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLess = (a < b);
        boolean isLessOrEqual = (a <= b);

        boolean x = true, y = false;
        boolean andResult = x && y;
        boolean orResult = x || y;
        boolean notResult = !x;

        int result1 = a + b * 2;
        int result2 = (a + b) * 2;

        a += 5;
        b *= 2;

        System.out.println("a = " + a);
        a++;
        System.out.println("a2 = " + a);

        //-------------------------

        int c = 10;
        double d = 3.0;
        int e = 3;

        double result = (double) c / e;

        System.out.println("Division with Double: " + result);

        //--------------------------

        double result3 = (double) c / 0;
        System.out.println("Division with Double by Zero: " + result3);

    }

}
