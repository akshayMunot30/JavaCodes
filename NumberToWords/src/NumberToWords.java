public class NumberToWords {

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            number /= 10;
            count += 1;
        } while (number != 0);
        return count;
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while(number != 0) {
            int lastDigit = number % 10;
            reverseNumber *= 10;
            reverseNumber += lastDigit;
            number /= 10;
        }
        return reverseNumber;
    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.print("Invalid Value");
        }
        int reversed = reverse(number);
        int reversedNumber = reversed;
        do {
            int lastDigit = reversed % 10;
            switch(lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            reversed /= 10;
        }while(reversed != 0);
        int diff = getDigitCount(number) - getDigitCount(reversedNumber);
        for(int i=0; i<diff; i++) {
            System.out.print("Zero ");
        }
        System.out.println();
    }
}
