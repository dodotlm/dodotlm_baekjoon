
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String strFirst = sc.nextLine();
		String[] temp = strFirst.split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		
		int[] bucket = new int[n];
		
		for(int u=0; u<n; u++) {
			bucket[u] = 0;
		}
       
    	for(int h=0; h < m; h++) {
    		String strSecond = sc.nextLine();
    		String[] temp2 = strSecond.split(" ");
    		int i = Integer.parseInt(temp2[0])-1;
    		int j = Integer.parseInt(temp2[1])-1;
    		int k = Integer.parseInt(temp2[2]);
    		
    		for(int e = i; e <= j; e++) {
    				bucket[e] = k;
    		}
    		
    	}
    	
    	for(int r=0; r < n; r++) {
    		System.out.print(bucket[r] + " ");
    	}
    	
     
    }
}