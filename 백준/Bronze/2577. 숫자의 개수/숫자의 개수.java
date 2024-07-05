
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int result = num1 * num2 * num3;
        
        String resultStr = Integer.toString(result);
        
        int[] cnt = new int[10];
        
        for (int i = 0; i < resultStr.length(); i++) {
            char numChar = resultStr.charAt(i);
            ++cnt[numChar - '0'];
        }
        
        for (int k = 0; k < 10; k++) {
            System.out.println(cnt[k]);
        }
        
        sc.close();
    }
}
