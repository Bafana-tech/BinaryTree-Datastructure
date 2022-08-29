import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class StoreCount{


public static void main(String[] args){
try{

    File oklistOpened = new File("./data/oklist.txt");
    Scanner readlist = new Scanner (oklistOpened);

    BinarySearchTree<Student> t = new BinarySearchTree<Student> ();
    File newFile = new File("./data/part1.txt");
    FileWriter printer = new FileWriter(newFile);


    while(readlist.hasNextLine()){
        String data = readlist.nextLine();
        t.insert(new Student(data.substring(0,9), data.substring(10)));
        t.find(new Student(data.substring(0,9)));
        printer.write(t.countFunction());

    }  
    
}

catch(FileNotFoundException e){
    System.out.println("An error occured.");
    e.printStackTrace();
}

}
//printer.close();
}