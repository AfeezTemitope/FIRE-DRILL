public class MinimumAndMaximum{

	public static void main(String... args){


		int [] number = {22, 44, 55, 44, 33};

		int max = number[0];
		int min = number[0];
		for( int numbers : number){

	if (numbers > max) max = numbers;

	if ( numbers < min ) min = numbers;

}


System.out.println("the minimum value is " + min);
System.out.print("the maximum value is " + max);


}
}