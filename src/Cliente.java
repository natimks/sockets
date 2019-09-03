
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
    public static void main(String args[]) throws IOException {
        Socket socket;
        DataInputStream is;
        DataOutputStream os;

        socket = new Socket("localhost", 8081);
        
        is = new DataInputStream(socket.getInputStream());
        os = new DataOutputStream(socket.getOutputStream());
        while(true) {
        	os.writeBytes("Hello \n");
        }
//        String msg = is.readLine();
//        System.out.println("Mensagem do servidor - " + msg);
//
//        socket.close();

    }
}