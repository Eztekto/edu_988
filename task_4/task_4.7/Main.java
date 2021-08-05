import java.awt.*;

public class Main {
    public static void main(String[] args){
    }
}

interface Animal {
 public static Color getColor(){
      return Color.red;
  };
}



abstract class Fox implements Animal {

    public String getName() {
        return "Fox";
    }
}
