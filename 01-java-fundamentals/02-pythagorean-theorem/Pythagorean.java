

public class Pythagorean {
    public static double calculateHypotenuse (int lenA, int lenB) {
        return Math.sqrt((lenA * lenA ) + (lenB * lenB));
    } 

    public static void main (String[] args){
        Pythagorean a = new Pythagorean();
        System.out.println(a.calculateHypotenuse(3, 4));

    }
}





