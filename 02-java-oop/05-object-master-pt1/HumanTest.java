public class HumanTest {
    public static void main(String[] args){
        Human john = new Human();
        Human chris = new Human();

        System.out.println(john.health);
        System.out.println(john.intelligence);
        System.out.println(john.strength);
        System.out.println(chris.health);

        chris.attack(john);
        System.out.println(john.health);


    }
    
}
