import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Делимое: ");
        int a = scanner.nextInt();
        System.out.println("Делитель: ");
        int b = scanner.nextInt();
        int ostatok = a % b;
        if (ostatok != 0) {
            System.out.println("Делится с остатком");
        }
        else
            System.out.println("Делится");
        }
    }
