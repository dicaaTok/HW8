package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Japanese extends Hero{
    public Japanese(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.JAPANESE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth()  < 50){
            this.setHealth(this.getHealth() - this.getHealth() );
            System.out.println("Lol совершил харакири и погиб достойной смерю ");

        }

    }
}
