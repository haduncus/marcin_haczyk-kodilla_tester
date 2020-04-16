// Utwórz klasę RandomNumbers, w której będzie istnieć metoda losująca liczby z zakresu 0-30, tak długo, aż ich suma przekroczy 5000. Napisz dwie metody zwracające
// największą i najmniejszą wylosowaną wartość.

import java.util.Random;

public class RandomNumbers {
    static int min = 20;
    static int max = 0;

    public static void main(String[] args) {
        countRandomNumbers();
    }
    public static int countRandomNumbers() {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int upperLimit = 5000;
        while (sum < upperLimit) {
            int temp = random.nextInt(31);
            returnMin(temp);
            returnMax(temp);
            sum += temp;
            result++;
        }
        System.out.println("Min value = " + min + " Max value = " + max);
        return result;
    }

    public static void returnMin(int temp){
        if(temp < min){
            min = temp;
        }
    }

    public static void returnMax(int temp){
        if(temp > max){
            max = temp;
        }
    }
}