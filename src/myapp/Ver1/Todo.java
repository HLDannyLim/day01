package myapp.Ver1;

public class Todo {
    public static void main (String[] args){

        // Create an array of 3 String element
        String[] tasks = new String[3];
        tasks[0] = "running" ;
        tasks[1] = "eating" ;
        tasks[2] = "sleeping" ;


        System.out.println(tasks[0]);
        System.out.println(tasks[1]);
        System.out.println(tasks[2]);
        System.out.println(tasks.length);

        Integer i = 0 ;
        while (i<tasks.length) {
            System.out.printf("%d: %s\n", tasks[i]);
            i++;
}

        } 



}
