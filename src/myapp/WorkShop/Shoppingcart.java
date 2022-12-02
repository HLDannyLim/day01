package myapp.WorkShop;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class Shoppingcart {
    
public static void main (String[] args){
    List<String> list =new LinkedList<String>(); //creating linkedlist    
    Console cons = System.console();
    String input = "";
    Boolean stop = false ;
    System.out.println("Welcome to your shopping cart ");


    while (!stop){
    input = cons.readLine() ;
    input = input.trim().toLowerCase() ;
    String[] arrItem = input.split(" ");



switch (arrItem[0]) {
case "exit": 
stop = true ;
System.out.println("Bye Bye");
break;

case "list": 
        if(list.size() <= 0){
            System.out.println("Your cart is empty");
        }else{
            System.out.println("The contents of your cart");
            for (int i = 0; i<list.size(); i++){
                System.out.printf("%d: %s\n", i ,list.get(i));
        }
        }
break;

case "add": 
list.add(arrItem[1]);

        for(int i =1; i<arrItem.length ;i++){
            if (!list.contains(arrItem[i])) {

                System.out.printf("%d added to cart " ,arrItem[i]);
            } else {
                System.out.printf("You have %d in your cart" ,arrItem[i]);
            }
        }
break;

case "delete": 
        for(int i =1; i<arrItem.length ;i++){
            if(Integer.parseInt(arrItem[1]) >= list.size() || Integer.parseInt(arrItem[1]) < 0 ){
                System.out.printf("Incorrect item index ");
              }else{
            list.remove(arrItem[i]);
            System.out.printf("%d removed to cart " ,arrItem[i]);
        }
    }   
break;


default:
System.err.printf("unknown command: %s\n" , arrItem[0]);
}

    }

}

}
