#include <stdio.h>

int main(){

int [] number = {22, 44, 55, 44, 33};

int max = 0;
int min = 0;
for(int i = 0; i < number.length; i++){

if (number[i] > max){
 max = number[i] ;
}
if ( number[i] < min ){
min = number[i] ;

}
}
scanf("the minimum value is " + min);
scanf("the maximum value is " + max);



return 0;
}