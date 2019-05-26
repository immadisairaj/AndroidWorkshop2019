public class Driver {
    public static void main(String[] args) {
        String name = "125";

        int k = Integer.parseInt(name);
        k = k + 1;
        System.out.println(k);

        name = "10.5";
        double l = Double.parseDouble(name);
        l = l + 0.2;
        System.out.println(l);

        String binaryK = Integer.toBinaryString(k);
        System.out.println(binaryK);

        System.out.println(Integer.parseInt("100101", 2));
    }
}