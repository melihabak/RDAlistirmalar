import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDosyaYazmaOrnegi {

    public static void main(String[] args) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("filename.txt"))) {
            String veri = "Bu dosyaya yazilan metin. ";
            bufferedWriter.write(veri);
            System.out.println("Dosya yazildi.");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}


