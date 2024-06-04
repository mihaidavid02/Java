/*
 * File: TemplateKarel.java
 * ----------------------------
 * Specificatii sumare
 */

import stanford.karel.*;

public class AdunaBeepere extends Karel {

	// metoda principala
	public void run() {
		colecteazaBeepere();
		intoarceTe();
		pozitieInitiala();
	}

	private void adunaBeepere(){
		while(beepersPresent()){
			pickBeeper();
			if(frontIsClear()){
				move();
			}
		}
	}
	
	private void colecteazaRandBeepere(){
		adunaBeepere();
		while(frontIsClear()){
			move();
		}
		turnLeft();
	}
	
	private void intoarceTe(){
		if(frontIsBlocked()){
			turnLeft();
		}
	}
	
	private void colecteazaBeepere(){
		colecteazaRandBeepere();
		while(frontIsClear()){
			colecteazaRandBeepere();
			move();
		}
	}
	
	private void pozitieInitiala(){
		turnLeft();
		turnLeft();
		while(frontIsClear()){
			move();
		}
		intoarceTe();
	}
}
