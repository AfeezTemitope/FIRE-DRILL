import java.util.*;
  public class ArrayPractice2{ 
	public static void main (String... args){

int badAfeez[] = new int[]{22,33,2,1,22,3,44,5,55,6,77,6,5,4};
int evenCount = 0, oddCount = 0;

for(int i = 0; i < badAfeez.length; i++){
 if ( badAfeez[i] % 2 == 0) evenCount++;
 if ( badAfeez[i] % 2 != 0) oddCount++;
}

System.out.print("Count of even numbers: " + evenCount + "\nCount of odd numbers: " + oddCount);

  }
	}