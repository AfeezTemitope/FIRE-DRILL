import java.util.Scanner;

public class TaskSix{
  public static void main(String... args){
	Scanner scanner = new Scanner(System.in);

	System.out.println("****************");
	System.out.println("enter 10 scores ");
	System.out.println("****************");
	int totalScore = 0;
	int even = 0;
	int numberOfScore = 10;
	for (int i = 0; i < 10; i++){
	 
	  System.out.print("enter score " + (i + 1) + " :");
	  int number = scanner.nextInt();
	totalScore += number;
	
	if ( number % 2 == 0){
		even += number;
	
	}
        }
	int average = even / numberOfScore;
       

	System.out.println("****************");
	System.out.println("sum of even numbers re " + even );

	System.out.println("average score is  " + average )
	

}
 } 