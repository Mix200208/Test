package Socket

import com.google.gson.Gson
import java.io.IOException
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.Socket
import java.util.concurrent.Callable

class ClientK(val abc: String) : Callable<String> {
    override fun call(): String {
        val socket = Socket("185.244.183.144", 30333)
        val gson = Gson()
        val protocol = Protocol(abc)

        val objectOutputStream = ObjectOutputStream(socket.getOutputStream())
        objectOutputStream.writeObject(gson.toJson(protocol))
        objectOutputStream.flush()
        val objectInputStream = ObjectInputStream(socket.getInputStream())
        return objectInputStream.readObject().toString();
    }
}