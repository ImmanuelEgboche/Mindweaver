import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {
    
    
    // String num2 = '2';
    // String num3 = '3';
    // String num4 = '4';
    


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
        String num1 = "1";
        // String s = String.valueOf(num1);
        System.out.println(num1);
        System.out.println("Welcome");
        Scanner obj = new Scanner(System.in); // creates scanner object 
        System.out.println("Enter a option");
        String input = obj.nextLine();
        System.out.println(input.equals("1")); 
           // not true so while loop and if statement not triggering 
        while(true){
            if(input.equals("1")){
                System.out.println("Do you want to add or create a file");
                Scanner menu1 = new Scanner(System.in); // creates scanner object 
                String men = menu1.nextLine();
                if(men.equals("create")){
                    createFile();
                }
                break;
            }
            /
        }
        
        // if(input == num1){
        //         System.out.println("this is 1");
                
        //  }
        // if(input == "2"){
        //         System.out.println("this is 2 ");
                
        //  }
        // if(input == "3"){
        //         System.out.println("this is 3");
                
        //  }
        // if(input == "4"){
        //         System.out.println("this is 4");
                
        //  } else {
        //      System.out.println("Not a vaild option");
        //  }
        
    }
}
