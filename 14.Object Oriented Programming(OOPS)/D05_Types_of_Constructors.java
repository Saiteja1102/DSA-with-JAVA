// Types of Constructors
// 1. Non-parameterized
// 2. Parameterized
// 3. Copy Constructor

public class D05_Types_of_Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(21);
        Student s3 = new Student("Sai");
        System.out.println(s3.name);
        System.out.println(s2.rollno);
        System.out.println(s1.name);
    }
}

class Student{
    String name;
    int rollno;

    Student(){
        System.out.println("Constructor is called...");
    }
    Student(int rollno){
        this.rollno = rollno;
    }
    Student(String name){
        this.name = name;
    }
}
