import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int n = scan.nextInt();
        Student[] students = new Student[n];
        int c = 0;
        Student student;
        String name;
        int rollNo;
        String classStudying;
        int age;
        for(int i=0; i<n; i++) {
            System.out.println();
            System.out.println("Enter Student " + (i+1) + " Details:");
            System.out.print("Enter name: ");
            scan.nextLine();
            name = scan.nextLine();
            System.out.print("Enter roll no: ");
            rollNo = scan.nextInt();
            System.out.print("Enter class: ");
            scan.nextLine();
            classStudying = scan.nextLine();
            System.out.print("Enter age: ");
            age = scan.nextInt();
            student = new Student(name, rollNo, classStudying, age);

            boolean check = false;
            try {
                check = student.checkAge();
            } catch(StudentUnderAgeException sue) {
                System.err.println(sue);
            } finally {
                if(check)
                    students[c++] = student;
            }
        }

        for(int i=0; i<c; i++) {
                System.out.println();
                System.out.println("Student " + (i+1) + " Details");
                students[i].print();
            }
    }
}