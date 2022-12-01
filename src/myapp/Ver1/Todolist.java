package myapp.Ver1;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class Todolist {
    
    public static void main (String[] args){

    //Create a list of number
    List<Integer> listOfInt = new LinkedList<>();

    //Get the console
    Console cons = System.console();
    String item = "";

    while (true) {
        item = cons.readLine("Please enter a number: ");
        item = item.trim();


         if ("stop".equals(item))
        //if (item.equals("stop")) can use this too
            break;
        
            listOfInt.add(Integer.parseInt(item));

        }
                

        System.out.printf("Number of element in the list: %d\n", listOfInt.size());

        for (int i = 0; i<listOfInt.size(); i++){
            System.out.printf("%d: %s\n", i ,listOfInt.get(i));
    }




    }




}
