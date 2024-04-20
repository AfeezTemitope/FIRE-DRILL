import java.util.*;

  public class ArrayPractice4 {
	public static void main(String... args){

	int badAfeez[] = {11,44,55,66,3,21,67};
	int afeez = badAfeez.length;
	Arrays.sort(badAfeez);
	int secondLargest = 0;

for (int i = afeez - 2; i >= 0; i--){
	if (badAfeez[i] != badAfeez[afeez - 1]) secondLargest = badAfeez[i]; break;
}

System.out.println(secondLargest);

  }
	}