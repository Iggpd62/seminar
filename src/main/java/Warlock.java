// Класс, описывающий колдуна
public class Warlock extends Character {
    public Warlock(String name, int health, int speed) {
        super(name, health, speed);
    }

    public void castSpell() {
        System.out.println(name + " произносит заклинание!");
    }
}
