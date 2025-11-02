package ExceptionDemo;

public class User
{
    private Product product;

    public User(Product product)
    {
        this.product = product;
    }

    public User() {

    }

    public void findProduct(int id )
    {
        Product[] products = product.getProduct(product);
        boolean  found = false;

        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("product found : " + product);
                found = true;
                break;
            }

        }

    }
}
