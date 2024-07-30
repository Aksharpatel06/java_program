class Car {
    public String aCar = "BMW";
    private String bCar = "ODI";
    protected String cCar = "Baleno";


    void setData()
    {
        System.out.println( bCar+" is not Available" );   
    }
}

class BMW extends Car { 
    public void getData() {
        System.out.println("Car name is: " + aCar); 
        System.out.println("Car name is: " + cCar);
    }
}

class Wheel extends BMW{
    public void getWheelData() { 
        System.out.println("Car name is: " + aCar +"And Wheel is 4 "); 
    }
}

public class multilevel {
    public static void main(String[] arg){

        Wheel w1 = new Wheel();
        w1.setData();
        w1.getData();
        w1.getWheelData();
    }
}
