public class Galaxy extends Phone implements Ringable {
    public Galaxy(String a, int b, String c, String d){
        super(a, b, c, d);
    }
    
    @Override
    public void ring(){
        System.out.println("I am a Galaxy. I'm ringing");
    }

    @Override
    public void unlock(){
        System.out.println("Please unlock my Galaxy");
    }

    @Override
    public void displayInfo(){
        System.out.println("I am Galaxy folks. Here is my ring: ");
        this.ring();

    }

    
    
}
