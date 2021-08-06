import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> MainMap = new HashMap<>();
        MainMap.put("Москва", "Ивановы");
        MainMap.put("Киев", "Петровы");
        MainMap.put("Лондон", "Абрамовичи");

        String newstring = reader.readLine();
        if (newstring != "") {
            String familyName = MainMap.get(newstring);
            System.out.println(familyName);
        }
    }
}
