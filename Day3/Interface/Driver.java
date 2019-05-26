public class Driver implements Example, Example1 {
    public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String something) {
        System.out.println(something);
    }

    public void sayGoodBye() {
        System.out.println("Good Bye");
    }

    public static void main(String[] args) {
        Driver d = new Driver();
        d.sayHello();
        d.saySomething("Something");
        d.sayGoodBye();
    }
}