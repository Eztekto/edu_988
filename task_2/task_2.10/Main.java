public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 4};
        String result = "Нет";
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j])
                    result = "Да";
        System.out.println(result);
    }
}
