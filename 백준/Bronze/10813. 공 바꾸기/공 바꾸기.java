import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String temp = sc.nextLine();
        String[] tempArr = temp.split(" ");
        int n = Integer.parseInt(tempArr[0]);
        int m = Integer.parseInt(tempArr[1]);
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
        	arr[i] = i+1;
        }
        
        for(int i=0; i<m; i++) {
        	String temp2 = sc.nextLine();
            String[] tempArr2 = temp2.split(" ");
            int num1 = Integer.parseInt(tempArr2[0]);
            int num2 = Integer.parseInt(tempArr2[1]);
            int temp3=0;
            
            temp3 = arr[(num1)-1];
            arr[(num1)-1] = arr[(num2)-1];
            arr[(num2)-1] = temp3;
        }
        
        for(int i=0; i<n; i++) {
        	System.out.print(arr[i]+" ");
        }
        
    }

}