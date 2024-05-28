import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();

        int cnt = sc.nextInt();
        char[] strArr = new char[str.length()];
        
        for(int i=0; i< str.length(); i++) {
        	strArr[i] = str.charAt(i);
        }
        System.out.println(strArr[cnt-1]);
        

    }

}