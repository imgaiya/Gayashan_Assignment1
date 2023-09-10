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
        System.out.println("The Assignment Name is: " + assignmentName);
        System.out.println("The Student Marks is:"); // Printing their marks
        for (int i = 0; i < 30; i++) {
            System.out.println("The student " + (i + 1) + ": " + marks[i]);
        } // Combine both inputs

        // Print highest and lowest marks
        int highestMark = findHighestMark(marks);
        int lowestMark = findLowestMark(marks);
        
        // Display highest and lowest marks
        System.out.println("Highest Mark: " + highestMark);
        System.out.println("Lowest Mark: " + lowestMark);

        // Calculate mean and the StandardDeviation
        double mean = calculateMean(marks);
        double standardDeviation = calculateStandardDeviation(marks, mean);
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);

        scanner.close();
    }

    // Highest mark function
    public static int findHighestMark(int[] marks) {
        int highest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        return highest;
    }

    // Lowest mark function
    public static int findLowestMark(int[] marks) {
        int lowest = marks[0];
        for (int mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }
        return lowest;
    }

    // Calculating the mean
    public static double calculateMean(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    // Calculate the standard deviation
    public static double calculateStandardDeviation(int[] marks, double mean) {
        double sumSquaredDifferences = 0;
        for (int mark : marks) {
            double difference = mark - mean;
            sumSquaredDifferences += difference * difference;
        }
        double variance = sumSquaredDifferences / marks.length;
        return Math.sqrt(variance);
    }
}