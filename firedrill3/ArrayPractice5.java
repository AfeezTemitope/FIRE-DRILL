import java.util.*;

public class ArrayPractice5{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);

System.out.println("enter size of te array");
int size = scanner.nextInt();
int [] badAfeez = new int[size+1];

for( int i = 0; i < size; i++){
  System.out.print("input value for " +i+ " : ");
  badAfeez[i] = scanner.nextInt();
}

System.out.print("Enter new Element to insert ");
badAfeez[size] = scanner.nextInt();

for (int i = 0; i < size+1; i++){
System.out.println(Arrays.asList(badAfeez[i]));
}


}
}
