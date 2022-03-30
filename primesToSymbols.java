import java.util.*;

public class primesToSymbols {
	public static void main(String[] args) {
		
		int[] A = {1,3,5,7,9,11,13,15,17,19};
		System.out.print("Symbols According to Godel's Statement: " + listOfInt(A));
	}
	

	public static String listOfInt(int listOfPrimes[]) {
		String symbolsOfPrimes = "";	
		for(int i = 0; i < listOfPrimes.length; i++) {
			if(boolGodelNumbering(listOfPrimes[i])) {
				symbolsOfPrimes += godelNumbering(listOfPrimes[i]);
			}
			else {
				return "Unacceptable List of Primes";
			}
		}
		return symbolsOfPrimes;
	}
	
	public static boolean boolGodelNumbering(int i) {
		if(i <= 19) {
			if(i%2 != 0) {
				return true;
			}
		}
		return false;
	}
	
	public static String godelNumbering(int i) {
		if(i == 1) {
			return "0";
		}
		else if(i == 3) {
			return "f";
		}
		else if(i == 5) {
			return "¬";
		}
		else if(i == 7) {
			return "∨";
		}
		else if(i == 9) {
			return "∀";
		}
		else if(i == 11) {
			return "(";
		}
		else if(i == 13) {
			return ")";
		}
		else if(i == 15) {
			return "∧";
		}
		else if(i == 17) {
			return "∃";
		}
		else if(i == 19) {
			return "=";
		}
		return null;
	}
}
