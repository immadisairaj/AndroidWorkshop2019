public class Lion extends Animal {  //inheretence
    boolean hunt;

    public Lion() {
        this.says = null;
        this.legs = 0;
        this.hunt = false;
    }

    public Lion(String says, int legs, boolean hunt) {
        this.says = says;
        this.legs = legs;
        this.hunt = hunt;
    }

    public void setHunt(boolean hunt) {
        this.hunt = hunt;
    }

    public boolean getHunt() {
        return hunt;
    }

    @Override
    public void print() {   //Overriding
        if(hunt)
            System.out.println("I " + says + ", have " + legs + " legs and hunt");
        else
            System.out.println("I " + says + ", have " + legs + " legs and don't hunt");
    }

    public void print(boolean p) {      //Overloading
        if(p)
            System.out.println("hunt");
        else
            System.out.println("no hunting");
    }

    public String toString() {
        if(hunt)
            return "I " + says + ", have " + legs + " legs and hunt";
        else
            return "I " + says + ", have " + legs + " legs and don't hunt";
    }
}