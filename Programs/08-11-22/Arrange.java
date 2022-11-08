import java.util.ArrayList;
import java.util.Scanner;

public class Arrange {
	new SevenToLast().sendSevenLast();
}

class SevenToLast
{
	ArrayList<Integer> list=new ArrayList<Integer>();
	Scanner scan=new Scanner(System.in);
	
	ArrayList<Integer> sendSevenLast()
	{
		int length=Integer.parseInt(scan.nextLine());
		for(int i=0;i<length;i++)
		{
			list.add(Integer.parseInt(scan.nextLine()));
		}
		
		int index=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(index)==7)
			{
				list.add(list.remove(index));
				index--;
			}
			index++;
		}
		
		return list;
	}
}
