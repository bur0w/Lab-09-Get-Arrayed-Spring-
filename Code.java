import java.util.Random;

public class Lab_09_ArrayStuff {

    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }
        System.out.print("Array values: ");
        for (int value : dataPoints) {
            System.out.printf("%d | ", value);
        }
        System.out.println();

        // Calculate and display sum and average
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);
        int userValue = SafeInput.getRangedInt("Enter a value between 1 and 100: ", 1, 100);

        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " appears " + count + " times in the array.");

        // Find first position of userValue
        int firstIndex = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                firstIndex = i;
                break; 
            }
        }
        if (firstIndex != -1) {
            System.out.println("The value " + userValue + " was found at array index " + firstIndex);
        } else {
            System.out.println("The value " + userValue + " was not found in the array.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}
