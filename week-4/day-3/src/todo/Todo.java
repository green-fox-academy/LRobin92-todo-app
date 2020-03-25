package todo;
import java.io.IOException;

public class Todo {
    public static void main(String[] args) throws IOException {
        ArgumentHandler argumentHandler = new ArgumentHandler();
        argumentHandler.argumentHandler(args);
    }

}
