import java.net.*;
import java.io.*;  //Input Output Stream

class Client
{
    public static void main (String Arg[]) throws Exception
    {
        System.out.println("Client Appliaction is RUnning..");

        System.out.println("Client is Waiting For Connection");
        
        Socket s = new Socket ("localhost",2100);

        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Chat messanger Started");
        System.out.println("Enter Message for Server : ");

        String str1,str2;

        while(!(str1 = br2.readLine().equals("end")))
        {
            ps.println(str1);
            System.out.println("Enter Message for Server : ");
            str2 = br1.readLine();
            System.out.println("Server says : "+str2);
        }
        
        System.out.println("Thank you for using chat messanger..");
    }
}