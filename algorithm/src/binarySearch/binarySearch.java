package binarySearch;

//프로그래머스_이분탐색_입국심사
public class binarySearch {

	public static void main(String[] args) {
		int n = 50; //인원 수
		int[] times = {4,8,10}; //심사에 걸리는 시간
		
		long low = times[0]; //첫 심사에 걸리는 시간
        long high = low * n; //최단 심사시간으로 50명이 심사받는 경우의 시간 

        //재귀함수로 구현
        System.out.println(recursiveSearch(n,times,low,high,0));
	}

    static long recursiveSearch(int n,int[] times,long low,long high,long answer){
        long count = 0;
        long mid = (low+high)/2;

        for(int time : times){
            count += mid/time;
        }

        if(count >= n){
            answer = mid;
        }

        if(low == mid) return answer;  
        else if(count >= n){
            return recursiveSearch(n,times,low,mid,answer);
        }else{
            return recursiveSearch(n,times,mid,high,answer);
        }
    }

}
