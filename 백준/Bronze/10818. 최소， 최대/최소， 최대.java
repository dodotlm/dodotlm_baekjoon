import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        //String firstStr = sc.nextLine();
        int first = sc.nextInt();
        sc.nextLine();
        String temp = sc.nextLine();
        String[] tempArr = temp.split(" ");
        int max = Integer.parseInt(tempArr[0]);
        int min = Integer.parseInt(tempArr[0]);
        
        for(int i=1; i < first; i++) {
        	int num = Integer.parseInt(tempArr[i]);
        	if(max < num) {
        		max = num;
        	}
        	if(min > num) {
        		min = num;
        	}
        }
        
        System.out.println(min + " " +max);
         
    }

}