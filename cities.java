import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

    System.out.println(list2);
    }
}
