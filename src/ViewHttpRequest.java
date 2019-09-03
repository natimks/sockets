
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ViewHttpRequest {
    public static void main(String args[]) throws IOException {
        ServerSocket server;
        DataInputStream is;
        DataOutputStream os;

        server = new ServerSocket(8080);
        Socket socket = server.accept();
        is = new DataInputStream(socket.getInputStream());

        while (socket.isConnected()) {
            String msg = is.readLine();
            System.out.println("Mensagem do cliente - " + msg);
        }

        socket.close();
    }
}
