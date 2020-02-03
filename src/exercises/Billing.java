package exercises;

public class Billing {
    //Author: Meghan Nahnybida
    //Date: 2/3/2020

    private static final double TAX = .08;
    private static double photoBookPrice;
    private static int quantityOrdered;

    public static void computeBill(double price)
    {
        photoBookPrice = price;
        double totalDue = price + (price * TAX);
        System.out.println("The price of one photo book with an 8% tax is $" + totalDue);
    }
    public static void computeBill(double price, int quantity)
    {
        photoBookPrice = price;
        quantityOrdered = quantity;
        double totalDue = ((price * quantity * TAX) + (price * quantity));
        System.out.println("The total cost of " + quantity + " photo books with 8% tax is $" + totalDue);
    }
    public static void computeBill(double price, int quantity, double coupon)
    {
        photoBookPrice = price;
        quantityOrdered = quantity;
        double totalDue = (((quantity * price) - coupon) + (price * quantity));
        System.out.println("The total cost of " + quantity + " photo books with 8% tax and a discount of " + coupon +  " is $" + totalDue);
    }
    public static void main(String [] args)
    {
        Billing first = new Billing();
        Billing second = new Billing();
        Billing third = new Billing();
        first.computeBill(50);
        second.computeBill(50, 20);
        third.computeBill(50, 20, 10);
    }

}
