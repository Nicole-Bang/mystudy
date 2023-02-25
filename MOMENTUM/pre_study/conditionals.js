//나이 계산기 만들기

const age = parseInt( prompt("How old or you?") );      //prompt -> alter로 답변을 입력하는 창을 만듬 

//console.log( isNaN(age) );   //isNaN -> 숫자인지 아닌지 boolean : 숫자면 false
// console.log(typeof age); //typeof age를 입력하면  age의 타입을 콘솔을 통해 알 수 있다.


//한번에 여러가지 조건 확인하기
if( isNaN(age) || age <0 ) { // or연산자이므로 둘중 1개만 true여도 true
    console.log("Please write a number");
}else if(age < 18) {
    console.log("You are too young");
}else if(age >= 18 && age <= 50) {  //&& 연산자이므로 두가지 다 true여야 한다 
    console.log("You can drink");
}else {
    console.log("You can't drink");
}