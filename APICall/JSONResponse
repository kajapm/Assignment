import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;

public class JSONResponse {

	public static void main(String[] args){
			APICall call=new APICall();
			call.getResponse();
	}
}

class APICall
{
	private Scanner scan=new Scanner(System.in);
	void getResponse()
	{
		try {
			System.out.print("Enter URL :");
			URL url = new URL(scan.nextLine());
			System.out.println("getting data....");
			URLConnection connection= url.openConnection();
			BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
			System.out.println(reader.readLine());
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
	}
}
