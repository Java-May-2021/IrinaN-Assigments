public class Test {
	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
		
		String strVar = manipulator.trimConcat(" Hello   ","   World! ");
		System.out.println(strVar); 

        // second example
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a);
        System.out.println(b); 
        System.out.println(c);

        // Trim

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer m = manipulator.getIndexOrNull(word, subString);
        Integer n = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(m); 
        System.out.println(n); 

        String word2 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2); 


    }
}