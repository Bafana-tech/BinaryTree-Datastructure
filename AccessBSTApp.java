import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * This class will store student id and student name in BST and we 
 * search using find method the studentId and if we get it we return student name if not we deny access.
 * We also can just print all student names
 * @author Bafana Mhlahlo
 */
public class AccessBSTApp {
/**
 * Store the student name and student id
 * @param BinarySearchTree<Student> b the BST b
 */
    private static BinarySearchTree<Student> b;
    public static void main(String[] args){
      

        try{

            BinarySearchTree<Student> t = new BinarySearchTree<Student> ();
            File oklistOpened = new File("../data/oklist.txt");
            Scanner readOklist = new Scanner (oklistOpened);

            while(readOklist.hasNextLine()){
                String data = readOklist.nextLine();
                t.insert(new Student(data.substring(0,9), data.substring(10)));
                
            }
          
            
            b = t;
            readOklist.close();
            
            
        }
        catch(FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        AccessBSTApp show = new AccessBSTApp();
        
        if(args.length == 0){
            show.printAllStudent();
            System.out.println("count" + " " +b.countFunction());
        }
        else {

            System.out.println(show.printStudent(new Student(args[0])));
            b.find(new Student(args[0]));
            System.out.println("count" + " " +b.countFunction());
        }

    }

    /**
    * traverse the binary tree on InOrder traversal algorithm and print all student name and student id
    */
    public void printAllStudent(){
        b.inOrder();
        }
/**
 * We check whether the studentID we are looking for is there and  
 * if found we return it else we return access deined
 * @param studentID the student id
 * @return student name or access denied
 */
   public String printStudent(Student studentID){
        
        if(b.find(studentID) == null){
            return "Access denied!!";
        }

        else{
           
            return b.find(studentID).data.studentName;
        }

    }
}

