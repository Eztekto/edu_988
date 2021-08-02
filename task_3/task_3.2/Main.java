public class Main {
    public static int min(int a, int b, int c, int d) {
        int min = a;
        int x = min (a, b);
        int y = min (c, d);
        if (x <= y)
            min = x;
        if (y <= x)
            min = y;
        return min;
    }



    public static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
