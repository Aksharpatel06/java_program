
class Truct{


    public void setData()
    {
        System.out.println("Truct is empty");
    } 

    public void setData(int num)
    {
        System.out.println("Truct is "+num+" wheels");
    } 

    public void setData(int num, int num1)
    {
        System.out.println("Truct is "+num+" wheels And passenger num : "+num1);
    } 

    public void setData(String name)
    {
        System.out.println("Truct  travel name is "+name);
    } 

}
public class MethodLoad {
    public static void main(String[] arg)
    {
        Truct t1 = new Truct();

        t1.setData();
        t1.setData(4);
        t1.setData(4, 10);
        t1.setData("Ramesh");

    }
}
