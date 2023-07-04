package transactions;

import java.util.Scanner;

public class Transactions {
	public static void main(String[] args) {
		System.out.println("enter the size of transaction array ");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("enter the values of array");
		int arr[] = new int[size];
		for(int i=0; i<size;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		int totalTargets= sc.nextInt();
		
		for(int i=0; i<totalTargets;i++) {
			System.out.println("enter the value of target");
			boolean isAchieved = false;
			int target= sc.nextInt();
			int sum=0;
			for(int j=0;j<size;j++) {
				sum=sum+arr[j];
				if(sum>=target) {
					System.out.println("Target achieved after "+(j+1)+" transactions ");
					isAchieved=true;
					break;
				}
			}
			if(isAchieved==false) {
				System.out.println("Given target is not achieved ");
			}
		}
		sc.close();
	}
}
