import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int[] arr = new int[9];
        int cnt =0;
        for(int i=0; i<9; i++) {
        	arr[i] = sc.nextInt();
        	if(arr[i] > max) {
        		cnt = i+1;
        		max = arr[i];
        	}
        }
        System.out.println(max);
        System.out.println(cnt);
         
    }

}