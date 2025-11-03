import java.util.Scanner;

class User{
   private int id;
   private String name;
   private String address;
   private long contact;

   User(int id ,String name , String address , long contact) {
        this.id = id;
       this.name = name;
       this.address = address;
       this.contact = contact;
    }


    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class UserService {
    void getUserData(User user) {
        if (verification.verifyUser(222)){
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println(user.getAddress());
            System.out.println(user.getContact());
            System.out.println();

        }

    }
}

public class SetterGetter {
    public static void main(String[] args) {
        System.out.println("ENTER THE PIN: ");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        System.out.println("enter the details :" );
        System.out.println("ENTER THE ID: ");
        int id = sc.nextInt();
        System.out.println("ENTER THE NAME: ");
        String name = sc.next();
        System.out.println("ENTER THE ADDRESS: ");
        String address = sc.next();
        System.out.println("ENTER THE CONTACT: ");
        Long contact = sc.nextLong();
        User U = new User(id , name , address , contact);
        UserService U2 = new UserService();
        U2.getUserData(U);
        boolean check = verification.verifyUser(pin);



    }
}

class verification {
    static boolean x = false;

    public static boolean verifyUser(int pin) {
        if (pin == 222) {
            x = true;
        } else if (pin == 111) {
            x = true;
        } else {
            x = false;
        }
        return x;

    }

}
