import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Введите число: ");
        int A = scan.nextInt ();
        System.out.println(A + (A * 15)/100);
    }
}
