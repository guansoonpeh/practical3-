
import java.util.Scanner;

public class ProcessQuiz {

    public static double findAverage(int[] scores) {
        double result = 0;
        double sum = 0;
       
        for (int value : scores) {
            sum += value;
        }
        result = sum / scores.length;

        return result;
    }
    
    public static int countAboveEqual(int[] scores, double average){
        int count = 0;
        
       //count number above or equal average
        for (int value:scores){
             if(value >= average)
         count++;
        }
        
        return count;
    }
    
     public static int countBelow(int[] scores, double average){
        int count = 0;
        
        for (int value:scores){
             if(value < average)
         count++;
        }
        
        return count;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of quiz scores to process: ");
        int count = scan.nextInt();

        int[] scores = new int[count];

        for (int j = 1; j <= count; j++) {
            System.out.print("Score " + j + ": ");
            scores[j - 1] = scan.nextInt();
        }
                
        double average = findAverage(scores) ;
        int aboveCount = countAboveEqual(scores, average);
        
        
        System.out.println("Result");
        System.out.println("======");
        System.out.println("Average is " + average);
        System.out.println("Number of scores above or equal to the average is " + 
                aboveCount);
        System.out.println("Number of scores below the average is " + 
                countBelow(scores, average) );
    }
}
