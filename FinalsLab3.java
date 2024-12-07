//KACEY ROYCE TYNE SANGBAAN
//CITCS 1N-A
import java.util.Scanner;

public class FinalsLab3 {
    public static void main(String[] args) {

        //attributes for the array
        int column = 5, rows = 3;
        String[] names = new String[5];//1D for the student names
        int[][] grades = new int[column][rows];//2D for the grades and subjects


        Scanner sc = new Scanner(System.in);

        //get the user input student names to store in the 1D array
        for (int students = 0; students < names.length; students++) {
            System.out.println("Enter student "+ (students + 1) + " name: "  );
            names[students] = sc.nextLine();
            }
        //get the user input grades in the 3 subjects per student
        for (int i = 0; i < column; i++) {
            System.out.println("\nEnter grades for student: " + (i + 1) + ": ");
            for (int j = 0; j < rows; j++) {
                System.out.println("subject " + (j + 1) + ": ");
                grades[i][j]= sc.nextInt();//i for the column and j for the subject      
            }  
        }

        //calculating the average grades of students
        System.out.println("Average grades per student: ");
        for (int i = 0; i < column; i++) {

            int sum = 0;//make zero for summing up the grades
            
            for (int j = 0; j < rows; j++) {
                sum += grades[i][j];//sum = sum + grades[i][i]//line 25
            }
            double average = sum / rows;
            System.out.println(names[i] + " average grade: " + average);
        }
        sc.close();
    }
}
