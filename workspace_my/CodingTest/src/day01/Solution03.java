package day01;

/*
x만큼 간격이 있는 n개의 숫자

**문제 설명**
	자연함수 solution은 정수 x와 자연수 n을 입력 받아, 
	x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
	다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
	수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
	예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

* 제한 조건
	- x는 -10000000 이상, 10000000 이하인 정수입니다.
	- n은 1000 이하인 자연수입니다.

 */

class Solution03 {

	public long[] solution(int x, int n) {
		long[] answer = new long[n];    
		for(int i=0; i<n; i++){
		        answer[i] = (long)x * (i+1);
		    }
		    return answer;
	}
}
