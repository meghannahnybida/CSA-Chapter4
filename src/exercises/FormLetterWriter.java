package exercises;

public class FormLetterWriter {
    //Author: Meghan Nahnybida
    //Date: 2/3/2020

    private String lastName;
    private String firstName;

    public void displaySalutation(String last)
    {
        this.lastName = last;
        System.out.println("Dear Mr. or Ms. " + lastName + ". Thank you for your recent order.");
    }
    public void displaySalutation(String last, String first)
    {
        this.lastName = last;
        this.firstName = first;
        System.out.println("Dear " + firstName + " " + lastName + ". Thank you for your recent order.");
    }
    public static void main(String [] args)
    {
        FormLetterWriter lastN = new FormLetterWriter();
        FormLetterWriter firstN = new FormLetterWriter();
        lastN.displaySalutation("Ray");
        firstN.displaySalutation("Ray", "Erica");
    }

}
