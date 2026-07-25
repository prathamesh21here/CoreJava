public class StudentInformation {

    String studentName;
    int rollNo;
    String course;
    String collegeName;
    float percentage;
    


public StudentInformation(String studentName, int rollNo, String course, String collegeName, float percentage){

    this.studentName = studentName;
    this.rollNo = rollNo;
    this.course = course;
    this.collegeName = collegeName;
    this.percentage = percentage;

    
}

public void DisplayDetails() {
    System.out.println("---------------------------");
    System.out.println("Student Information");
    System.out.println("---------------------------");
    System.out.println("Name          : " + studentName);
    System.out.println("Roll No       : " + rollNo);
    System.out.println("Course        : " + course);
    System.out.println("College Name  : " + collegeName);
    System.out.println("Percentage    : " + percentage);
    System.out.println("---------------------------");
}
}



class StudentInformationDemo{
    public static void main(String[] args) {
        StudentInformation student = new StudentInformation("Prathamesh Raut", 21, "Masters in Computer Applications", "RIT College", 85.5f);
        student.DisplayDetails();

        // Update details
        StudentInformation updatedStudent = new StudentInformation("Soham Dalvi", 23, "Computer Science", "Vivekanand College", 90.0f);
        updatedStudent.DisplayDetails();
    }
}

