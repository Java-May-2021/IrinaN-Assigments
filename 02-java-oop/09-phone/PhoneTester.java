public class PhoneTester {
    public static void main(String[] args){
        iPhone apple1 = new iPhone("Iphone 2", 50, "ATT", "Jiling");
        iPhone apple2 = new iPhone("Iphone S", 70, "T-Mobile", "Diling");

        Galaxy g1 = new Galaxy("Galaxy s", 80, "Motorolla", "Biiim");

        apple1.sayHello();
        g1.sayHello();

        apple1.ring();
        g1.ring();

        apple2.displayInfo();


    }
    
}
