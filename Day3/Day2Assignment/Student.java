public class Student {
    String name;
    int rollNo;
    String classStudying;
    int age;

    public Student(String name, int rollNo, String classStudying, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.classStudying = classStudying;
        this.age = age;
    }

    public boolean checkAge() throws StudentUnderAgeException {
        if(age >= 18)
            return true;
        else {
            throw new StudentUnderAgeException();
        }
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Class: " + classStudying);
        System.out.println("Age: " + age);
    }
}