// Copy Constructor
// Note: When u copy a array that time the memory is pointed its doesnt create new one,
// So whenever u tries to change after values will be changed.
public class D06_Copy_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sai";
        s1.rollno = 11;

        Student s2 = new Student(s1);
        System.out.println(s2.name);
    }
}

class Student{
    String name;
    int rollno;

    // Copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.rollno = s1.rollno;
    }

    void setname(String name){
        this.name = name;
    }

    Student(){
        System.out.println("Constructor is called...");
    }
}