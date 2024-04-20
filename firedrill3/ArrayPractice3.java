import java.util.*;
class ArrayPractice3{
    public static void main(String ...a){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
	Integer badAfeez[] = new Integer[size];

        System.out.println("Enter the " +(size)+ " array elements: ");
        for(int i=0; i< size ; i++) {
	System.out.print("Enter " +(i +1)+ " array elements: ");
	badAfeez[i] = input.nextInt();
        }

        System.out.println("Array After Reversal : ");
        Collections.reverse(Arrays.asList(badAfeez)); 
        System.out.println(Arrays.asList(badAfeez)); 
    }
}