public class Ninja extends Human {
    int stealth = 10;

    public void steal(Human a){
        System.out.println("Ninja is stealing");
        a.health -= this.stealth;
        this.health += this.stealth;
    }

    public void runaway(){
        System.out.println("Ninja is running away");
        a.health -= 10;
    }
    
}
