package listaDeAtividades2.q8;

import Exception.MyException;
import structures.stack.InterfaceStack;
import structures.stack.StackList;

public class Util {
    public static double EvaluateInput(String input) {
        InterfaceStack<Double> stack = new StackList<Double>();
        String[] tokens = input.split(" ");

        if (tokens.length == 0) {
            throw new MyException("Empty input");
        }

        if (tokens.length < 2) {
            throw new MyException("Invalid operation: " + input);
        }

        if (ValidateInput(input) == false) {
            throw new MyException("Invalid input: " + input);
        }

        for (String token : tokens) {
            processToken(stack, token);
        }

        // Final result
        if (stack.getSize() != 1) {
            throw new MyException("Invalid operation. Remaining operands in the stack." + input);
        }

        return stack.pop();
    }

    public static void processToken(InterfaceStack<Double> stack, String token) {
        // Exception handling

        if (isNumber(token)) {
            processNumber(stack, token);
        } else if (isOperator(token)) {
            processOperator(stack, token);
        } else {
            throw new MyException("Invalid token: " + token);
        }
    }

    public static void processNumber(InterfaceStack<Double> stack, String token) {
        stack.push(Double.parseDouble(token));
    }

    public static void processOperator(InterfaceStack<Double> stack, String token) {
        if (stack.getSize() < 2) {
            throw new MyException("Invalid operation: " + token);
        }
        double v2 = stack.pop();
        double v1 = stack.pop();
        double result = Calculate(token.charAt(0), v1, v2);
        stack.push(result);
    }

    public static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    public static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean ValidateInput(String input) {
        String[] tokens = input.split(" ");
        for (String token : tokens) {
            if (isNumber(token) == false && isOperator(token) == false) {
                return false;
            }
        }
        return true;
    }

    public static double Calculate(char operator, double v1, double v2) {
        double result = 0;

        switch (operator) {
            case '+':
                result = v1 + v2;
                break;
            case '-':
                result = v1 - v2;
                break;
            case '*':
                result = v1 * v2;
                break;
            case '/':
                if (v2 == 0) {
                    throw new ArithmeticException("Division by zero");
                } else
                    result = v1 / v2;
                break;
            default:
                throw new MyException("Invalid operator:" + operator);
        }
        return result;
    }
}
