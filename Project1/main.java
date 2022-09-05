import java.io.File;
import java.io.IOException;

public class main {
    static void createFile(){
        try{
            File obj = new File("newfile.txt");
            if(obj.createNewFile()){
            System.out.println("file created " + obj.getName());
            } else {
                System.out.println("file already exists");
        }
        } catch (IOException e) {
            System.out.println("Error occured");
            e.printStackTrace();
        }

    }
    static void deleteFile(){
            File obj = new File("newfile.txt");
            if(obj.delete()){
                System.out.println("file deleted");
            } else {
                System.out.println("fjust leave it");
            }
    }
    public static void main(String[] args){
        System.out.println("Welcome to *insert name*");
        deleteFile();
        
    }
}