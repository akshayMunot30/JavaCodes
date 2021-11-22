public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if((smallCount<0) || (bigCount<0) || (goal<0)) {
            return false;
        }

        if(goal > (smallCount + (bigCount*5))) {
            return false;
        }else {
            return (goal % 5 <= smallCount);
        }
    }
}
