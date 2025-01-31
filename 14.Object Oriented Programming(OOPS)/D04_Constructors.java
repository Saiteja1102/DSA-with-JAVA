// Constructors

public class D04_Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Saiteja";
    }
}

class Student{
    String name;
    int rollno;

    Student(){
        System.out.println("Constructor is called...");
    }
}