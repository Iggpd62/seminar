// Класс, описывающий арбалетчика
public class Crossbowman extends Character {
    public Crossbowman(String name, int health, int speed) {
        super(name, health, speed);
    }

    public void shootCrossbow() {
        System.out.println(name + " стреляет из арбалета!");
    }
}
