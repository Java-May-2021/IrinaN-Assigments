public class GorillaTest {
    public static void main(String[] args){
        Gorilla jimbo = new Gorilla();

        System.out.println(jimbo.energyLevel);
        jimbo.energyLevel = 40;
        System.out.println(jimbo.energyLevel);
        jimbo.displayEnergy();
        jimbo.throwsomething();
        jimbo.displayEnergy();
        jimbo.eatbanas();
        jimbo.displayEnergy();
        jimbo.climb();
        jimbo.displayEnergy();
    }
    
}
