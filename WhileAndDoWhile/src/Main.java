public class Main {

    public static void main(String[] args) {

/*
        int count = 6;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
*/

/*
        count = 1;
        while(true){
            if(count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++
        }
*//*      count = 6;
        do{
            System.out.println("Count value is " + count);
            count++;
        } while(count < 6);
*/

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("even Number " + number);
            count++;
            if(count == 5) {
                break;
            }
        }
        System.out.println("Found " + count + " even numbers");

    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) ==0){
            return true;
        }
        return false;
    }
}
