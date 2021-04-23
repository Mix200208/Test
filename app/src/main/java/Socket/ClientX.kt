package Socket

import android.util.Log
import com.google.gson.Gson
import java.io.IOException
import java.io.ObjectOutputStream
import java.net.Socket

class Connection {
    private var mSocket: Socket? = null
    private var mHost: String? = null
    private var mPort = 0

    constructor() {}
    constructor(host: String?, port: Int) {
        mHost = host
        mPort = port
    }

    // Метод открытия сокета
    @Throws(Exception::class)
    fun openConnection() {
        // Если сокет уже открыт, то он закрывается
        closeConnection()
        mSocket = try {
            // Создание сокета
            Socket(mHost, mPort)
        } catch (e: IOException) {
            throw Exception("Невозможно создать сокет: "
                    + e.message)
        }
    }

    /**
     * Метод закрытия сокета
     */
    @Throws(Exception::class)
    fun closeConnection() {
        if (mSocket != null && !mSocket!!.isClosed) {
            try {
                mSocket!!.close()
            } catch (e: IOException) {
                Log.e(LOG_TAG, "Ошибка при закрытии сокета :"
                        + e.message)
            } finally {
                mSocket = null
            }

        }
        mSocket = null
    }

    /**
     * Метод отправки данных
     */

    @Throws(Exception::class)
    fun sendData(data: String?) {
        // Проверка открытия сокета
        if (mSocket == null || mSocket!!.isClosed) {
            throw Exception("Ошибка отправки данных. " +
                    "Сокет не создан или закрыт")
        }
        val gson = Gson()
        val protocol = Protocol(data)
        // Отправка данных
        try {
            if (data != null) {
                val objectOutputStream = ObjectOutputStream(mSocket!!.getOutputStream())
                objectOutputStream.writeObject(gson.toJson(protocol))
                objectOutputStream.flush()
            }
                    //mSocket!!.getOutputStream().flush()
        } catch (e: IOException) {
            throw Exception("Ошибка отправки данных : "
                    + e.message)
        }
    }

//    @Throws(Throwable::class)
//    protected fun finalize() {
//        closeConnection()
//    }

    companion object {
        const val LOG_TAG = "SOCKET"
    }
}