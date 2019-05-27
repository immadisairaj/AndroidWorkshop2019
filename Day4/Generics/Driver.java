public class Driver {
    public static void main(String[] args) {
        Sample<Integer> sampleInteger = new Sample<>(65);
        System.out.println(sampleInteger);

        Sample<String> sampleString = new Sample<>("Hello");
        System.out.println(sampleString);

        Example<Integer,String> example = new Example<>(5,"Integer");
        System.out.println(example);
    }
}