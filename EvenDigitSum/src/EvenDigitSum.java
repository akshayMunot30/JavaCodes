public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        int sum = 0;
        int remainder = number ;
        while (remainder > 0) {
           number = remainder % 10;
           remainder /= 10;

           if(number % 2 == 0) {
               sum += number;
           }
        }
        return sum;
    }
}
