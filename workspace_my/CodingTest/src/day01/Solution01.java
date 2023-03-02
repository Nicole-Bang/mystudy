package day01;

/*
자연수 뒤집어 배열로 만들기

**문제 설명**
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

* 제한 조건
- n은 10,000,000,000이하인 자연수입니다.
 */

class Solution01 {

	public int[] solution(long n) {
	    
		//String으로 변환
    String str = n + "";

    //문자열만큼 길이로 배열 생성
    int[] answer = new int [str.length()];

    int idx = 0;

    while(n>0) {
        //나머지값을 각 자리수에 넣어주기
        answer[idx++] =  (int)(n%10);

        //이미 넣은 자리수는 없애주기 위해 10으로 나누기
        n /= 10;
    	}
    	return answer;
	}
}
