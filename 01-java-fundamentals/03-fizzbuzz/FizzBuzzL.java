public class FizzBuzzL {
    public String fizzBuzz(int num) {
        if(num % 5 ==0 && num % 3 == 0) {
            return "FizzBuzz";
        } else if (num % 5 == 0) {
            return "Fizz";
        } else if (num % 3 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(num);
        }
    } 


public void display(){
    for (int i = 0; i<50; i++) {
        String result = fizzBuzz(i);
        System.out.println("Number: " + i + " - " + " Result: " + result);
    }
}
}
