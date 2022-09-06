import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    
    
    // String num2 = '2';
    // String num3 = '3';
    // String num4 = '4';
    
    static void addArray(String name){
        ArrayList<String> items = new ArrayList<String>();
        items.add(name);
        System.out.println(items);
        
    }

    static void createFile(){
        try{
            Scanner obj = new Scanner(System.in); // creates scanner object 
            System.out.println("Enter FILE NAME");
            String input = obj.nextLine();
            String string = String.format(" %s.txt", input);
            addArray(string);
            System.out.println(string);
            File fobj = new File(string);
            if(fobj.createNewFile()){
            System.out.println("file created " + fobj.getName());
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
        // String s = String.valueOf(num1);
        Scanner obj = new Scanner(System.in); // creates scanner object 
        System.out.println("Welcome \n 1 to create or add \n 2 for deleting \n 3 to find a file \n 0 to exit");
        String input = obj.nextLine();
        System.out.println(input.equals("1")); 
           // not true so while loop and if statement not triggering 
        while(true){
            

            
            if(input.equals("1")){
                

                
                System.out.println("Do you want to add or create a file");
                Scanner menu1 = new Scanner(System.in); // creates scanner object 
                String men = menu1.nextLine();
                while(true){
                    
                if(men.equals("create")){
                    createFile();
                }
                if (men.equals("add")){
                    /*addFile(); 
                    needs to be implemented*/
                    System.out.println("add if");
                }
                if (men.equals("none")){
                    System.out.println("bye");
                    /*addFile(); 
                    needs to be implemented*/
                    
                } 
                    break;
                }
                break;
            } 
            if(input.equals("2")){
                System.out.println("Do you want to delete a file");
                Scanner menu1 = new Scanner(System.in); // creates scanner object 
                String del = menu1.nextLine();
                if(del.equals("create")){ // delete method needs to take argument 
                    deleteFile();
                }
                break;
            }
            if(input.equals("3")){
                System.out.println("What file are you looking for?");
                /* 
                    Need a sorting algorthim then a searching algorthim 

                    BINARY SEARCH FOR SEARCHING 

                    SORTING QUICK SORT 

                    NEED TO ACCESS FILE PATH THEN OPEN FILE AFTER SEARCHING 
                */
            }
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
