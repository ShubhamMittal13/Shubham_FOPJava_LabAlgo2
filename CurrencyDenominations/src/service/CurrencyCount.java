package service;

public class CurrencyCount {
	
	public void currencyCount(int notes[], int size, int amount) {
		
		int noteCount[]= new int[size];
		for(int i = size-1; i>=0;i--) {
			if(amount>notes[i]) {
				noteCount[i]=amount/notes[i];
				amount= amount - noteCount[i]*notes[i];
				if(amount==0) {
					break;
				}
			}
		}
		if(amount>0) {
			System.out.println("Exact amount cannot be given with the higest demonination");
		}
		else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i = size-1; i>=0;i--) {
				if(noteCount[i]>0) {
					System.out.println(notes[i]+":"+noteCount[i]);
				}
			}
		}
	}

}
