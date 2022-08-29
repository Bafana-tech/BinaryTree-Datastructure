import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class opens and read txt and store student Id and name in the array
 * search student Id in the array and return student name
 * @author Bafana Mhlahlo
 */
public class AccessArrayApp
{

    /**
     * stores the student names and student Id
     */
    private static Student name[];

    /**
     * stores the value of operaations we count
     */
    private int opCount = 0;


    public static void main(String[] args){
        try{

            int i = 0;
            Student[] dataForStudents = new Student[5000];
            File oklistOpened = new File("../data/oklist.txt");
            Scanner readOklist = new Scanner (oklistOpened);


            while(readOklist.hasNextLine()){
                String data = readOklist.nextLine();
                dataForStudents[i] = new Student(data.substring(0, 9), data.substring(10));
                i++;
            }

            
        
            name = dataForStudents;            
            readOklist.close();
            
            
        }
        
        catch(FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        AccessArrayApp t = new AccessArrayApp();

            if(args.length == 0){
                t.printAllStudent();

            }
            else {
                System.out.println(t.printStudent(args[0]));
            }
            System.out.println("count " + ""+t.opcount());

       
    }
    /**
     * This function search the given student Id and return student name or access denied
     * @param studentID the student id
     * @return student name or access denied
     */
    public String printStudent(String studentID)
    {
        for (int i = 0; i<name.length; i++) 
        {   
            opCount++;
            if(name[i].studentId.equals(studentID)){
                return name[i].studentName;
                }
            }
            return "Access denied!";
            
        }
        /**
        We print out all student name and student Id
        */
    public void printAllStudent(){
        for(int k = 0; k<name.length; k++){
            System.out.println(name[k]);
        }
    }
/**
 * We return the number of comparison made
 * @return opCount
 */
    public int opcount(){
       // this.opCount++;
        return opCount;
    }

}
