package driver;

import java.util.Scanner;

import service.CurrencyCount;
import service.QuickSort;

public class Driver {
	public static void main(String[] args) {
		QuickSort sort= new QuickSort();
		CurrencyCount count = new CurrencyCount();
		System.out.println("enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		System.out.println("enter the currency denominations value");
		int notes[] = new int[size];
		for(int i=0; i<size;i++) {
			notes[i]= sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		sort.quickSort(notes, 0, size-1);

		count.currencyCount(notes, size, amount);
		sc.close();
		
		
	}

}
