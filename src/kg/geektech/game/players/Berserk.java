package kg.geektech.game.players;

public class Berserk extends Hero{
    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        this.setDamage(this.getDamage() + boss.getDamage() / 5);
        System.out.println("Tor hit");
    }
}
