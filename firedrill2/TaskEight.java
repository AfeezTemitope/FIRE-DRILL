import java.util.Scanner;

public class TaskEight{
  public static void main(String... args){
	Scanner scanner = new Scanner(System.in);

	
	System.out.println("enter number between 1 - 100 ");

	
	int even = 0;
	int numberOfScore = 10;
	int totalScore = 0;

	do {

	if (number > 100){
	negativeCount++;
        } else if (number < 100){
	positiveCount++;
}
	for (int i = 0; i < 10; i++){

	  System.out.print("enter score " + (i + 1) + " :");
	  int number = scanner.nextInt();
	  positiveCount += number;
}
}while(true);
	System.out.println("sum of valid number is " + positiveCount);

	 }
} 


