import java.net.*;
import java.io.*;

class Client
{
    public static void main (String Arg[])
    {
        System.out.println("Client Appliaction is RUnning..");

        Socket s new Socket ("localhost",2100);
        System.out.println("Client is Waiting For Connection");
    }
}