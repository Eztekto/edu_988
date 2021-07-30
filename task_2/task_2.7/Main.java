import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        int index = 1;
        String result = "False";
        for (int b = 2; b < a; b++) {
            if (a % b == 0)
                result = "True";
        }
        System.out.println(result);
    }
}
