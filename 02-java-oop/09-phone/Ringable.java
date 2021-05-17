public interface Ringable {

    void ring();

    void unlock();

    default void sayHello() {
        System.out.println("Hello everybody");
    }
    
}
