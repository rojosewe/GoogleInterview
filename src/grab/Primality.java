package grab;

import java.util.ArrayList;

public class Primality {

	public int numberOfDivisors(int n){
		int i = 1;
		int result = 0;
		while(i * i < n){
			if(n % i == 0)
				result += 2;
			i++;
		}
		if(i * i == n)
			result ++;
		return result;
	}
	
	/*Is prime or not */
	public boolean primality(int n){
		int i = 2;
		while(i * i < n){
			if(n % i == 0)
				return false;
			i++;
		}
		return true;
	}
	
	/*Mark all primes and not primes up to n */
	public boolean[] sieve(int n){
		boolean[] sieve = new boolean[n + 1];
		for(int i = 2; i < sieve.length; i++){
			sieve[i] = true; 
		}
		int i = 2;
		while( i * i <= n){
			if(sieve[i]){
				int k = i*i;
				while(k <= n){
					sieve[k] = false;
					k+= 1;
				}
			}
			i++;
		}
		return sieve;
	}
	
	/*Mod of sieve to remember instead of prime or not, the smallest divisor */
	public int[] factorizationAux(int n){
		int[] F = new int[n - 1];
		int i = 2;
		while( i * i <= n){
			if(F[i] == 0){
				int k = i*i;
				while(k <= n){
					if(F[k] == 0)
						F[k] = i;
					k++;
				}
			}
			i++;
		}
		return F;
	}
	
	public ArrayList<Integer> factorization(int x){
		int[] F = factorizationAux(x); 
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		while(F[x] > 0){
			primeFactors.add(F[x]);
			x /= F[x];
		}
		primeFactors.add(x);
		return primeFactors;
	}
}
