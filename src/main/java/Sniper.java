// Класс, описывающий снайпера
public class Sniper extends Character {
    public Sniper(String name, int health, int speed) {
        super(name, health, speed);
    }

    public void shoot() {
        System.out.println(name + " стреляет!");
    }
}