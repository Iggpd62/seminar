import java.util.ArrayList;
import java.util.List;
public class Main { public static void main(String[] args) {
    // Создание экземпляров каждого типа персонажей
    Peasant peasant = new Peasant("Крестьянин", 100, 5);
    Rogue rogue = new Rogue("Разбойник", 150, 10);
    Sniper sniper = new Sniper("Снайпер", 130, 8);
    Warlock warlock = new Warlock("Колдун", 80, 6);
    Spearman spearman = new Spearman("Копейщик", 150, 7);
    Crossbowman crossbowman = new Crossbowman("Арбалетчик", 120, 8);
    Monk monk = new Monk("Монах", 90, 5);

    // Выполнение действий каждого персонажа
    peasant.attack();
    peasant.farm();

    rogue.attack();
    rogue.steal();

    sniper.attack();
    sniper.shoot();

    warlock.attack();
    warlock.castSpell();

    spearman.attack();
    spearman.thrust();

    crossbowman.attack();
    crossbowman.shootCrossbow();

    monk.attack();
    monk.meditate();
}
}
