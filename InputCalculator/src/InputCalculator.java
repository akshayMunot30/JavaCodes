import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg;
        int count = 0;
        while (true) {
            
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){

                int number = scanner.nextInt();
                count++;
                sum += number;

            }
            else {
                break;
            }
        }
        if (count != 0) {
            avg = Math.round((double) sum / (double) count);
        } else {
            avg = 0;
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
