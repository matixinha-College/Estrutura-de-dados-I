package listaDeAtividades2.q9;

import structures.queue.InterfaceQueue;
import structures.queue.QueueArray;
public class Util {
    
    public static void calculateDistances(int[][] matrix, int initialCity, int[] resultArray) {
        InterfaceQueue<Integer> queue = new QueueArray<Integer>(matrix.length);
        queue.add(initialCity);
        resultArray[initialCity] = 0;

        while (!queue.isEmpty()) {
            int currentCity = queue.remove();
            stepCity(matrix, resultArray, queue, currentCity);
        }
    }
    
    public static void stepCity(int[][] matrix, int[] resultArray, InterfaceQueue<Integer> queue,
            int currentCity) {
        for (int visitedCity = 0; visitedCity < matrix.length; visitedCity++) {
            int distance = matrix[currentCity][visitedCity];
            if (distance > 0 && resultArray[visitedCity] == -1) {
                resultArray[visitedCity] = resultArray[currentCity] + distance;
                queue.add(visitedCity);
            }
        }
    }
}
