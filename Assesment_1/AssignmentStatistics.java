import java.util.Scanner;

/**
 * Write a description of class AssignmentStatistics here.
 *
 * @author (Gayashan)
 * @version (1.0 or a 09/10/2023)
 */
public class AssignmentStatistics
{
    public static void main(String[] args) {

        //Get user inputs
        Scanner scanner = new Scanner(System.in);
        String assignmentName = scanner.nextLine();

        //Input assignment name
        System.out.print("Enter the assignment name here: ");

    
     int[] marks = new int[30];
        for (int i = 0; i < 30; i++) {
            int mark = -1; // Invalid mark error massage 
            while (mark < 0 || mark > 30) {
                System.out.print("Enter student mark " + (i + 1) + ": ");
                mark = scanner.nextInt();
                if (mark < 0 || mark > 30) {
                    System.out.println("You have entered an invalid mark. Please enter a mark between 0 and 30.");
                } // Reminder for the marks range
            }
            marks[i] = mark;
        }
    }
}
