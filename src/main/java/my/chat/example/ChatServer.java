package my.chat.example;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    private int port;
    private ChatHouse chatHouse;

    //Chat Server Constructor.
    //Server need to have a port number.
    //For each server, new charHouse instance is created.
    public ChatServer(int port){
        this.port = port;
        chatHouse = new ChatHouse();
    }


    public void run(){
        ServerSocket serverSocket = null;
        try{
            serverSocket = new ServerSocket(port); //Create the Server Socket with specified port.
            while(true) {
                Socket socket = serverSocket.accept(); //Create Socket upon accepting the connection.
                ChatServerHandler chatServerHandler = new ChatServerHandler(socket, chatHouse); //create new CharServerHandler instance. This will tell the server handler which chat house to use according to the socket information.
                chatServerHandler.start();
            }
        }catch (Exception ex){
            System.out.println("오류 발생.");
        }finally {
            try{ serverSocket.close(); }catch(Exception ignore){}
        }
    }
}
