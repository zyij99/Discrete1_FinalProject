/*
Name(s): Brandon Zheng, Justin Truong
Gödel's Undecidability Theorem
Computer Project 2
*/

import java.util.*;

public class GoldbachConjecture{
	
    public static void main(String [] args){   
    	Scanner console = new Scanner(System.in);
        System.out.println("Enter a even integer greater than 2:");
        int integerInput = console.nextInt();
        
        while(integerInput <= 2 || integerInput % 2 != 0) {
            System.out.println("Please enter a even number greater than 2");
            integerInput = console.nextInt();
        }
    	
    	System.out.println(sumOfPrimes(integerInput));
    }
    
    public static boolean isPrime(int numInput) {
    	for(int i = 0; i < numInput; i++) {
    		for(int j = 0; j < numInput; j++) {
    			if((i*j) == numInput && i != 1 && j != 1) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
    
    public static String sumOfPrimes(int numInput) {
    	String sumPrimeNums = ""; 
    	for(int i = 0; i < numInput; i++) {
    		for(int j = 0; j <numInput; j++) {
    			if((isPrime(i) && isPrime(j)) && (i!= 1 && j!= 1) && ((i+j) == numInput)) {
    				sumPrimeNums = i + " + " + j + " = " + numInput;
    			}
    		}
    	}
    	return sumPrimeNums;
    }
    
}
