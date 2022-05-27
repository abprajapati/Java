import java.util.*;
import java.io.*;
import java.net.*;
import java.awt.*;
import javax.swing.*;

public class Server extends JFrame
{
    private final ArrayList<Client> clientInfo = new ArrayList<>();
    private final JTextArea areaText = new JTextArea();


    public Server() {
        setLayout(new BorderLayout());
        areaText.append("MultiThreadServer Started at " + new Date() + "\n");
        areaText.setEditable(false);
        JScrollPane jsp = new JScrollPane(areaText);
        add(jsp, BorderLayout.CENTER);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setTitle("Multi-Threaded Server");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            ServerSocket server = new ServerSocket(8080);
            while (true)
            {
                Socket socket1 = server.accept();
                Client newClientToServer = new Client(socket1);
                clientInfo.add(newClientToServer);
            }
        } catch (Exception keep)
        {
            System.out.println(keep);
        }
    }

    class Client implements Runnable
    {
        public PrintWriter objectWriter;
        public final Socket getSocket;


        public Client(Socket getSocket) {
             this.getSocket = getSocket;
            try {
                Thread thread1 = new Thread(this);
                thread1.start();
            } catch (Exception keep) {
                keep.printStackTrace();
            }
        }

        public void run()
        {

            Scanner getIn = null;
            try {
                getIn = new Scanner(getSocket.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                objectWriter = new PrintWriter(getSocket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
            areaText.append("Connection from  " + getSocket);
            areaText.append(" at " + new Date() + "\n");
            boolean val = true;
                while (val)
                {
                    String text = getIn.nextLine();
                    areaText.append( text + "\n");
                  for (Client newClient : clientInfo)
                    {
                        newClient.objectWriter.println(text);
                        newClient.objectWriter.flush();
                    }
                }
        }
    }
    public static void main(String args[])  {
        Server objS = new Server();
    }

}