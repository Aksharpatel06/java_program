class Animal {
    public String name;


    public Animal(String name)
    {
        this.name = name;
        close();
    } 


    public void close() {
        System.out.println("Cleaning up Animal: " + name);
    }
}

public class ConAndDescon
{
    public static void main(String[] arg){
        new Animal("Dog");
    } 
}