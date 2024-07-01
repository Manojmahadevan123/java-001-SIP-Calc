package Basic;
class bank{
    public void customer_details(){
        String name="manoj";
        String dob="26/01/2005";
        long account = 3465434 ;
        System.out.println("name " +name+ " dob "+dob+"account "+account);
    }
    }
class bank2 extends bank{
    public void customer_id(){
        String address="namakkal";
        System.out.println("address "+address);
    }

}

public class oops {
    public static void main(String[] args){
        bank2 c1=new bank2();
        c1.customer_id();
        c1.customer_details();
    }
}

