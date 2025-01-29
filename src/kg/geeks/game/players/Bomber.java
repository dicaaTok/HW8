package kg.geeks.game.players;

public class Bomber extends Hero{
    public Bomber(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BYM);
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int bym = 100 ;
        boolean a2 = false ;
        if (this.getHealth() <=0 ){
            a2 = true ;}
        if (boss.getHealth() > 0 && a2 ){
            boss.setHealth(boss.getHealth() - bym );
            System.out.println("Bomber подорался и нанес босу " + bym + " урона ");

        }

    }
}
