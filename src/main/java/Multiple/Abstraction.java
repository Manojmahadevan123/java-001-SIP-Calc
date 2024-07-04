package Multiple;

abstract class Abs {
    public void intern(){
        System.out.println("i am manoj");
    }
    abstract void nativeplace();
    abstract void livingpalce();
}

class house extends Abs{

    @Override
    void nativeplace() {

    }

    @Override
    void livingpalce() {

    }
//    public void intern(){
//        System.out.println("i am engineer");
//    }

}

public class Abstraction {
    public static void main(String[] args) {
        house obj=new house();
        obj.intern();
    }
}