import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException; 
import java.io.File;

public class cities {
    public static void main(String args[]) {
    String [] citylist = {"memphis","houston","los angeles"};

    List<String> list2 = new ArrayList<String>();
    
    for(String text : citylist) {
        list2.add(text);
    }


    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number of Cities You Want To Add");
    String cityIndex = sc.nextLine();

    int x = Integer.parseInt(cityIndex);
    x = x + 2;
    int i;
    for (i = 2; i < x; i++) {
        System.out.println("Enter The Name of the cities");
        String newcity = sc.nextLine();
        list2.add(i,newcity);
    }
    Object[] objects = list2.toArray();

    try {
        File myObj = new File("testcityfile.txt");
        if (myObj.delete()) { 
            System.out.println("Deleted the file: " + myObj.getName());
          } else {
            System.out.println("Failed to delete the file.");
          } 

        FileWriter myWriter = new FileWriter("testcityfile.txt");
        for (Object obj : objects) {
         String message =  String.valueOf(obj);   
         myWriter.write(message + "\n");
        }
        myWriter.close();
        System.out.println("Successfully Wrote To The File ");

        File readTextFile = new File("testcityfile.txt");
        Scanner myReader = new Scanner(readTextFile);
        while (myReader.hasNextLine()) {
          String outPutData = myReader.nextLine();
           System.out.println(outPutData);
        }
        myReader.close();
        
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
}
