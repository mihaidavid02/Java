/*
 * File: TemplateKarel.java
 * ----------------------------
 * Specificatii sumare
 */

import stanford.karel.*;

public class BeepereEV extends Karel {

	// metoda principala
	public void run() {
		nordSud();
	}

	private void nordSud(){
		putBeeper();
		while(frontIsClear())
			move();
		if(frontIsBlocked()){
			putBeeper();
			turnLeft();
			while(frontIsClear()){
				move();
				if(frontIsBlocked() && noBeepersPresent()){
					turnLeft();
					putBeeper();
				}
				if(facingNorth() || facingSouth()){
					if(noBeepersPresent())
						putBeeper();
				}
			}
		}
	}
	
}
