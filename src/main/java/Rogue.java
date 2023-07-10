// Класс, описывающий разбойника
public class Rogue extends Character {
    public Rogue(String name, int health, int speed) {
        super(name, health, speed);
    }

    public void steal() {
        System.out.println(name + " грабит!");
    }
}