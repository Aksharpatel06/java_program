class Animal {
    public String name;


    public void setData(String name)
    {
        this.name = name;
    } 

    public void getData()
    {
        System.out.print("Animal name is :"+this.name);
    }
}

public class ThisKey
{
    public static void main(String[] arg){
        Animal a1 = new Animal();

        a1.setData("Dog");
        a1.getData();
    } 
}