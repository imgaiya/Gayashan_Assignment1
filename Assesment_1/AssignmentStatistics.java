import java.util.Scanner;

/**
 * Write a description of class AssignmentStatistics here.
 *
 * @author (Gayashan)
 * @version (1.0 09/10/2023)
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

    // Printing the assignment name
     System.out.println("Assignment Name is: " + assignmentName);
        System.out.println("Student Marks is:"); // Printing their marks
        for (int i = 0; i < 30; i++) {
            System.out.println("The student " + (i + 1) + ": " + marks[i]);
        } // Combine both inputs

        // Searching for highest and lowest marks
        int highestMark = findHighestMark(marks);
        int lowestMark = findLowestMark(marks);
        
        // Display Higjest and lowest marks
        System.out.println("The Highest Mark is: " + highestMark);
        System.out.println("The Lowest Mark is: " + lowestMark);
    }
  public static int findHighestMark(int[] marks) {
        int highest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        return highest;
    }

    // Function to find the lowest mark
    public static int findLowestMark(int[] marks) {
        int lowest = marks[0];
        for (int mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }
        return lowest;
    }

}
