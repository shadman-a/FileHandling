package handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Write {

    final static String
            DEBUG_LOG_PATH = "src/main/resources/file.txt";

    private FileOutputStream fileOutputStream;

    public void writeToFile(String stringToWrite) throws IOException {
        File debugLogFile = new File(DEBUG_LOG_PATH);
        if (!debugLogFile.exists()) {
            Files.createFile(Paths.get(DEBUG_LOG_PATH));
        }
        this.fileOutputStream = new FileOutputStream(debugLogFile);
        byte[] message = String.format(stringToWrite).getBytes();
        fileOutputStream.write(message);
    }
}
