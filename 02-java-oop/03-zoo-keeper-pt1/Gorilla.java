public class Gorilla extends Mammal {

    public void throwsomething(){
        System.out.println("I threw something");
        energyLevel -= 5;
    }

    public void eatbanas(){
        System.out.println("I ate a banana");
        energyLevel += 10;
    }

    public void climb(){
        System.out.println("I'm climbing");
        energyLevel -= 10;
    }
    
}
