import java.io.*;
import java.util.*;
public class AddNumbers{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y, z, xor, ior;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the 2nd number: ");
		y=Integer.parseInt(br.readLine());
		z= x+y;
		System.out.println("The sum of the two numbers "+x+" and "+y+" is "+z);
        	System.out.println("Hello");
	}
}
