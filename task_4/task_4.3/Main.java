public class Main {
    public static void main(String[] args) {
        Cat white = new Cat(4,5,10);
        Cat black = new Cat(3,4, 9);
        System.out.println(white.fight(black));
        System.out.println(black.fight(white));
    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(int age, int weight, int strength) {
        this.strength = strength;
        this.weight = weight;
        this.age = age;


    }

    public boolean fight (Cat anotherCat) {
        int win = 0;
        if (age > anotherCat.age){
            win++;
        }
        else win--;
        if (strength > anotherCat.strength){
            win++;
        }
        else win--;
        if (weight > anotherCat.weight){
            win++;
        }
        else win--;

        if (win > 2) {
            return true;
        }
        else return false;



    }
}
