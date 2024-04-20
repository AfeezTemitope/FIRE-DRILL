public class FireDrillThree {

    public static int[] evenIndex(int[] numbers) {
        
int j = 0;
int[] result = new int[numbers.length / 2 ]; 
        for (int i = 0; i < numbers.length; i+=2) {
             result[i / 2] = numbers[i];
            }
        return result;
    }

public static int[] oddIndex(int[] numbers) {
int j = 0;
int[] result = new int[numbers.length / 2 ]; 
        for (int i = 1; i < numbers.length; i+=2) {
        result[i / 2] = numbers[i];
            }
        return result;
    }


public static int sumOddIndex(int[] numbers) {
    int sum = 0;
    for (int i = 1; i < numbers.length; i+=2) {
            sum += numbers[i];
        }
    return sum;
}

public static int sumEvenIndex(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i+=2) {
            sum += numbers[i];
        }
    return sum;
}

 public static int minimumEvenIndex(int[] numbers) {
    int min = numbers[0];
    for (int i =2; i < numbers.length; i+=2){
	if (numbers[i] < min) min = numbers[i];
    }
    return min;
} 

public static int[] swapOddAndEvenIndices(int[] numbers){

for (int i = 1; i < numbers.length; i+=2){
int arr = numbers[i-1];
numbers [i-1] = numbers [i];
numbers[i] = arr;
}
return numbers;
}

public static int[] swapIfEven(int[] numbers){

for (int i = 2; i < numbers.length; i+=2){
if( i % 2 == 1 ){
int arr = numbers[i-1];
numbers [i-1] = numbers [i];
numbers[i] = arr;
}
}
return numbers;
}



}


