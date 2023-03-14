package day0314;
import java.util.*;

/*
소수 만들기

**문제 설명**
	주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 
	숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, 
	nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 
	소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

* 제한 조건
	- nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
	- nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
	
* 입출력 예 설명
	- 입출력 예 #1
		[1,2,4]를 이용해서 7을 만들 수 있습니다.
	
	- 입출력 예 #2
		[1,2,4]를 이용해서 7을 만들 수 있습니다.
		[1,4,6]을 이용해서 11을 만들 수 있습니다.
		[2,4,7]을 이용해서 13을 만들 수 있습니다.
		[4,6,7]을 이용해서 17을 만들 수 있습니다.
 */

class Solution04 {

	 public static LinkedList<int[]> box = new LinkedList<>();
	    
	    public int solution(int[] nums) {
	        int answer = 0;
	        int[] comArr = new int[3];
	        // nums에 들어있는 숫자들 중 3개를 골라 조합 만들기
	        combination(nums.length,3,0,0,nums,comArr);
	        
	        for(int[] n : box){
	            // 만든 조합들이 소수일 경우 1을 소수가 아닐경우 0을 누적
	            answer += isPrime(Arrays.stream(n).sum());
	        }
	        
	        return answer;
	    }
	    
	    // 주어진 배열(intArr)에서 r개의 숫자를 뽑으면서 순서와 상관없는 숫자 배열 만들기(조합)
	    public static void combination(int n, int r, int index, int target, int[] intArr, int[] comArr) {    
	        // 뽑아야 하는 숫자를 다 뽑은 경우, comArr의 숫자를 box에 담는다.
	        if(r == 0){
				int[] num = new int[comArr.length];
	            for(int s=0;s<comArr.length;s++){
	                num[s] = comArr[s];
	            }
	            box.add(num);
				return;
			}
	        // 재귀횟수가 n과 같다면 반환
	        if(target == n) return;
			
	        // comArr의 index에 주어진 숫자 배열(intArr)의 target 위치에 해당하는 숫자를 저장한다.
			comArr[index] = intArr[target];
	        combination(n,r-1,index+1,target+1,intArr,comArr);    // 번호를 뽑는경우
	        combination(n,r,index,target+1,intArr,comArr);     // 번호를 안 뽑는 경우
	    
	    }
	    
	    // 숫자가 소수인지 아닌지 판별하여 소수일 경우 1, 소수가 아닐경우 0을 반환
	    public static int isPrime(int num){
	        if(num < 2){
	            return 0;
	        }else{
	            for(int i=2; i<num; i++){
	                if((num%i) == 0){
	                    return 0;
	                }
	            }
	        }    
	        return 1;
	}
}
