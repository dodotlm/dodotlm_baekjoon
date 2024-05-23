import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];
        
        // 개행 문자 제거
        sc.nextLine();

        for (int h = 0; h < len; h++) {
            String line = sc.nextLine(); // 한 줄을 읽음
            String[] nums = line.split(" "); // 공백으로 숫자들을 나눔

            // 문자열을 정수로 변환하여 더함
            int num1 = Integer.parseInt(nums[0]);
            int num2 = Integer.parseInt(nums[1]);
            arr1[h] = num1;
            arr2[h] = num2;
            arr[h] = num1 + num2;
        }
    	
    	for(int i=1; i<=len; i++) {
    		System.out.println("Case #"+i+": "+arr1[i-1]+" + "+arr2[i-1]+" = "+ arr[i-1]);
    	}
       
    }
}