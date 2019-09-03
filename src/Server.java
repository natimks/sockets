
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String args[]) throws IOException {
        ServerSocket server;
        DataInputStream is;
        DataOutputStream os;

        server = new ServerSocket(1234);
        Socket socket = server.accept();

        is = new DataInputStream(socket.getInputStream());
        os = new DataOutputStream(socket.getOutputStream());

        String msg = is.readLine();
        System.out.println("Mensagem do cliente - " + msg);

        os.writeBytes("Ola CLiente");

        socket.close();
        server.close();
    }

}