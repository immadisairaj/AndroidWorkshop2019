public class Number {
    public static void main(String[] args) {
        double number = 1.6;
        int intNumber = (int) number;
        System.out.println(number);
        System.out.println(intNumber);

        float card = (float) 6.1;
        switch(card) {
            case 1.1: System.out.println("1st Card");
                    break;
            case 2.5: System.out.println("2nd Card");
                    break;
            case 7.6: System.out.println("7th Card");
                    break;
            case 9.2: System.out.println("9th Card");
                    break;
            default:    System.out.println("No card");
        }
    }
}