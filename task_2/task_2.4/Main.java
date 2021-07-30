import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите cумму: ");
        double value = scanner.nextDouble();
        System.out.println("Введите процент: ");
        double percentage = scanner.nextDouble();
        int years = 6;
        for (int i = 1; i < years; i++) {
           value = value + ((value / 100) * percentage);
            {
                if (i == 1)
                    System.out.println("Первый год: " + String.format("%.2f", value));
                if (i == 2)
                    System.out.println("Второй год: " + String.format("%.2f", value));
                if (i == 3)
                    System.out.println("Третий год: " + String.format("%.2f", value));
                if (i == 4)
                    System.out.println("Четвёртый год: " + String.format("%.2f", value));
                if (i == 5)
                    System.out.println("Пятый год: " + String.format("%.2f", value));
            }
        }
    }
}
