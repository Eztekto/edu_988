import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число десять: ");
        int a = scanner.nextInt();
        if (a == 10) {
                System.out.println("Верно");
            }
        if (a != 10) {
            System.out.println("Неверно");


        }
    }
}
