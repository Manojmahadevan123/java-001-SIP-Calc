package Multiple;


public class Encapsulation {
    private long account_no ;
    private double balance ;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccount_no() {
        return account_no;
    }

    public void setAccount_no(long account_no) {
        this.account_no = account_no;
    }

public static void main(String[] args) {
        Encapsulation c1= new Encapsulation();

        c1.setAccount_no(341255234);
        c1.setBalance(50000);
        System.out.println("enter the accountno : "+c1.getAccount_no());
    System.out.println("enter the balance :"+c1.getBalance());
}
}

