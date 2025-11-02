class Account {
    double balance;

    public double getBal() {
        // validation code
        return balance;
    }
    Account(double balance){
        this.balance = balance;
    }
}
class GPay {
    void getBalance() {
        Account A1 = new Account(200);
        double a1 = A1.getBal();

        System.out.println("balance " + a1);
    }
}

    public class dataHiding {
        public static void main(String[] args) {
            GPay G1 = new GPay();
            G1.getBalance();
        }
    }

