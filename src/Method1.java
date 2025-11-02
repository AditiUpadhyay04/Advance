class Mobile
{
    void switchOnMobile(){
        System.out.println(hashCode()+ " phone is on");
    }
    void switchOffMobile(){
        System.out.println(hashCode()+ " phone is off");
    }
}
public class Method1 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
         m1.switchOnMobile();
         m2.switchOffMobile();

    }
}
