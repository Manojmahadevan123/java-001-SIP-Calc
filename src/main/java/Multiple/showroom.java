package Multiple;

class vechiles {
    public void vechiles_details(){
        String vechiles_name1 = "pulser";
        String vechiles_name2 = "hero";
        String vechiles_name3 = "passion pro";
        System.out.println("vechiles_name1"+vechiles_name1+ "vechiles_name2" +vechiles_name2+ "vechiles_name3" +vechiles_name3);
    }

}


interface electric_vehile{
    public void electric_vechile();
}


interface petrol_vechile{
    public void petrol_vechile();
}

class motors extends vechiles implements electric_vehile,petrol_vechile{

    @Override
    public void electric_vechile() {
        System.out.println("this is the only electric vechile");

    }

    @Override
    public void petrol_vechile() {
        System.out.println("this is the only the pertol vechile");

    }
}

public class showroom {
    public static void main(String[] args){
        motors c1=new motors();
        c1.vechiles_details();
        c1.electric_vechile();
        c1.petrol_vechile();
    }
}
