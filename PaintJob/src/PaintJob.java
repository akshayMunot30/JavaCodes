public class PaintJob {

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }
        int bucketCount = 0;
        double areaCoveredInPresentBuckets = areaPerBucket * (double) extraBuckets;
        while ((width * height) > (areaCoveredInPresentBuckets)) {
            areaCoveredInPresentBuckets += areaPerBucket;
            bucketCount += 1;
        }
        return bucketCount;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        int bucketsToBuy = 1;
        double areaCovered = areaPerBucket * bucketsToBuy;
        while((areaCovered) < (width * height)) {
            bucketsToBuy += 1;
            areaCovered = areaPerBucket * bucketsToBuy;
        }
        return bucketsToBuy;
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        if((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        int bucketsToBuy = 1;
        double areaCovered = areaPerBucket * bucketsToBuy;
        while((areaCovered) < (area)) {
            bucketsToBuy += 1;
            areaCovered = areaPerBucket * bucketsToBuy;
        }
        return bucketsToBuy;
    }
}
