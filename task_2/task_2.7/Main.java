import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        int index = 1;
        for (int b = 2; b < a; b++) {
            if (a % b != 0)
                System.out.println(++index + ". False");
            else
                System.out.println(++index + ". True");
        }
    }
}
// Я пытался сделать так, чтобы он выводил только один раз результат, но так выходило, что если ставить команду break, то он выдывал только результат деления на 2.
// Как сделать так, чтобы он перебирал результаты, и выдавал только True, если там есть хотя бы один такой результат я не дошёл.
