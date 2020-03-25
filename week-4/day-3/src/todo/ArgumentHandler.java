package todo;

import java.io.IOException;

public class ArgumentHandler {
    FileReader fileReader = new FileReader();
    AddNewTask addNewTask = new AddNewTask();

    public ArgumentHandler() {
    }

    public void argumentHandler(String[] args) throws IOException {
        if (args.length == 0) {
            argumentIsZero();
        } else if (args[0].equals("-l")) {
            fileReader.fileReader();
        } else if (args[0].equals("-a")){
            addNewTask.addNewTask();
        }
    }
    public void argumentIsZero(){
        System.out.println("Command line arguments:\n" +
                "    -l   Lists all the tasks\n" +
                "    -a   Adds a new task\n" +
                "    -r   Removes an task\n" +
                "    -c   Completes an task");
    }
}
