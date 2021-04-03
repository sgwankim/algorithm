package binarySearch;

//���α׷��ӽ�_�̺�Ž��_�Ա��ɻ�
public class binarySearch {

	public static void main(String[] args) {
		int n = 50; //�ο� ��
		int[] times = {4,8,10}; //�ɻ翡 �ɸ��� �ð�
		
		long low = times[0]; //ù �ɻ翡 �ɸ��� �ð�
        long high = low * n; //�ִ� �ɻ�ð����� 50���� �ɻ�޴� ����� �ð� 

        //����Լ��� ����
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
