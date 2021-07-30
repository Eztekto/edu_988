public class Main {
    public static void main(String[] args) {
        String[] strbox = {"Мама", "Мыла", "Раму"};
        int index = 0;
        int position = 0;
        for (int i = 0; i < strbox.length; i++)
            for (int j = 0; j < strbox.length; j++)
                for (int k = 0; k < strbox.length; k++)
                    if (i != j && j != k && k != i)
                        System.out.println("" + strbox[i] + strbox[j] + strbox[k]);
    }
}
