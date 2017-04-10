package gitTest;

import java.util.Scanner;

public class InOutManag {
	
	public int[] input(int n){
		
		int[] array=new int[n];
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter "+n+"number");
		for(int i=0;i<n;i++){
			array[i]=scan.nextInt();
		}
		return array;
	}
	
	public void output(int[] n){
		for(int i=0;i<n.length;i++){
			System.out.println(n[i]);
		}
	}
}
