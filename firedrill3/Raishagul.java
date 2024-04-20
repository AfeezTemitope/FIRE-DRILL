public class Raishagul {

    public static int[] MaximumAndMinimum(int[] badAfeez) {


        int minimum = badAfeez[0];
        int maximum = badAfeez[0];


	for(int score : badAfeez) {
		if(score > maximum) maximum = score;
		if(score < minimum) minimum = score;
        }
int hoticulture [] = new int [2];
hoticulture[0] = minimum;
hoticulture[1] = maximum;
return hoticulture;

    }
}

