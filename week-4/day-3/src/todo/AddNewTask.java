package todo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class AddNewTask {
    public AddNewTask(){
    }
    public void addNewTask(){
        try{
            String textToAppend = "\nFeed the monkey";
            BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt", true));
            //writer.newLine(); - after removal a single empty line is still there ?????
            writer.write(textToAppend);
            writer.close();
        }catch (Exception e){
            System.out.println("Unable to add: no task provided");
        }
    }
}
