package todo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LineRemoval {
    public LineRemoval() {
    }

    public void removeLine(int index) {
        try {
            Path filePath = Paths.get("data.txt");
            List<String> lines = Files.readAllLines(filePath);
            if (lines.size() < 2) {
                System.out.println("Unable to remove that line");
            }else if (index > lines.size()){
                System.out.println("Unable to remove: index is out of bound");
            } else {
                lines.remove(lines.get(index));
                Files.write(filePath, lines);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }


}

