package kg.geektech.game.players;

public class Magic extends Hero{
    public Magic(int health, int damage,String name) {
        super(health, damage,
                SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i]) {
                boss.setHealth(boss.getHealth() - heroes[i].getDamage() + 10);
            }
        }
        System.out.println("Aladava did it");
    }
}
