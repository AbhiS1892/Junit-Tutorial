package com.abhi.parameterized;

public class PrimeNumberChecker {
	
	public Boolean validate(final Integer primeNumber) {
		int limit;
		
		limit=(int) Math.sqrt(primeNumber);
		
		for(int i=2; i<=limit; i++){
			if(primeNumber%i == 0){
				return false;
			}			
		}
		
		return true;
	}

}
