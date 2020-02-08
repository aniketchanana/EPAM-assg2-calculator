package calculator;
import operations.ArithmeticOperations;
public class Calculator {
    private ArithmeticOperations operation;
    public Calculator(){
        operation = new ArithmeticOperations();
    }
    public float operate(char operator,int a,int b){
        switch (operator){
            case '+':
                return this.operation.add(a,b);
            case '-':
                return this.operation.sub(a,b);
            case '*':
                return this.operation.mul(a,b);
            case '/':
                return this.operation.divide(a,b);
        }
        System.out.println("Operator not found");
        return -1;
    }
}
