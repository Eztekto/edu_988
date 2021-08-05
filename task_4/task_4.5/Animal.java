public abstract class Animal {
    boolean vegetarian;
    String speak;
    byte paw;
    public Animal(boolean veg, String speak, byte paw) {
        this.vegetarian = veg;
        this.speak = speak;
        this.paw = paw;
    }
    boolean getVegetarian () {return this.vegetarian;}
    String getSpeak () {return this.speak;}
    byte getPaw () {return this.paw;}
    
}
