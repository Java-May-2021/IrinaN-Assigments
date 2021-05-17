public class Wizard extends Human {

    int intelligence = 8;
    int health = 50;

    public void heal(Human a){
        System.out.println("Wizard is healing");
        a.health += this.intelligence;
    }
    
    public void fireball(Human a){
        System.out.println("Wizard is fireballing");
        a.health -= (this.intelligence)*3;
    }
}