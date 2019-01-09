
public class HamburgerDriver
{
    public static void main(){
        
        // make one instance of the Hamburger class
        Hamburger hamburger1=new Hamburger();
        Hamburger hamburger2=new Hamburger();
        Hamburger hamburger3=new Hamburger(true,3,"cheddar");
        Hamburger hamburger4=new Hamburger(false,4,"bun");
        System.out.println(hamburger3.toString());
        //print the toString of the object
        System.out.println(hamburger1.toString());
        System.out.println();
        System.out.println(hamburger2.toString());
    }
}

