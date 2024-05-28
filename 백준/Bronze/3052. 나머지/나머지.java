import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];
        int[] modArr = new int[10];
        int[] modArr2 = new int[42];
        int count = 0;
        
        for(int i=0; i<10; i++) {
        	arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<10; i++) {
        	modArr[i] = (arr[i]) % 42;
        }
        
        for(int i=0; i<=42; i++) {
        	for(int h=0; h<10; h++) {
        		if (modArr[h] == i) {
        			modArr2[i]=modArr[h];
        			if(modArr[h] == 0) {
        				modArr2[i] = -1;
        			}
        		}
        	}
        }
        for(int i=0; i<42; i++) {
        	if(modArr2[i] != 0) {
        		++count;
        	}
        }
        System.out.println(count);
        
        
    }

}