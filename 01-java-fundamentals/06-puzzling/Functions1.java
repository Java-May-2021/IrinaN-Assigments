import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Functions1 {

    /* Task 1:Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
        Print the sum of all numbers in the array. Also have the function return an array that only 
        includes numbers that are greater than 10 (e.g. when you pass the array above, 
        it should return an array with the values of 13,25,32)?*/ 

    public static void addnumbers(){
        int[] task1 = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        for (int i = 0; i<task1.length; i++){
            sum = sum + task1[i];}
        System.out.println(sum);
    }

    /* Create an array with the following values: Nancy, Jinichi, 
    Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. 
    Have the method also return an array with names that are longer than 5 characters.*/

    public static void shuffleprint(){
        ArrayList<String> task2 = new ArrayList<String>();
        task2.add("Nancy");
        task2.add("Jinichi");
        task2.add("Fujibayashi");
        task2.add("Momochi");
        task2.add("Ishikawa");
        System.out.println(task2); 

        Collections.shuffle(task2);
        System.out.println(task2); 

        for (String name : task2){
            if (name.length() > 5){
                System.out.println(name);
            } else {continue;}
        }
    }

        /* Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
        Shuffle the array and, after shuffling, display the last letter from the array. Have it 
        also display the first letter of the array. 
        If the first letter in the array is a vowel, have it display a message.*/

        
    public static void shufflealph(){
        ArrayList<String> task3 = new ArrayList<String>();
        task3.add("a");
        task3.add("b");
        task3.add("c");
        task3.add("d");
        task3.add("e");
        task3.add("f");
        task3.add("g");
        task3.add("h");
        task3.add("i");

        System.out.println(task3); 

        Collections.shuffle(task3);
        System.out.println(task3); 

        if (task3.get(0)=="a" || task3.get(0)=="e" || task3.get(0)=="i"){
            System.out.println("Our first letter is a vowel");
        }
    }

    // Generate and return an array with 10 random numbers between 55-100.

    public static void random10(){
        Random rand = new Random();
        ArrayList<Integer> ourarray = new ArrayList<Integer>(10);
        for (int k = 0; k<11; k++){
            int a = rand.nextInt(100);
            ourarray.add(a);
            System.out.println(a);
        }

        Collections.sort(ourarray);
        System.out.println(ourarray); 

    }

}
