public class AnimalDriver {
    public static void main(String[] args) {
        Animal lion = new Animal("Roar", 4);
        lion.print();

        Lion abc = new Lion("Roar!!", 5, false);
        abc.print();
        abc.print(true);

        Animal lion1 = abc;     //Lion -> Animal
        lion1.print();

        System.out.println(lion);
        System.out.println(abc);

        //Lion lion2 = lion;      //Animal -> Lion
    }
}