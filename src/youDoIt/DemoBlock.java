package youDoIt;

public class DemoBlock {

    public static void main(String [] args)
    {
        System.out.println("Demonstrating Block Scope");
        int x = 1111;
        {
            int y = 2222;
            System.out.println("In this block x is " + x);
            System.out.println("In this block y is " + y);
        }
        {
            int y = 0000;
            System.out.println("In this block x is " + x);
            System.out.println("In this block y is " + y);
            demoMethod();
            System.out.println("After method block, x is " + x);
            System.out.println("After method block, y is " + y);
        }
        System.out.println("At the end x is " + x);
    }
    public static void demoMethod()
    {
        int x = 5555;
        int y = 4444;
        System.out.println("After method block, x is " + x);
        System.out.println("After method block, y is " + y);
    }

}
