package myapp.Ver1;

import java.io.Console;

public class Hello {
    public static void main (String[] args) {
    
    Console cons = System.console();

    String name = "";
    while (name.trim().length()<= 0){
        cons.readLine("What is your name? ");
    }



    // use equals() for string comparison, == is for number
    // use trim() to remove spaces inbetween string
    if(name.trim().isEmpty()){
        System.out.println("Please enter your name");
    }
    else if (name.trim().equals("danny")){
        System.out.println("Yabadabadoo");
    } 
    else if (name.equals("barney")) {
        System.out.println("Hello Barney");
    }
    else {
        //use .toUpperCase to change string to upper case
        System.out.printf("Hello %s. \n\tNice to make your acquantance", name.toUpperCase());
    }

    }
}
