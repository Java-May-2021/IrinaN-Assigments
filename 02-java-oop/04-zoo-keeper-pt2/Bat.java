public class Bat{
    int energylevel = 300;

    public void eatHumans(){
        System.out.println("I just ate a human");
        energylevel +=25;
    }

    public void attackTown(){
        System.out.println("I attacked a town");
        energylevel +=100;
    }

    public void fly(){
        System.out.println("Ooooosh");
        energylevel -=50;
    }
}