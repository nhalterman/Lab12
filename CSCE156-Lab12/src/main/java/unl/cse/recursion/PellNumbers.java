package unl.cse.recursion;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class PellNumbers {

	private static final BigInteger TWO = new BigInteger("2");
	private static Map<Integer, BigInteger> pNMap = new HashMap<Integer, BigInteger>();
	private static boolean first = true;
	

	public static BigInteger PellNumber(Integer n) {
		
		if(first) {
			pNMap.put(0,  BigInteger.ZERO);
			pNMap.put(1, BigInteger.ONE);
			pNMap.put(2, TWO);
			first = false;
		}
		
		if(pNMap.containsKey(n)) {
			return pNMap.get(n);
		} else {
			BigInteger a = PellNumber(n-1);
			BigInteger b = PellNumber(n-2);
			pNMap.put(n,  a.multiply(TWO).add(b));
			return pNMap.get(n);
		}
	}
	
	public static void main(String args[]) {
		
		
		int n = 1000;
		BigInteger p_n = PellNumber(n);
		System.out.printf("p(%d) = %s\n", n, p_n.toString());
	}
}
