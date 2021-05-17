public class CalculatorTest {
    public static void main(String[] args){
        Calculator test1 = new Calculator();
        test1.setOperandOne(4);
        test1.setOperation("+");
        test1.setOperandtwo(8);
        test1.performOperation();
        test1.getresults();

        Calculator test2 = new Calculator();
        test2.setOperandOne(5);
        test2.setOperation("-");
        test2.setOperandtwo(3);
        test2.performOperation();
        test2.getresults();
    }
    
}
