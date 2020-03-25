package todo;

import java.io.IOException;

public class ArgumentHandler {
    FileReader fileReader = new FileReader();

    public ArgumentHandler() {
    }

    public void argumentHandler(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Command line arguments:\n" +
                    "    -l   Lists all the tasks\n" +
                    "    -a   Adds a new task\n" +
                    "    -r   Removes an task\n" +
                    "    -c   Completes an task");
        } else if (args[0].equals("-l")) {
            fileReader.fileReader();
        }
    }
}
