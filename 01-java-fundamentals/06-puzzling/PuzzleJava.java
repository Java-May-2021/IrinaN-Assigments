import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public static void main(String[] args){
        ArrayList<Integer> myexample = new ArrayList<Integer>();
        myexample.add(5);
        myexample.add(1);
        myexample.add(4);
        myexample.add(2);

        Collections.shuffle(myexample);
        System.out.println(myexample); // [1, 5, 2, 4, 3]

        Functions1 test1 = new Functions1();
        test1.addnumbers();

    }
}
