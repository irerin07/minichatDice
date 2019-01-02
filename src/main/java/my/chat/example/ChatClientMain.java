package my.chat.example;

public class ChatClientMain {
    public static void main(String[] args){
        ChatClient chatClient = new ChatClient("127.0.0.1", 9000);
        chatClient.run();
    }
}