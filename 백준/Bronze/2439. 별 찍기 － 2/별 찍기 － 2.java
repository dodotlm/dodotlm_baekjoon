import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for(int i=1; i<=a; i++) {
        	for(int y=a-1; y>=i; y--) {
        		System.out.print(" ");
        	}
        	for(int k=1; k<=i; k++) {
            	System.out.print("*");
            }
        	System.out.println();
        }
     
    }
}