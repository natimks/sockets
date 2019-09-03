
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
    public static void main(String args[]) throws IOException {
        Socket socket;
        DataInputStream is;
        DataOutputStream os;

        socket = new Socket("10.61.5.98", 1234);

        is = new DataInputStream(socket.getInputStream());
        os = new DataOutputStream(socket.getOutputStream());

        os.writeBytes("Mensagem\n");

        String msg = is.readLine();
        System.out.println("Mensagem do servidor - " + msg);

        socket.close();

    }
}