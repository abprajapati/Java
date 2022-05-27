import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.net.Socket;
import java.awt.event.ActionListener;

public class Client extends JFrame {
    public String title;
    private PrintWriter objectWriter;
    private final JTextArea tArea = new JTextArea();
    private final JTextField tField = new JTextField();

    public Client(String title) throws IOException {
            Socket newSocket = new Socket("localhost", 8080);
            if (newSocket.isConnected())
            { objectWriter = new PrintWriter(newSocket.getOutputStream());
                contentDes content1 = new contentDes(newSocket);}
            else
            {
                System.out.println("Server not connected");
            }

        setLayout(new BorderLayout(15,10));
        JPanel panel2 = new JPanel();
        JPanel panel = new JPanel(new BorderLayout(150,100));
        tArea.setEditable(true);
        panel2.add(tArea);
        panel.add(panel2, BorderLayout.CENTER);
        JPanel cTextPanel = new JPanel(new BorderLayout());
        JPanel cNamePanel = new JPanel(new GridLayout());
        cTextPanel.add(tField, BorderLayout.CENTER);
        JButton button = new JButton("\nSend");
        cNamePanel.add(cTextPanel);
        cNamePanel.add(button);
        panel.add(cNamePanel, BorderLayout.SOUTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        setSize(650, 350);
        setTitle(title);
        ActionListener massageSender = e ->
        {
                if ((!tField.getText().equals("")))
                    {
                        objectWriter.println(this.title + ": " + tField.getText() + "\n");
                        tField.setText("");
                        objectWriter.flush();
                    }

        };
        button.addActionListener(massageSender);
        tField.addActionListener(massageSender);
    }

    class contentDes implements Runnable
    {
        private final Socket socket;
        public contentDes(Socket getSocket)
        {
            socket = getSocket;
            try {
                Thread thread1 = new Thread(this);
                thread1.start();
            } catch (Exception ignored)
            {
            }
        }

        public void run()
        {
            Scanner ScanIn = null;
            try {
                ScanIn = new Scanner(socket.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
            do {
                    tArea.append(ScanIn.nextLine() + "\n");
                } while (true);
        }
    }
    public static void main(String args[]) throws IOException {

        Client cObj1 = new Client("Ali");
        cObj1.title = "Ali";
        Client cObj2 = new Client("Mahebob");
        cObj2.title = "Mahebob";
    }
}
