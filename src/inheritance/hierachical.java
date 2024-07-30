class Car {
    public String aCar = "BMW";
    private String bCar = "ODI";
    protected String cCar = "Baleno";


    void setData()
    {
        System.out.print( bCar+" is not Available And this" );   
    }
}

class BMW extends Car { 
    public void getData() {
        System.out.println("Car name is: " + aCar+" And this is Available"); 
    }
}

class Baleno extends Car{
    public void getData() { 
        System.out.println("Car name is: " + cCar+" And this is Available"); 
    }
}


public class hierachical {
    public static void main(String[] arg)
    {
        BMW b1= new BMW();
        b1.setData();
        b1.getData();


        Baleno b2 = new Baleno();
        b2.setData();
        b2.getData();
    }
}
