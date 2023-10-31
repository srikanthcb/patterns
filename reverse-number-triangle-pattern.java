 import java.util.*; 
public class Main { 
	public static void printPattern(int n) 
	{ 
		int i, j; 
		for (i = 1; i <= n; i++) {  
			for (j = 1; j < i; j++) { 
				System.out.print(" "); 
			} 

			for (j = i; j <= n; j++) { 
				System.out.print(j + " "); 
			} 
			System.out.println(); 
		} 
	} 

	public static void main(String args[]) 
	{ 
		int n = 8; 
		printPattern(n); 
	} 
}


output:
1 2 3 4 5 6 7 8 
 2 3 4 5 6 7 8 
  3 4 5 6 7 8 
   4 5 6 7 8 
    5 6 7 8 
     6 7 8 
      7 8 
       8 
