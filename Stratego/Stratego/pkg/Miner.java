package pkg;
import java.util.Scanner;
import java.util.Random;


public class Miner extends Piece {
//	int rank;
	
	public Miner(int owner) {
		super(3, owner);
	}
	
	public String printPiece(int turn) {
		if ((isVisibleToPlayer1 && (turn == 1)) || (isVisibleToPlayer2 && (turn == 2))) {
			if (super.owner == 1) {
				return "\u001B[41m" + "3" + "\u001B[0m";
			}
			else {
				return "\u001B[44m" + "3" + "\u001B[0m";
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
