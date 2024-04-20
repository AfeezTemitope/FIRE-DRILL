import java.util.*;

public class ArrayPractice {
   public static void main (String... args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the size of the Array:");
	int size = input.nextInt();
	int badAfeez[] = new int[size];


	System.out.print("Enter "+(size)+" array element: ");
	for (int i=0; i < size; i++){
	badAfeez[i] = input.nextInt();
	}

	System.out.print("elements are  ");
	for(int i = 0; i < size; i++){
	System.out.print(badAfeez[i]);
	}
}
   }