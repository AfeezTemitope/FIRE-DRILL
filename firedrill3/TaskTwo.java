import java.util.*;
	public class TaskTwo{
	 public static void main(String... args){
Scanner scanner = new Scanner(System.in);

int [] studentScore = new int[10];
for ( int i = 0; i < 10; i+=1){
System.out.print("student score " + (i + 1) + " : ");
studentScore[i] = scanner.nextInt();

}


System.out.print(Arrays.toString(studentScore) +" ");



	
	 }

	}	
