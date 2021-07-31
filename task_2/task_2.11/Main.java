public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        String result = "Попыток " + 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > 10){
                result = "Попыток " + (i);
                break;
            }
        }
        System.out.println(result);
    }
}
