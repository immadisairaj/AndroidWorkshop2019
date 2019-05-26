public class Car {
    String company;
    String color;
    int noOfSeates;

    public Car() {  //Default Constructor
        company = null;
        color = null;
        noOfSeates = 0;
    }

    //Constructor
    public Car(String company, String color, int noOfSeates) {
        this.company = company;
        this.color = color;
        this.noOfSeates = noOfSeates;
    }

    public Car(String company, String color) {
        this.company = company;
        this.color = color;
    }

    public Car(String company) {
        this.company = company;
    }

    //methods

    public void setCompany(String company) {
        this.company = company;
    }

    public void setColor(String color) {    //setter
        this.color = color;
    }

    public void setNoOfSeates(int noOfSeates) {
        this.noOfSeates = noOfSeates;
    }

    public String getCompany() {
        return company;
    }

    public String getColor() {      //getters
        return color;
    }

    public int getNoOfSeates() {
        return noOfSeates;
    }

    public void addSeats(int seats) {
        noOfSeates = noOfSeates + seats;
    }

    public void print() {
        System.out.println(this.company + " " + this.color + " " + this.noOfSeates);
    }
}