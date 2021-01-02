package handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Read {

    final static String
            DEBUG_LOG_PATH = "src/main/resources/file.txt";

    public void readFromFile() throws IOException {

        File inputFile = new File(DEBUG_LOG_PATH);
        FileInputStream fileInputStream = new FileInputStream(inputFile);
        int r = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while((r = fileInputStream.read()) != -1) {
            stringBuilder.append((char)r);
        }
        String orders = stringBuilder.toString();
        System.out.println(orders);

        }
    }


