class Student implements Comparable<Student>  
{
    /**
    *stores the studentId
    */
    String studentId;
    /**
    *stores the student name
    */
    String studentName;
    
    /**
     * constructs a Student with student Id and student name
    *@param studentId  
    *@param studentName the student name
    */
    public Student(String studentId, String studentName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    
    
    /**
     * constructs a Student with student id only
    *@param studentId the student id
    */
    public Student(String studentId){
        this.studentId = studentId;
    }
    
    
    /**
     * Retrieves the name
    *@return the studentName
    */
    public String getName()
    {
        return studentName;
    }
    
    
    /**
     * Retrieves the studentID
     *@return the studentId
     */  
    public String getStudentID()
    {
        return studentId;
    }
    
    
    /**
     * Compares the studentId to the stored studentId
     *@return 0 if they are equal, 1 if greater and -1 if less than
     */
    public int compareTo(Student other){
        return studentId.compareTo(other.studentId);
    }
    
    
    /**
     * Returns string representation of an object
     *@return studentId and studentName
     */
    public String toString()
    {
        return studentId + " " + studentName;
    }
   
}
