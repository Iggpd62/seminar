// Класс, описывающий крестьянина
public class Peasant extends Character {
    public Peasant(String name, int health, int speed) {
        super(name, health, speed);
    }

    public void farm() {
        System.out.println(name + " занимается фермерством!");
    }
}