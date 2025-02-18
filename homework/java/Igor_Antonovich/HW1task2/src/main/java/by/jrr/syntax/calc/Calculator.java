package by.jrr.syntax.calc;

public class Calculator {

    public static double calculate(int a, int b, String command){
        double result = 0.0;
        switch (command) {
            case "add":
                result = new Addition(a, b).calculate();
                break;
            case "div":
                result = new Division(a, b).calculate();
                break;
            case "mult":
                result = new Multiplication(a, b).calculate();
                break;
            case "rem":
                result = new Remainder(a, b).calculate();
                break;
            case "sub":
                result = new Substraction(a, b).calculate();
                break;
            default:
                System.out.println("Operation not supported");
                break;
        }
        return result;
    }
}
