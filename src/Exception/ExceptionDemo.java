package Exception;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            System.out.println("risky code");
            System.out.println(10/0);

        } catch (ArithmeticException e) {
            System.out.println("handling code");

        }
        finally{
            System.out.println("closing database connection");

        }
    }
}