import handling.Append;
import handling.Read;
import handling.Write;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to read, write, or append?");
        String operation = scanner.nextLine();

        if (operation.equals("read")) {
            Read read = new Read();
            read.readFromFile();
        }else if (operation.equals("write")){
            System.out.println("What do you want to write? (this will REWRITE all contents)");
            String stringToWrite = scanner.nextLine();
            Write write = new Write();
            write.writeToFile(stringToWrite);
        }else if (operation.equals("append")){
            System.out.println("What do you want to append?");
            String stringToAppend = scanner.nextLine();
            Append append = new Append();
            append.appendToFile(stringToAppend);
        }else{
            System.out.println("Did not understand operation");
        }

    }
}
