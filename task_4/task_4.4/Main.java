public class Main {
    public static void main(String[] args) {
        Mouse JerryMouse = new Mouse("Jerry", 10, 2);
        Cat TomCat = new Cat ("Tom", 25, 8);
        Dog SpikeDog = new Dog ("Spike", 50, 4);
        JerryMouse.action();
        TomCat.action();
        SpikeDog.action();

    }
}
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
    public void action() {System.out.println(name + ": Я ворую сыр!");}
}

class Dog {
    String name;
    int height;
    int tail;

    public Dog(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
        }
    void action() {System.out.println(name + ": Я злюсь на кота!");}
    }


    class Cat {
    String name;
    int height;
    int tail;

    public Cat(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
            }
        void action() {System.out.println(name + ": Я гоняюсь за Jerry!");}
        }
