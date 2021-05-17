public class Samurai extends Human{
    int health = 200;

    public void deathblow (human a){
        a.health = 0;
        this.health -= 100;
    }

    public void mediate (){
        this.health += 100;
    }
    
}
