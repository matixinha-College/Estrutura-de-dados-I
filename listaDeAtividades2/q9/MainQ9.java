package listaDeAtividades2.q9;

public class MainQ9 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 3, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0 },
                { 0, 0, 2, 0, 1, 0 },
                { 1, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0 },
        };
        int initialCity = 3;
        int[] resultArray = new int[matrix.length];

        // initialize all elements of resultArray with -1,
        // except the element of the initial city, which should be zero;
        for (int i = 0; i < resultArray.length; i++) {
            if (i == initialCity) {
                resultArray[i] = 0;
            } else {
                resultArray[i] = -1;
            }
        }

        Util.calculateDistances(matrix, initialCity, resultArray);

        // Show the output Array with distances from the initial city
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println("Distance from city " + initialCity + " to city " + i + " is: " + resultArray[i]);
        }
    }
}
