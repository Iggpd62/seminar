// Класс, описывающий копейщика
public class Spearman extends Character {
    public Spearman(String name, int health, int speed) {
        super(name, health, speed);
    }

    public void thrust() {
        System.out.println(name + " удар копьем!");
    }
}
