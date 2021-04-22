package Socket

import com.google.gson.Gson
import java.io.IOException
import java.io.ObjectOutputStream
import java.net.Socket

class ClientK(val abc: String) : Runnable{
//    fun sendData(data: String?) {
//        val gson = Gson()
//        val protocol = Protocol(data)
//        try {
//            val socket = Socket("localhost", 30333)
//            val objectOutputStream = ObjectOutputStream(socket.getOutputStream())
//            objectOutputStream.writeObject(gson.toJson(protocol))
//            objectOutputStream.flush()
//
//            //System.out.println(gson.toJson(protocol));
//        } catch (e: IOException) {
//            //println("FUUUCK")
//        }
//    }

    override fun run() {
        val gson = Gson()
        val protocol = Protocol(abc)

        val socket = Socket("10.0.2.2", 30333)
        val objectOutputStream = ObjectOutputStream(socket.getOutputStream())
        objectOutputStream.writeObject(gson.toJson(protocol))
        objectOutputStream.flush()
    }
}