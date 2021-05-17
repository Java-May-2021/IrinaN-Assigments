import java.util.ArrayList;
import java.util.Random;

class PracticeExceptions {

    public static void main(String[] args) {
        ArrayList<Object> myList1 = new ArrayList<Object>();
        myList1.add("13");
        myList1.add("another string");
        myList1.add(48);
        myList1.add("last string");


        for(int i = 0; i < myList1.size(); i++) {
            try {
                Integer castedValue = (Integer) myList1.get(i);  
            } catch(ClassCastException e) {
                System.out.println("We have a cast issue!");
            }
        }
    }

