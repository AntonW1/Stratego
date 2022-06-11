package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spy extends Piece {
//	int rank;
	
	public Spy(int owner) {
		super(1, owner);
	}
	
	public String printPiece(int turn) {
		if ((isVisibleToPlayer1 && (turn == 1)) || (isVisibleToPlayer2 && (turn == 2))) {
			if (super.owner == 1) {
				return "\u001B[41m" + "S" + "\u001B[0m";
			}
			else {
				return "\u001B[44m" + "S" + "\u001B[0m";
			}
		}
		else if (super.rank == -2) {
			return " ";
		}
		else {
			return "?";
		}
	}
	
	

//	public void isAttacked(Piece attacker) {
	//	if 
//	}
}
