package pkg;
import java.util.Scanner;
import java.util.Random;


public class Piece {
	int rank;
	int owner;
	boolean isVisibleToPlayer1 = false;
	boolean isVisibleToPlayer2 = false;
	
	public Piece() {
		rank = -2;
		owner = 0;
	}
	
	public Piece(int rank, int owner) { 
		this.rank = rank;
		this.owner = owner;
		
	}
	
	public String printPiece(int turn) {
		if ((isVisibleToPlayer1 && (turn == 1)) || (isVisibleToPlayer2 && (turn == 2))) {
			if (owner == 1) {
				return "\u001B[41m" + rank + "\u001B[0m";
			}
			else {
				return "\u001B[44m" + rank + "\u001B[0m";
			}
		}
		else if (rank == -2) {
			return " ";
		}
		else {
			return "?";
		}
	}
	
	public int getRank() {
		return rank;
	}
	
	public int getOwner() {
		return owner;
	}
	
	public void setVisibleToPlayer1(boolean isVisible) {
		isVisibleToPlayer1 = isVisible;
	}
	
	public void setVisibleToPlayer2(boolean isVisible) {
		isVisibleToPlayer2 = isVisible;
	}

//	public void isAttacked(Piece attacker) {
	//	if 
//	}
}
