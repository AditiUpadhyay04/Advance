package ExceptionDemo;
import java.util.Scanner;
public class ExceptionMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[4];

        for (int i = 0; i <= 3; i++) {
            System.out.println("enter the product " +(i+1)+ "details");

            System.out.println("enter product id: ");
            int id = sc.nextInt();

            System.out.println("enter product name: ");
            String name = sc.next();

            System.out.println("enter product price: ");
            double price = sc.nextDouble();

            products[i] = new Product(id,name,price);

        }
        User u1 = new User();
        u1.findProduct(101);

    }
}
