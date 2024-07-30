
class Truct{


    public void setData()
    {
        System.out.println("Truct is empty");
    } 
}

class Car extends Truct{

    @Override
    public void setData()
    {
        System.out.println("Car is empty");
        super.setData();
    } 
}


public class MethodOver {
    public static void main(String[] arg)
    {
        Car t1 = new Car();

        t1.setData();
        

    }
}
