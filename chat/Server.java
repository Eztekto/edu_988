package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8188); // Создаём серверный сокет
            System.out.println("Сервер запущен");
            while (true) { // Бесконечный цикл для ожидания подключения клиентов
                Thread server = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Socket socket = serverSocket.accept(); // Ожидаем подключения клиента
                            System.out.println("Клиент подключился");
                            DataInputStream in = new DataInputStream(socket.getInputStream()); // Поток ввода
                            DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // Поток вывода
                            out.writeUTF("Добро пожаловать на сервер");
                            while (true) {
                                String request = in.readUTF(); // Ждём сообщение от пользователя
                                out.writeUTF(request); // Отправляем сообщение пользователю
                            }
                        }catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
                server.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
