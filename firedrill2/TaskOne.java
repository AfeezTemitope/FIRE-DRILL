import java.util.Scanner;

public class TaskOne{
  public static void main(String... args){
	Scanner scanner = new Scanner(System.in);

	System.out.println("****************");
	System.out.println("enter 10 scores ");
	System.out.println("****************");
	int totalScore = 0;
	for (int i = 0; i < 10; i++){
	 
	  System.out.print("enter score " + (i + 1) + " :");
	  int number = scanner.nextInt();
	  totalScore += number;
	}

	System.out.println("****************");
	System.out.print("the total score is " + totalScore);
}
 } 