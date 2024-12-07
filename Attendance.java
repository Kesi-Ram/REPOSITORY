//KACEY ROYCE TYNE SANGBAAN
//CITCS 1N-A
import java.util.Scanner; 

public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total students: ");
        int totalstudents = sc.nextInt();

        int presentCount = 0, absentCount = 0;


        for (int i = 1; i <= totalstudents; i++) {
            System.out.println("Is student " + i + "present?: ");
            String students = sc.next();

            switch (students) {
                case "Y":
                case "y":
                    presentCount++;
                    break;
                case "N":
                case "n":
                    absentCount++;
                    break;
                default:
                    System.out.println("Invalid input, Y or N only");
                    i--;
                    break;
            }
        }

        System.out.println("\nAttendance Summary");
        System.out.println("Total Present : " +  presentCount);
        System.out.println("Total Absent : " + absentCount);
        sc.close();
    }
}
