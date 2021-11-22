public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        if((num1<10 || num1>99) || (num2<10 || num2>99)) {
            return false;
        }

        while (true) {
            int numb1 = num1 % 10;
            num1 /= 10;

            int numb2 = num2 % 10;
            num2 /= 10;

            if((numb1==numb2) || (numb1==num2) || (num1==numb2) || (num1==num2)) {
                return true;
            }
            return false;
        }
    }
}
