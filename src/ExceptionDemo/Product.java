package ExceptionDemo;

public class Product {
     private int id;
     private String name;
     private  double price;
    Product[] arr;
    private Product[] products;

    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;

    }
    public Product[] getProduct(Product product){
        return new Product[]{product};
    }
    public void setProduct(Product[] products){
        this.products = products;
    }
    public void getid(){
        this.id = id;
    }

    public String toString(){
        return "Product{id =" +id+ " name" +name+ "price=" +price+"}";
    }

    public int getId() {
        return 0;
    }
}
