

abstract class Vehicle {
    public void stop()
    {
        System.out.println("Car is Stop");
    } 
    abstract void running();
}

class BMW extends Vehicle{
    void running()
    {
        System.out.println("Car is runnig");
    }
}

public class Abstract{
    public static void main(String[] args)
    {

        BMW bmw = new BMW();
        bmw.running();
        bmw.stop();

    }
}