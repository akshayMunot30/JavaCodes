public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber,double secondNumber) {

        if (((int) (firstNumber * 1000d)) == ((int) (secondNumber * 1000d))) {
            return true;
        } else {
            return false;
        }
    }
}
