import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int num1 = sc.nextInt();
    	sc.nextLine();
    	String strFirst = sc.nextLine();
		String[] temp = strFirst.split(" ");
		double[] arr = new double[num1];
		double max = 0;
		
		for(int i =0; i<num1; i++) {
			arr[i] = Double.parseDouble(temp[i]);
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		double sum =0;
		for(int i=0; i<num1; i++) {
				sum = sum + ((arr[i] / max) * 100);
		}
		System.out.println((double)(sum/num1));
    }
}