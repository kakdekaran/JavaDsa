package patterns;

import java.util.Scanner;

public class AllPatterns {
	Scanner sc = new Scanner(System.in);

	void print(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void print2(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void print3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	void print4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	void print5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	void print6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	void print7(int n) {
		for (int i = 0; i < n; i++) {
			// space
			for (int j = 1; j < n - i + 1; j++) {
				System.out.print(" ");
			}
			// star
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}

			// space
			for (int j = 1; j < n - i + 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	void print8(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void print10(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void print11(int n) {
		for (int i = 0; i < n; i++) {
			int start = 0;
			if (i % 2 == 0) {
				start = 1;
			} else {
				start = 0;
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print(start);
				start = 1 - start;
			}
			System.out.println();
		}
	}

	void print12(int n) {
		for (int i = 0; i < n; i++) {

			// Left numbers
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(j);
			}

			// Spaces
			int spaces = 2 * (n - i - 1);
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}

			// Right numbers
			for (int j = i + 1; j >= 1; j--) {
				System.out.print(j);
			}

			System.out.println();
		}
	}

	void print13(int n) {
		for (int i = 0; i < n; i++) {
			int num = 1;
			for (int j = 0; j < i + 1; j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}
	
	void print14(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print((char)('A'+j));
			}
			System.out.println();
		}
	}
	
	void print15(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i; j++) {
				System.out.print((char)('A'+j));
			}
			System.out.println();
		}	
	}
	
	void print16(int n){
		for(int i = 0; i < n; i++) {
			
			char ch = (char)('A' + i);
				for (int j = 0; j <= i; j++) {
					System.out.print(ch);
				}
				System.out.println();
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AllPatterns t = new AllPatterns();

		System.out.println("Enter Test Cases: ");
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			System.out.println("Enter a limit: ");
			int n = sc.nextInt();

			t.print16(n);
			System.out.println();
		}

		sc.close();

	}
}