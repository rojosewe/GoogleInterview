
public class Equlibrium {
	public int solution(int[] A) {
        if(A.length < 3)
        	return -1;
        int s1 = 0;
        int s2 = 0;
        int eq = 1;
        
        for(int i = 1; i < A.length; i++){
        	s2 += A[i];
        }
        
        for(int i = 1; i < A.length - 1; i++){
        	s1 += A[i - 1];
        	eq = i;
        	s2 -= A[i];
        	if(s1 == s2)
            	return eq;
        }
        
        return -1;
    }
	
	public static void main(String... args){
		Equlibrium e = new Equlibrium();
		System.out.println(e.solution(new int[]{-1,3,-4,5,1,-6,2,1}));
	}
}
