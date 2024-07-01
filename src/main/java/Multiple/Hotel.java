package Multiple;

public class Hotel extends Meals implements  lunch,morningtiffen,NightDinner {


    @Override
    public void NightDinner() {
        System.out.println("chapathai and barotta is available");

    }

    @Override
    public void lunch() {
        System.out.println("full meals of veg and non veg is available");


    }

    @Override
    public void tiffen() {
        System.out.println("dosa and idly  is available ");

    }

    public static void main(String[] args){
        Hotel c4=new Hotel();
        c4.meals();
        c4.lunch();
        c4.tiffen();
        c4.NightDinner();
    }
}
