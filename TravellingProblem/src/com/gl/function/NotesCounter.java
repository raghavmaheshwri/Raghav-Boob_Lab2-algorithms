package com.gl.function;

public class NotesCounter {
		public void notescount(int[] denominationArray, int target) {
			int notesCounter[] = new int[denominationArray.length];
		
				for (int i = 0; i < denominationArray.length; i++) {
					if(target >= denominationArray[i]) {
						notesCounter[i] = target/denominationArray[i];
						target = target - notesCounter[i] * denominationArray[i];
					}
				}
				
				if(target > 0) {
					System.out.println("The Exact Target amount is not reachable ");
				} else {
					System.out.println("Your payment approach in order to give min no of notes will be");
					for (int index=0; index < denominationArray.length; index++) {
						if(notesCounter[index] !=0) {
							System.out.println(denominationArray[index] + ":" +notesCounter[index]);
						}
					}
				}
				
		}
}
