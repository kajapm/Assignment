

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONToPOJO {
	public static void main(String[] args) {
		APICaller call=new APICaller();
		call.jsonToPojo();
	}
}

class APICaller
{
	private Scanner scan=new Scanner(System.in);
	Root root;
	String getResponse()
	{
		String json="";
		try {
			System.out.print("Enter URL :");
			URL url = new URL(scan.nextLine());
			System.out.println("getting data....");
			URLConnection connection= url.openConnection();
			BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
			json=reader.readLine();
			
		}
		catch (MalformedURLException e) {
			System.out.println("Malformed url");
		}
		catch (UnknownHostException e) {
			System.out.println("Can't reach network");
		}
		catch(IOException e)
		{
			System.out.println("IO Exception");
		}
		
		return json;
	
	}
	
	void jsonToPojo()
	{
		try {
			ObjectMapper mapper=new ObjectMapper();
			root= mapper.readValue(getResponse(), Root.class);
			new JFrameDemo().display(root,root.data);
			
			System.out.println("Root :\n\tpage :"+root.page+"\n\tper_page :"+root.per_page+"\n\ttotal"+root.total+"\n\ttotal_pages :"+root.total_pages+root.total_pages);;
			int dataCount=1;
			for(Datum d:root.data)
			{
				Datum list=d;
				System.out.println("\nData "+dataCount++ +" :\n\tid :"+list.id+"\n\temail :"+list.email+"\n\tfirst_name :"+list.first_name+"\n\tlast_name :"+list.last_name+"\n\tavatar :"+list.avatar);
			}
			System.out.println("\nSupport :"+"\n\turl :"+root.support.url+"\n\ttext :"+root.support.text);
			
		
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	}
	
	public Root getRoot()
	{
		return root;
	}
	
}


