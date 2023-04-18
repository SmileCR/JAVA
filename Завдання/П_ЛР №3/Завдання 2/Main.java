import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[120];
        Random random = new Random();

        // заповнення масиву випадковими числами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(141) - 70;
        }

        // виведення масиву на екран
        System.out.println("Масив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // обчислення середньої довжини неперервних додатних послідовностей
        int positiveCount = 0;
        int sequenceCount = 0;
        double sequenceSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
                if (i == 0 || arr[i - 1] <= 0) {
                    // починається нова послідовність
                    sequenceCount++;
                }
                sequenceSum++;
            }
        }
        if (positiveCount == 0) {
            System.out.println("В масиві немає додатніх елементів");
        } else {
            double averageSequenceLength = sequenceSum / sequenceCount;
            System.out.println("Середня довжина неперервних додатних послідовностей: " + averageSequenceLength);
        }
    }
}
