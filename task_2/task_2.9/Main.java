public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5};
        String result = "Нет";
        for (int i : nums){
            if (i == 5)
                result = "Да";
        }
        System.out.println(result);

           }
    }
