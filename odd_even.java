import java.util.*;
public class Num{
	public static void main(String args[]) {
	    int n;
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=sc.nextInt();
		if(n%2==0){
		    System.out.println("It is even number");
		}
		else{
		    System.out.println("It is odd number");
		}
	}
}