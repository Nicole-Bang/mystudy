package day02;

/*
정수 제곱근 판별

**문제 설명**
	임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 
	n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

* 제한 조건
	- n은 1이상, 50000000000000 이하인 양의 정수입니다.
 */

class Solution01 {

	public long solution(long n) {
		long answer = 0;    
			for(long i=0; i*i<=n; i++){
		        //임의의 정수 i를 곱했을때 n과 같다면
		        if(i*i == n){
		           answer = (i+1)*(i+1);
		        }else{
		            answer = -1;
		        }
		    }
		    return answer;
	}
}
