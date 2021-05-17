public class iPhone extends Phone implements Ringable {
    public iPhone(String a, int b, String c, String d){
        super(a, b, c, d);
    }
    
    @Override
    public void ring(){
        System.out.println("I am an iPhone. I'm ringing");
    }

    @Override
    public void unlock(){
        System.out.println("Please unlock my iPhone");
    }

    @Override
    public void displayInfo(){
        System.out.println("I am an iPhone folks. Here is my ring: ");
        this.ring();

    }


    
}
