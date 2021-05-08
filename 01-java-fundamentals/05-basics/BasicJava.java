import java.util.ArrayList;
import java.lang.reflect.Array;

public class BasicJava {
    public static void main(String[] args){

        //print 1 - 255
        public static void upto255(){
            for (int i=0; i<256; i++){
                System.out.println(i);
            }
        }

        // odd numbers in 1-255
        public static void onlyodd255(){
            for (int i=0; i<256; i++){
                if (i%2 == 1){
                    System.out.println(i);
                }
            }
        }

        // sum to 255
        public static void sumto255(){
            int sum = 0;
            for (int i = 0; i<256; i++){
                sum = sum + i;
            }
            System.out.println(sum);
        }

        public static void printarray(int[] numbers){
            for (int i = 0; i<numbers.length; i++){
                System.out.println(numbers[i]);
            }
        }

        public static void maxarray(int[] numbers){
            int max = 0;
            for (int i = 0; i<numbers.length; i++){
                if (max < numbers[i]){
                    max = numbers[i];
                }
            }
            System.out.println(max);
        }

        public static void averagearray(int[] numbers){
            int sum = 0;
            for (int i = 0; i<numbers.length; i++){
                sum = sum + i;
            }
            System.out.println(sum/numbers.length);
        }

        public static void addodd255toarray(){
            int a[];
            for (int i=0; i<256; i++){
                if (i%2 == 1){
                    a.add(i);
                }
            }
        }

        // how many numbers in a given array above a given number
        public static void numbersabovey(int[] numbers, int y){
            int count = 0;
            for (int i = 0; i<numbers.length; i++){
                if (numbers[i] > y){
                    count = count + 1;
                }
            }
            System.out.println(count);
        }

        // int a[] = [1, 3, 5]; // created an array "a"
        // int y; 
        // numbersabovey(a[], y);

        public static void squarearray(int[] numbers){
            for (int i=0; i<numbers.length; i++){
                numbers[i] = numbers[i] * numbers[i];
                System.out.println (numbers[i]);
            }
        }

        public static void changenegativetozero (int[] numbers){
            for (int i=0; i<numbers.length; i++){
                if (numbers[i] < 0){
                    numbers[i] = 0;
                }
                System.out.println(numbers[i]);
            }

        public static void maxminave(int[] numbers){
            int max = 0;
            int min = 1000000000;
            int sum = 0;

            for (int i = 0; i<numbers.length; i++){
                if (numbers[i] > max){
                    max = numbers[i];
                }

                if (numbers[i] < min){
                    min = numbers[i];
                }
                sum = sum + numbers[i];
            }

            int a[];
            a.add(max);
            a.add(min);
            a.add(sum/numbers.length);

            for (int j = 0; j<a.length; j++){
                System.out.println(a[j]);
            }            
        }
    }
}
