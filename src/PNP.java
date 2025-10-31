class Book {

    String BookName;
    int BookId;
    double MRP;
    int Page;

}
    class Library{
        Book showBook(Book b1){
           System.out.println(" NAME: " +b1.BookName);
           System.out.println(" ID: " +b1.BookId);
           System.out.println(" MRP: " +b1.MRP);
           System.out.println(" PAGE: " +b1.Page);
            return b1;

     }
}
    public class PNP{
        public static void main(String[] args) {
            Library obj1 = new Library();
             Book obj2 = new Book();

             obj2.BookName = "JAVA";
             obj2.BookId = 905;
             obj2.MRP = 349.00;
             obj2.Page = 579;

            obj1.showBook(obj2); // calling method

        }
    }

