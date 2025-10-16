class Student{
    int rno;
    String name;
    String address;
    String course;
    double fees;

    Student getStudent(){
        Student s1 = new Student();
        s1.rno = 8;
        s1.name = "aditi";
        s1.address = "xyz";
        s1.course = "b.tech";
        s1.fees = 50000.0;
        return s1;

    }
}
public class Teacher {
    public static void main(String[] args) {
        Student s3 = new Student();

        Student s2 = s3.getStudent();
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.course);
        System.out.println(s2.fees);
        System.out.println(s2.address);




    }
}
