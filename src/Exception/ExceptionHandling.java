package Exception;

public class ExceptionHandling {

        public static void main(String[] args) {
            System.out.println("aditi");
            try{
                System.out.println(10/0);
            }
            catch(ArithmeticException ae){
                System.out.println("cannot be divided");

            }
        }

    }


