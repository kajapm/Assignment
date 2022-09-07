import java.util.*;
class DoublingNTimes 
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number for double its value for n times :");
        int input=scan.nextInt();

        System.out.println("Enter the times of double the input :");
        int times=scan.nextInt();

        System.out.println("The result is : "+(input*(Math.pow(2,times))));


    }
}
