package handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Append {

    final static String
            DEBUG_LOG_PATH = "src/main/resources/file.txt";

    private FileOutputStream fileOutputStream;


    public void appendToFile(String stringToAppend) throws IOException {
        File debugLogFile = new File(DEBUG_LOG_PATH);
        if (!debugLogFile.exists()) {
            Files.createFile(Paths.get(DEBUG_LOG_PATH));
        }
        this.fileOutputStream = new FileOutputStream(debugLogFile, true);
        byte[] message = String.format("\n"+stringToAppend).getBytes();
        fileOutputStream.write(message);
    }
}
