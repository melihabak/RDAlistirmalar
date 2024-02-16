import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

        // File myObj = new File("C:\\Users\\melih.abak\\Desktop\\deneme456.txt"); // Spesifik olarak dosya yolunu vererek yapılan bir ornek
        File myObj = new File("filename.txt"); // Direkt olarak acilan java projesinde bir dosya olusturma ornegi

        try {
            if (myObj.createNewFile()){
                System.out.println("File Created : "+myObj.getName());
            }else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();

        }
    }
}
