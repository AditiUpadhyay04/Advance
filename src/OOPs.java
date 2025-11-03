// inheritance with EXTENDS keyword

class Card{

    //properties--> common for creditCard and debitCard
    long cardNumber;

    void checkBalance(){
        System.out.println("Parent");
    }
}
   class DebitCard extends Card{
    double availableBalance;
    void DebitBalance(){
        System.out.println("DEBIT BALANCE");

    }
}
class CreditCard extends Card{
    double availableCreditLimit;
    void CreditBalance(){
        System.out.println("CREDIT BALANCE");

    }
}

public class OOPs{
    public static void main(String[] args) {
        CreditCard cr = new CreditCard();
        cr.cardNumber = 12341234L;
        cr.checkBalance();
        cr.availableCreditLimit = 5094.94D;
        cr.CreditBalance();
    }
}
