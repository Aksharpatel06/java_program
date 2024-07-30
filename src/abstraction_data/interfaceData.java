
interface Info {
    abstract void login();
    abstract void signout();
}

class SingIn implements Info{
    public void login()
    {
        System.out.println("Page is SignIn");
    }

    public void signout()
    {
        System.out.println("Page is SignOut");
    }

}

public class interfaceData{
    public static void main(String[] arg)
    {
        SingIn s1 = new SingIn();

        s1.signout();
        s1.login();

        System.out.println(s1 instanceof SingIn);
    }
}