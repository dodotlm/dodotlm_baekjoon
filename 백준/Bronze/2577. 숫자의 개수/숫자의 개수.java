import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(value);
		
		
		for (int i = 0; i < 10; i++) {
			int cnt = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}