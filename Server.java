import java.net.*;
import java.io.*;

class Server
{
    public static void main (String Arg[]) throws Exception
    {
        System.out.println("Server Appliaction is RUnning..");
        ServerSocket ssobj=new ServerSocket(2100);
        System.out.println("Server is running at port no : 2100" );

        Socket s = ssobj.accept();
        System.out.println("Server and client connection is succesful");

        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Chat messanger Started");
        System.out.println("Enter Message For Client :");

        String str1;
        String str2;

        while((str1=br1.readLine()) != null)
        {
            System.out.println("Client Says :" +str1);
            System.out.println("Enter Message For Client :");
            ps.println(str2);
        }

        System.out.println("Thank you for using chat messanger");
    }
}