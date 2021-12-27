package kg.geektech.game.players;

public class Golem extends Hero{
    public Golem(int health, int damage, String name) {
        super(health, damage, SuperAbility.PROTECT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i]) {
                heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage() / 5);
            }
        }
        System.out.println("Wall is a cannon");
    }
}
