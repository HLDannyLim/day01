package myapp.WorkShop;

import java.io.Console;

public class Cal {
    public static void main(String[] args){

        String input = "";
        int total = 0 ;
        Integer count = 0 ;
        Console cons = System.console();
        while (!input.equals("stop")){
            // read line
            input = cons.readLine("Enter a number ");
            input = input.trim();
            if(input.equals("stop")){
               // exit the while loop
               break;
            }
            count ++;
        Integer value = Integer.parseInt(input);
        total += value ;
        }
        System.out.printf("The total of adding %d number is %d\n", count ,  total );
  
 
    }
}