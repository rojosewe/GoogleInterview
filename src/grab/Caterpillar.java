package grab;

public class Caterpillar {

	/* Crawl through array remembering front and back */
	public boolean caterpillarMethod(int[] A, int s){
		int n = A.length;
		int front = 0;
		int total = 0;
		for(int back = 0; back < n; back++){
			while(front < n && total + A[front] <= s){
				total += A[front];
				front++;
			}
			if(total == s){
				return true;
			}
			total -= back;
		}
		return false;
	}
}
