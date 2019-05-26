public abstract class C implements A,B {
    public void sayA() {
        System.out.println("A");
    }

    public void say() {
        System.out.println("say");
    }

    abstract public void sayB();
}