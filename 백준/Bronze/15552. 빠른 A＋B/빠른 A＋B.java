import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int i = Integer.parseInt(bf.readLine());
    	int[] arr = new int[i];
    	
    	for(int k=0; k<i; k++) {
    		String s = bf.readLine();
    		String[] temp = s.split(" ");
    		arr[k] = Integer.parseInt(temp[0])+Integer.parseInt(temp[1]);
    		
    	}
    	for(int j =0; j<i; j++) {
    		bw.write(arr[j]+"\n");
    	}
    	
    	bw.flush();
    	bw.close();
       
    }
}