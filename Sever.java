import java.net.*;
import java.io.*';

class Client
{
    public static void main (String Arg[])
    {
        System.out.println("Server Appliaction is RUnning..")
        ServerSocket ssobj=new ServerSocket(2100);
        System.out.println("Server is running at port no : 2100" )

        Socket s = ssobj.accept();
    }
}