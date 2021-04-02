###프로그래머스_이분탐색_입국심사

```java
import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
		long low = times[0];
        long high = low * n;

        return recurSearch(n,times,low,high,0);
	}

    private long recurSearch(int n,int[] times,long low,long high,long answer){
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
            return recurSearch(n,times,low,mid,answer);
        }else{
            return recurSearch(n,times,mid,high,answer);
        }
    }
}
```
