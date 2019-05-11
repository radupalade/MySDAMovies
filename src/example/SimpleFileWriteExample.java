package example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;

public class SimpleFileWriteExample {
    public static void main(String[] args) {
        String relativePath = "out.txt";

        File file = new File(relativePath);
        try {

            String message1 = "fsdsvds sdkfldf djf fdksfjljsjfsje";
            String message2 = "fsdsvds sdkfldf djf fdksfjljsjfsje";
            String message3 = "fsdsvds sdkfldf djf fdksfjljsjfsje";

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(message1);
            bufferedWriter.newLine();
            bufferedWriter.write(message2);
            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
