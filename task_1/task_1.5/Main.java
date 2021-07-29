import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Введите температуру по Цельсию: ");
        int TC = scan.nextInt ();
        System.out.println((9.0 / 5.0) * TC + 32.0 + "°F");
    }
}
