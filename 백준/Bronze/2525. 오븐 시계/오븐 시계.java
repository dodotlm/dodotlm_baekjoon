import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	
    	String a = sc.nextLine();
    	int b = sc.nextInt();
    	String[] c = a.split(" ");
    	int[] d = new int[c.length];
    	
    	for(int i =0; i<c.length; i++) {
    		d[i] = Integer.parseInt(c[i]);
    	}
    	
    	int hour = d[0];
    	int min = d[1];
    	
    	if(min+b>=60) {
    		if(hour+((b+min)/60)>24) {
    			System.out.println(((hour+(b+min)/60)-24) + " " + ((b+min)%60));
    		}else if(hour+((b+min)/60)==24) {
    			System.out.println("0" + " " + ((b+min)%60));
    		}
    		else {
    			System.out.println((hour+(b+min)/60) + " " + ((b+min)%60));
    		}
    		
    	}else {
    		System.out.println(hour + " " + (min+b));
    	}
    	
       
    }
}