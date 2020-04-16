import org.w3c.dom.ls.LSOutput;
import java.util.Random;

public class Loops {
    public static void main(String[] args) {

        // Wyświetlanie elementów tablicy

        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};

        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // Suma elementów tablicy

        int[] randomNumArr = new int[10];
        int sum = 0;
        for (int i = 0; i < randomNumArr.length; i++) {
            randomNumArr[i] = (int) (Math.random() * 10);
            sum = sum + randomNumArr[i];
                if (i < randomNumArr.length-1) {
                    System.out.print(randomNumArr[i] + " + ");
                }else {
                    System.out.print(randomNumArr[i] + " = ");
                }
        }
        System.out.println(sum);
    }
}