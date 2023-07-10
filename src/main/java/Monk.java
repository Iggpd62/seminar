// Класс, описывающий монаха
public class Monk extends Character {
    public Monk(String name, int health, int speed) {
        super(name, health, speed);
    }

    public void meditate() {
        System.out.println(name + " включает телекинез!");
    }
}
