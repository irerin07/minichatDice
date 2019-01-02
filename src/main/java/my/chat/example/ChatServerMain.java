package my.chat.example;

public class ChatServerMain {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer(9000);//Create new ChatServer instance with specific port number.
        chatServer.run(); //run the server.
    }
}
