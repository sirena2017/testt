package gitTest;

import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number");
		
		InOutManag io=new InOutManag();
		io.input(scan.nextInt());
		
	}

}
