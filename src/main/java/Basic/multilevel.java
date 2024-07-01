package Basic;

class bird {
    public void bird(){
        String bird_name="penguin";
        System.out.println("bird_name "+ bird_name);
    }
}

class animal extends bird{
    public void animal(){
        String animal_name="elephant";
        System.out.println("animal_name " +animal_name);
    }
}

class vehicle extends animal{
    public void vechile(){
        String vehicle_name="pulsar 150";
        System.out.println("vehicle_name" +vehicle_name);
    }
}

public class multilevel {
    public static void main(String[] args){
        vehicle c2=new vehicle();
        c2.vechile();
        c2.animal();
        c2.bird();
    }
}