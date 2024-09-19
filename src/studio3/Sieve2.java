package studio3;

import java.util.Scanner;
import java.math.*;

public class Sieve2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the upper limit for the algorithm: ");
		int n = in.nextInt();
		boolean [] sieve = new boolean[n];
		for (int i = 0; i <n; i++) {
			sieve[i] = true;
			//System.out.println(sieve[i]);
		}
		
		
		
		for (int i = 2; i < Math.pow(n, 0.5); i++) {
			
			if (sieve[i] == true) {
				for (int j= (int) Math.pow(i, 2); j<n; j=j+i) {
					sieve[j]=false;
				}
			}
		}
		
		for (int i = 0; i<n; i++) {
			if (sieve[i]==true) {
				System.out.println(i+2);
			}
		}
		
		
		
		
	}
		
		

}
