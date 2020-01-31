package exercises;

public class FormLetterWriter {

    private String lastName = "Smith";

    public static void main (String [] args)
    {
        
    }
        public displaySalutation(String LN)
        {
            lastName = LN;
            System.out.println("Dear Mr. or Ms." + LN);

        }

}
