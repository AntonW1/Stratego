package pkg;
import java.util.Scanner;
import java.util.Random;


public class X extends Piece {
//	int rank;
	
	public X(int rank, int owner) {
		super(rank, owner);
		
	}
	
	public String printPiece(int turn) {
		if ((isVisibleToPlayer1 && (turn == 1)) || (isVisibleToPlayer2 && (turn == 2))) {
			if (super.owner == 1) {
				return "\u001B[41m" + "X" + "\u001B[0m";
			}
			else {
				return "\u001B[44m" + "X" + "\u001B[0m";
			}
		}
		else if (super.rank == -2) {
			return " ";
		}
		
		else {
			return "?";
		}
	}
	

}
