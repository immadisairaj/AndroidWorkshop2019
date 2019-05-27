import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;

public class CountryCode {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> countryCodeHashMap = new HashMap<>();
        Scanner scanner = new Scanner(new File("input.csv"));
        Scanner rowScanner = null;

        while(scanner.hasNext()) {
            String rowValue = scanner.nextLine();
            rowScanner = new Scanner(rowValue);
            rowScanner.useDelimiter(",");

            while(rowScanner.hasNext()) {
                System.out.println(rowScanner.next()+" ");
            }
        }
        scanner.close();
    }
}