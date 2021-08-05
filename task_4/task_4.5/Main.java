public class Main {
    public static void main(String [] args) {
        Horse mustang = new Horse(true,"Игого", (byte) 4, "Мустанг", "Коричневый");
        Pegasus ares = new Pegasus(true,"Игого", (byte) 4, "Рысак", "Белый");
        ares.fly();
        mustang.run();

    }
}
