import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Введите число: ");
            arr[i] = scanner.nextInt();
        }
        int sum = 1, count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                sum++;
                if (sum > count) {
                    count = sum;
                }
            }else sum = 1;
        }

            System.out.println(count);
        }
    }
