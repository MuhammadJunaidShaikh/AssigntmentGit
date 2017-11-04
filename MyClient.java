import java.net.*;
import java.io.*;

class MyClient{
	public static void main(String str[]){	
		try{
			Socket s = new Socket("localhost", 786);

			PrintWriter writer = new PrintWriter(s.getOutputStream(), true);
			

			java.util.Scanner sc = new java.util.Scanner(System.in);
			
			while(true){
				System.out.print("Enter message : ");
				
				String msg = sc.nextLine();


				if(msg.equals("quit"))
					break;
				else
					writer.println( msg );



			}

			writer.close();

			


	
		}catch(Exception ex){	
			ex.printStackTrace();
		}
	}
}