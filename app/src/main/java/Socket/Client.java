package Socket;

import com.google.gson.Gson;
import java.io.*;
import java.net.Socket;

public class Client {
    public void sendData(String data) {
        Gson gson = new Gson();

        Protocol protocol = new Protocol(data);

        try {
            Socket socket = new Socket("localhost", 30333);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(gson.toJson(protocol));
            objectOutputStream.flush();

            //System.out.println(gson.toJson(protocol));


        } catch (IOException e) {
            System.out.println("FUUUCK");
        }
    }
}
