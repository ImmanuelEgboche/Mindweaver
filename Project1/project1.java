import java.util.*;
import java.io.*;

class project{  
    public static void main(String[] args){
        HashMap<String, String> filenames = new HashMap<String, String>();
        int choice = -1;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Welcome press\n 1 to create \n 2 to delete\n 3 to search\n 0 to exit ");
            choice = input.nextInt();

            switch(choice){
                case 1: // create
                    try{
                        Scanner obj = new Scanner(System.in); // creates scanner object 
                        System.out.println("Enter FILE NAME");
                        String tocreate = obj.nextLine();
                        
                        
                        String string = String.format(" %s.txt", tocreate); // mainly take two different arguments one with txt and one without 
                        filenames.put(tocreate, string);
                        System.out.println(filenames);
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
                    break;
                case 2: // delete
                    Scanner obj = new Scanner(System.in); // creates scanner object 
                    System.out.println("Enter FILE NAME for deletion");
                    String todel = obj.nextLine();
                    File test = new File(input + ".txt");
                    boolean success = test.delete();
                    System.out.println("deletion was " + success);
                case 3:
                    Scanner find = new Scanner(System.in);
                    System.out.println("select file to find");
                    String item = find.nextLine();
                    System.out.println("Found in hashmap" + filenames.get(item));
                    String string = String.format("%s.txt", item); // mainly take two different arguments one with txt and one without 
                    try {

                        File myObj = new File(string);
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            System.out.println("adding " + data);
                        }
                        myReader.close();
                        } catch (FileNotFoundException e) {
                        System.out.println("Couldnt find file please check stack trace");
                        e.printStackTrace();
                        }
                case 0: // exiiting 
                    System.out.println("Goodbye!");
                    break;
            }
        }while(choice!=0);
    }
}