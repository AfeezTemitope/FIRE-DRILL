import java.util.*;

public class TaskFour{
  public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	    List<Integer> scores = new ArrayList<>();

	System.out.println("****************");
	System.out.println("enter 10 scores ");
	System.out.println("****************");
	int totalScore = 0;
	int even = 0;
	int numberOfScore = 10;
	for (int i = 0; i < 10; i++){
	 
	  System.out.print("enter score " + (i + 1) + " :");
	  int number = scanner.nextInt();
	  scores.add(number);
	}
	for(score : scores){
	  totalScore += score;
	 
	  if ( number % 2 == 0){
		even += number;
	
	}
        }
       

	System.out.println("****************");
	System.out.println("sum of even numbers re " + even );
	System.out.print("the total score is " + totalScore);

}
 } 