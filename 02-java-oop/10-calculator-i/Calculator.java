public class Calculator{
    private int Operandone;
    private int Operandtwo;
    private String Operation;
    private int total;

    public void setOperandOne(int a){
        this.Operandone = a;
    }

    public void setOperandtwo(int b){
        this.Operandtwo = b;
    }

    public void setOperation(String c){
        this.Operation = c;
    }

    public Integer performOperation(){
        if (Operation == "+"){
            this.total = Operandone + Operandtwo;
        }
        else if (Operation == "-"){
            this.total = Operandone - Operandtwo;
        }
        return this.total;
    }

    public void getresults(){
        System.out.println("You final total is: " + this.total);
    }


}