public class D extends C {
    public void sayB() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        D d = new D();
        d.sayA();
        d.sayB();
        d.say();
    }
}