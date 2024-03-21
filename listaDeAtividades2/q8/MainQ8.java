package listaDeAtividades2.q8;

public class MainQ8 {
    public static void main(String[] args) {
        try {
            String expression = "3 4 2 * +"; // Represents the expression (3 + (4 * 2))
            double result = Util.EvaluateInput(expression);
            System.out.println("Result of the expression: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
    }
}