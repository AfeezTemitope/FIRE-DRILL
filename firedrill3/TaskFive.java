import java.util.*;

public class TaskFive {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] number = new int[size];
        
for(int i = 0; i < size; i++) {
System.out.print("Student score "+(i+1)+" :");
            number[i] = scanner.nextInt();
        }
        

	int[] result = FireDrillThree.oddIndex(number);
        System.out.print(Arrays.toString(result));
    }
}
