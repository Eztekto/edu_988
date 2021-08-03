public class Main {
    public static void main(String[] args)
    {
        int num[] = {4,2,6,2,65};

        reverse(num,0);
    }

    public static void reverse(int[] arr, int position){
        if(position == arr.length){
            return;
        }

        reverse(arr, position + 1);
        System.out.println(arr[position]);
    }
}
