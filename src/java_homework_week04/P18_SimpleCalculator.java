package java_homework_week04;

public class P18_SimpleCalculator {
    double firstNumber, secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double a){
        this.firstNumber = a;
    }
    public void setSecondNumber(double b){
        this.secondNumber = b;
    }
    public double getAdditionResult(){
        double result = getFirstNumber() + getSecondNumber();
        return result;
    }
    public double getSubtractionResult(){
        double result1 = getFirstNumber() - getSecondNumber();
        return result1;
    }
    public double getMultiplicationResult(){
        double result2 = getFirstNumber() * getSecondNumber();
        return result2;
        }
    public double getDivisionResult(){
        if (getSecondNumber() == 0){
            return 0;

        } else {
            double result3 = getFirstNumber()/getSecondNumber();
            return result3;
    }

    }

    public static void main(String[] args) {

        P18_SimpleCalculator calculator = new P18_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
