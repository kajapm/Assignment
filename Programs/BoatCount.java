package exercises;

import java.util.Arrays;

public class BoatCount
{
	 private static int[] person= {4,4,4,4,4};
	 private static int limit=5;
	    private static int requiredBoats(int[] person,int limit)
	    {
	    	Arrays.sort(person);
	    	int numberOfBoats=0;
	    	for(int i=person.length-1;i>=0;i--)
	    	{
	    		for(int j=0;j<person.length;j++)
	    		{
	    			if(person[i]!=limit && person[i]!=0 && person[j]!=limit && person[j]!=0)
		    		{
		    			if(person[i]+person[j]<=limit)
		    			{
		    				person[j]=person[i]+person[j];
		    				person[i]=0;
		    			}
		    		}
	    		}
	    	}
	    	
	    	for(int i=0;i<person.length;i++)
	    	{
	    		if(person[i]>0)
	    		{
	    			numberOfBoats++;
	    		}
	    	}
	        return numberOfBoats;
	    }
	public static void main(String args[])
	{
		System.out.println(requiredBoats(person,limit));
	}
}
