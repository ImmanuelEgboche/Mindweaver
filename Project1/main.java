import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

"FIX WHILE LOOP

"

public class main {
    
    static final Map<String, String> fileNames;

    static{
        fileNames = new LinkedHashMap<>();
        fileNames.put("example","example.txt");
        fileNames.put("test","test.txt");

    }

    // String num2 = '2';
    // String num3 = '3';
    // String num4 = '4';
    
    public static void addHm(String input, String string){
        fileNames.put(input, string);
        System.out.println(fileNames);
        
    }

    public static void find(String input){
        fileNames.get(input);
    }

    public static void delete(String input){
        fileNames.remove(input);
    }

    public static void createFile(){
        try{
            Scanner obj = new Scanner(System.in); // creates scanner object 
            System.out.println("Enter FILE NAME");
            String input = obj.nextLine();
            String string = String.format(" %s.txt", input); // mainly take two different arguments one with txt and one without 
            addHm(input, string);
            System.out.println(string);
            System.out.println(fileNames);

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
    // check file path method 
    static void deleteFile(){
            File obj = new File("/home/manueegbochemin/Documents/project1/example.txt");
            System.out.println(obj.delete());
            //     System.out.println("file deleted");
            // } else {
            //     System.out.println("fjust leave it");
            // }
    }
    public static void main(String[] args){
        // String s = String.valueOf(num1);
        //  HashMap<String, String> fileNames = new HashMap<String, String>();
        
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
                // finish  add file method
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
                System.out.println(fileNames);

                System.out.println("What file are you looking for?");
                Scanner menu1 = new Scanner(System.in);
                String name = menu1.nextLine();
                
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

