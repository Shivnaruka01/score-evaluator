import java.util.Scanner;

public class ScoreEvaluator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a score
        System.out.print("Enter the score (0-100): ");
        int score = scanner.nextInt();

        // Evaluate and categorize score
        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 60) {
            System.out.println("Good");
        } else {
            System.out.println("Average");
        }
    }
}

