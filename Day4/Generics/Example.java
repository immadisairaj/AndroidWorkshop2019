public class Example<T,G> {
    T variableT;
    G variableG;

    public Example(T variableT, G variableG) {
        this.variableT = variableT;
        this.variableG = variableG;
    }

    public String toString() {
        return "First variable is " + variableT + " and Second is " + variableG;
    }
}