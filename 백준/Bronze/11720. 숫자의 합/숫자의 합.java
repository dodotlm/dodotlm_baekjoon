import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int num1 = sc.nextInt();
        sc.nextLine(); 

        
        String strNum = sc.nextLine();

        
        int sum = 0;
        for (int i = 0; i < strNum.length(); i++) {
            char digitChar = strNum.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }

        System.out.println(sum);
    }
}