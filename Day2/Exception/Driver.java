public class Driver {
    public static void main(String[] args) {
        Car car = new Car();

        try {
            car.go();
        } catch(Exception e) {
            System.err.println(e);
        }
        car.setFuel(0);
        try {
            car.go();
        } catch(Exception e) {
            System.err.println(e);
        }
    }


    /*
    try {

    } catch(ArrayIndexOutOfBoundExceprion aoe) {

    } catch(IOException ioe) {

    } finally {

    }
    */
}