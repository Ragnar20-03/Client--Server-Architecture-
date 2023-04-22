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

        String str1,str2;
    }
}