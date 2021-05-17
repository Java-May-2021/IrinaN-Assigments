public class BatTest {

    public static void main(String[] args){

        Bat joon = new Bat();
        System.out.println(joon.energylevel);

        joon.eatHumans();
        joon.eatHumans();
        System.out.println(joon.energylevel);

        joon.attackTown();
        System.out.println(joon.energylevel);

        joon.fly();
        System.out.println(joon.energylevel);

    }
    
}
