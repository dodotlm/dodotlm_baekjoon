import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int num1 = sc.nextInt();
    	int num2 = sc.nextInt();
    	int num3 = sc.nextInt();
    	
    	if(num1 == num2 && num2 == num3) {
    		System.out.println((10000+num1*1000));
    	}else if(num1 != num2 && num1 != num3 && num2 != num3) {
    		int max = num1;
    		if(max<num2) {
    			max = num2;
    		}
    		if(max<num3) {
    			max = num3;
    		}
    		System.out.println(max*100);
    	}else {
    		if(num1-num2 == 0) {
    			System.out.println((num1*100+1000));
    		}else if(num1-num3 == 0) {
    			System.out.println((num1*100+1000));
    		}else {
    			System.out.println((num2*100+1000));
    		}
    	}
    	
    	
       
    }
}