package kg.geeks.game.players;

import java.util.Random;

public class King extends Hero {
    public King(int health, String name) {
        super(health, 0, name, SuperAbility.SAITAMA);
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random= new Random();
        if (random.nextInt(100) < 10) {
            if (boss.getHealth() > 0 && this.getHealth() > 0) {
                boss.setHealth(boss.getHealth() - boss.getHealth());
                System.out.println("King призвал SAITAMA ");
            }
        }

    }
}
