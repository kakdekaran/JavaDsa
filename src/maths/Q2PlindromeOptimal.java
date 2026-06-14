package maths;

public class Q2PlindromeOptimal {

	static void checkPalindrome(int n) {
		
		int temp = n;
		int res = 0;
		
		while(temp > 0) {
			int rem = temp % 10;
			res = res*10+rem;
			temp = temp/10;
		}
		
		
		if(res==n){
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
	public static void main(String[] args) {
		int n = 121;
		checkPalindrome(n);
	}
}
