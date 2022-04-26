package CommonDivisor;

public class CommonDivisor {
    public static void main(String[] args) {
        int a = 18;
        int b = 225;
        System.out.println(GreatestCommonDivisor(a, b));
        System.out.println(LeastCommonDivisor(a, b));
    }

    private static int GreatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GreatestCommonDivisor(b, a % b);
    }

    private static int LeastCommonDivisor(int a, int b) {
        return a * b / GreatestCommonDivisor(a, b);
    }
}

