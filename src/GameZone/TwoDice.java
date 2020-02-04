package GameZone;

public class TwoDice {

    public static void main(String [] args)
    {
        Die Dice1 = new Die();
        Die Dice2 = new Die();

        int value1 = Dice1.getRandomValue();
        int value2 = Dice2.getRandomValue();

        if(value1 > value2)
        {
            System.out.println("Dice #1 rolled: " + value1);
            System.out.println("Dice #2 rolled: " + value2);
            System.out.println("Dice #1 wins. ");
        }
        else if(value2 > value1)
        {
            System.out.println("Dice #1 rolled: " + value1);
            System.out.println("Dice #2 rolled: " + value2);
            System.out.println("Dice #2 wins. ");
        }
        else
        {
            System.out.println("Dice #1 rolled: " + value1);
            System.out.println("Dice #2 rolled: " + value2);
            System.out.println("TIE!");
        }
    }
}
