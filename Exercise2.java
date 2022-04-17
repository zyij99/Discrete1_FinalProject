/*
Name(s): Brandon Zheng, Justin Truong
Gödel's Undecidability Theorem
Computer Project 2
*/

public class Exercise2 {

	public static void main(String[] args) {
		
		System.out.println("When n is 22, i is: " + whatIsI(22));
		System.out.println("When n is 23, i is: " + whatIsI(23));
	}
	
	public static boolean isEven(int n) {
		if(n % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static int whatIsI(int n) { //count is i
		int count = 0;
		while(n!=1) {
			count ++;
			if(isEven(n)) {
				n/=2;
			}else {
				n = (3*n) +1;
			}
		}
		return count;
	}
	
}
