package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero{

    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.STUNNING, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        boolean IsTrue = RPG_Game.random.nextBoolean();
        if (IsTrue) {
            boss.setDamage(boss.getDamage() - boss.getDamage());
        } else {
            System.out.println("Fulminant didn't hit");
        }
    }
}
