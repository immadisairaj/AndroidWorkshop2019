public class Sample<G> {
    G variable;

    public Sample(G variable) {
        this.variable = variable;
    }

    public String toString() {
        return "The Input is: " + variable;
    }
}