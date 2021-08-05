public class Horse extends Animal {
    String breed;
    String color;

    public Horse(boolean veg, String speak, byte paw, String breed, String color) {
        super(veg, speak, paw);
        this.breed = breed;
        this.color = color;
    }
   void run() {
        System.out.println(speak + ", я поскакал!");
    }

}
