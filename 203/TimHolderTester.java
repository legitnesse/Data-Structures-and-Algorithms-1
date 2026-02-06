public class TimHolderTester
{
    public static void main(String[] args) {
        TimHolder t = new TimHolder();
        t.addToBucket("A");
        System.out.println(t.getCurrentBucketSize());
        t.addToBucket("B");
        System.out.println(t.getCurrentBucketSize());
        t.addToBucket("C");
        System.out.println(t.getCurrentBucketSize());
        t.addToBucket("D");
        System.out.println(t.getCurrentBucketSize());
        t.addToBucket("E");
        System.out.println(t.getCurrentBucketSize());
        t.printBucket();
        System.out.println(t.getCurrentBucketSize());
        t.removeBucketElement(0);
        t.printBucket();
        System.out.println(t.getCurrentBucketSize());
        t.removeBucketElement(0);
        t.printBucket();
        System.out.println(t.getCurrentBucketSize());
        t.removeBucketElement(0);
        t.printBucket();
        System.out.println(t.getCurrentBucketSize());
        t.removeBucketElement(0);
        t.printBucket();
        System.out.println(t.getCurrentBucketSize());
        t.removeBucketElement(0);
        t.printBucket();
        System.out.println(t.getCurrentBucketSize());
        t.removeBucketElement(0);
        t.printBucket();
        System.out.println(t.getCurrentBucketSize());
    }
}