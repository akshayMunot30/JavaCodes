import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myArray = getIntegers(5);
        System.out.println("Original Array is:");
	    printArray(myArray);
	    myArray = sortIntegers(myArray);
        System.out.println("Sorted Array is:");
	    printArray(myArray);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values:\r");
        int[] array = new int[number];
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] sortIntegers(int[] array) {
        int temp;
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i]<array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
