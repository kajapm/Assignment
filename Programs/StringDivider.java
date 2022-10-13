import java.util.*;

class StringDivider
{
    private Scanner scan=new Scanner(System.in);
    private static String getInput()
    {
        String input=scan.nextLine();
        return input;
    }
    private static String stringDivider(String input)
    {
        String output="";
        for(int i=0;i<input.length();i++)
        {
            if(Character.isLetter(input.charAt(i)))
            {
                output+=String.valueOf(input.charAt(i));
            }
            else
            {
                for(int j=0;j<Integer.parseInt(input.CharAt(i));j++)
                {
                    output+=input.substring(0,i);
                }
                input=input.substring(0,i)+input.substring(i+1,input.length());
            }
        }
    }
    public static void main(String args[])
    {
        System.out.println(stringDivider(getInput()));
    }
}