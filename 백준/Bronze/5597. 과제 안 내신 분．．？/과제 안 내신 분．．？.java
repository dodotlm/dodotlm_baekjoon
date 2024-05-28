import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[28];
        int[] noarr = new int[30];
        
        for(int i=0; i<28; i++) {
        	arr[i] = sc.nextInt();
        }
        
        for(int i=1; i<=30; i++) {
        	noarr[i-1] = i;
        }
        
        for(int y=1; y<= 30; y++) {
        	for(int h=0; h<28; h++) {
        		if(arr[h] == y) {
        			noarr[y-1] = 0;
        			break;
        		}
        	}
        }
        
        for(int i=0; i<30; i++) {
        	if(noarr[i] != 0) {
        		System.out.println(noarr[i]);
        	}
        }
    }

}