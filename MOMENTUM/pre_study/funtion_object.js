
// Hello라는 function을 만듬
function Hello(nameOfPerson, age){
    console.log("Hello my name is " + nameOfPerson + " and I'm " + age);
}


//Hello(); 는 실행버튼
Hello("nico", 10);
Hello("dal", 20);
Hello("lynn", 27);

//Object 만들기
const player = {
    name: "nicole",
    sayHello: function(otherPersonName){ //Object안에서 function 만들기 
        console.log("Hello! " + otherPersonName +" Nice to meet you!");
    },
};

console.log(player.name);
player.sayHello("lynn"); //otherPersonName = lynn

//숙제 calculater.brbr 계산기 출력하기
const calculator= {
    add: function(a,b){
        console.log(a + b);
    },
    minus: function(a,b){
        console.log(a - b);
    },
    div: function(a,b){
        console.log(a / b);
    },
    powerof: function(a,b){
        console.log(a ** b)
    },
    multi: function(a,b){
        console.log(a * b);
    }
}

calculator.add(3,6);
calculator.div(13,5);
calculator.minus(27,10);
calculator.multi(10,2)
calculator.powerof(3,9);