import java.util.*;
public class NestedIf 
{
    public static void main(String args[])  //program to check eligible for voting
    {
    Scanner scan=new Scanner(System.in);

    System.out.println("Enter age :");
    byte age=scan.nextByte();

    System.out.println("Enter true if you have voter ID,if don't have enter false :");
    boolean hasVoterID=scan.nextBoolean();

    if(age>=18)  //nested if
    {
        if(hasVoterID)
        {
            System.out.println("Eligible to vote.");
        }

        else
        {
            System.out.println("Not eligible to vote.");
        }
    }

    else
    {
        System.out.println("Not eligible to vote.");
    }
  } 
}
