package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public FileReader(){

    }
    public void fileReader() throws IOException {
        Path filePath = Paths.get("data.txt");
        List<String> lines = Files.readAllLines(filePath);
        if (lines.isEmpty()){
            System.out.println("No todos for today! :)");
        }else {
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(i+1 + ". " + lines.get(i));
            }
        }
    }
}
