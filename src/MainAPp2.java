class Subject {

String name;
int Id;
int Marks;
   }
class Student1{

    void marks(int X)
    {
        System.out.println("marks obtained: " +X);
    }
    void properties(Subject s1){
        System.out.println(s1.name);
        System.out.println(s1.Id);
        System.out.println(s1.Marks);

    }
}
public class MainAPp2 {

    public static void main(String[] args) {
        Student1 obj = new Student1();
        Subject obj2 = new Subject();

        obj2.name = "Maths";
        obj2.Id = 201;
        obj2.Marks =  80;
        obj.properties(obj2);
    }


}
