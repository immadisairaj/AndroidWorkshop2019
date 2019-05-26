public class Sample {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            arr[5] = 6;
        } catch(ArrayIndexOutOfBoundsException aoe) {   // or Exception
            System.err.println(aoe);
        } finally {
            System.out.println("Done");
        }
    }
}