package grab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CoinChanging {

	public Map<String, ArrayList<Integer>> greedyCoinChanging(int[] currency, int change){
		ArrayList<Integer> currencyQ = new ArrayList<Integer>();
		ArrayList<Integer> coins = new ArrayList<Integer>();
		Map<String, ArrayList<Integer>> result = new HashMap<String, ArrayList<Integer>>(); 
		int n = currency.length;
		for(int i = n -1; i >= 0; i--){
			currencyQ.add(currency[i]);
			coins.add(change / currency[i]);
			change %= currency[i];
		}
		result.put("currency", currencyQ);
		result.put("coins", coins);
		return result;
		
	}
}
