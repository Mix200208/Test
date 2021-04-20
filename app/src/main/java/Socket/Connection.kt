package Socket

import android.util.Log
import java.io.IOException
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
    fun sendData(data: ByteArray?) {
        // Проверка открытия сокета
        if (mSocket == null || mSocket!!.isClosed) {
            throw Exception("Ошибка отправки данных. " +
                    "Сокет не создан или закрыт")
        }
        // Отправка данных
        try {
            mSocket!!.getOutputStream().write(data)
            mSocket!!.getOutputStream().flush()
        } catch (e: IOException) {
            throw Exception("Ошибка отправки данных : "
                    + e.message)
        }
    }

    @Throws(Throwable::class)
    protected fun finalize() {
        closeConnection()
    }

    companion object {
        const val LOG_TAG = "SOCKET"
    }
}

