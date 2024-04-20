const prompt = require("prompt-sync")({siginit:true})


let [] number = {22, 44, 55, 44, 33};

let max = 0;
let min = 0;
for(let i = 0; i < number.length; i++){

if (number[i] > max){
 max = number[i] ;
}
if ( number[i] < min ){
min = number[i] ;

}
}
console.log("the minimum value is " + min);
console.log("the maximum value is " + max);