import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.*;


class starter {
	
	// Declaring ANSI_RESET so that we can reset the color
//    public static final String ANSI_RESET = "\u001B[0m";
    // Declaring the background color
  //  public static final String ANSI_RED_BACKGROUND
  //      = "\u001B[41m";
	
	
	
	public static void main(String args[]) {
	
	
	
	
	// Now add the particular background color
   //     System.out.println(ANSI_RED_BACKGROUND
  //                         + "The background color is red"
  //                         + ANSI_RESET);
	
	
	
	
	
	
	
		// Your code goes below here
		ArrayList<ArrayList<Piece>> board = new ArrayList<ArrayList<Piece>>(); 
		Scanner sc = new Scanner(System.in);
		String a = "Player 1";
		String b = "Player 2";
		System.out.print("What is your name, " + a + "?: ");
		a = sc.nextLine();
		System.out.print("What is your name, " + b + "?: ");
		b = sc.nextLine();
		
//		boolean gameOver = false;
//		boolean victoryPlayer1 = false;
//		boolean victoryPlayer2 = false;
		
		int fx1;
		int fy1;
		int fx2;
		int fy2;
		
		for (int x = 0; x < 10; x++) {
			board.add(new ArrayList<Piece>());
			for (int y = 0; y < 10; y++) {
				board.get(x).add(new Piece());
			}
		}
		
		int x = 0;
		int y = 0;
		
		printBoard(board, 1);
		
		System.out.print("Do you want the board to be set up randomly? Yes(y) or no(n): ");
		String randomSetUp = sc.nextLine();
		
		if(randomSetUp.equals("y")) {
					//Player 1 set up
		System.out.println("It is " + a + "'s turn to set up their side of the board.");
		while (true) {
			
			x = (int)Math.floor(Math.random() * 4) + 1;
			fy1 = x;
			y = (int)Math.floor(Math.random() * 10) + 1;
			fx1 = y;
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
			
		}
		board.get(x - 1).set(y - 1, new Flag(1));
		board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
		
		x = 0;
		y = 0;
		
		
		
		for (int c = 0; c < 6; c++) {
			while (true) {
					x = (int)Math.floor(Math.random() * 4) + 1;
					y = (int)Math.floor(Math.random() * 10) + 1;
					
					
				if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
					
					break;
				}
				
			
			}
			
			board.get(x - 1).set(y - 1, new Bomb(1));
			
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			
			x = 0;
			y = 0;
			
		}
		
		
		while (true) {
			x = (int)Math.floor(Math.random() * 4) + 1;
			y = (int)Math.floor(Math.random() * 10) + 1;
		if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
			break;
		}
		
		}
		board.get(x - 1).set(y - 1, new X(10, 1));
		board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
		x = 0;
		y = 0;
		
		
		
		while (true) {
			x = (int)Math.floor(Math.random() * 4) + 1;
			y = (int)Math.floor(Math.random() * 10) + 1;
		if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
			break;
		}
		
		}
		board.get(x - 1).set(y - 1, new Spy(1));
		board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
		x = 0;
		y = 0;
		
		
		for (int c = 0; c < 5; c++) {
			while (true) {
				x = (int)Math.floor(Math.random() * 4) + 1;
			y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
		
		}
			board.get(x - 1).set(y - 1, new Miner(1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			
		}
		
		for (int c = 0; c < 8; c++) {
			while (true) {
				x = (int)Math.floor(Math.random() * 4) + 1;
			y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
		}
			board.get(x - 1).set(y - 1, new Scout(1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			
		}
		
		
		while (true) {
			x = (int)Math.floor(Math.random() * 4) + 1;
			y = (int)Math.floor(Math.random() * 10) + 1;
		if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
			break;
		}
		
		}
		board.get(x - 1).set(y - 1, new Piece(9, 1));
		board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
		x = 0;
		y = 0;
		
		
		for (int c = 0; c < 2; c++) {
			while (true) {
				x = (int)Math.floor(Math.random() * 4) + 1;
			y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
		}
			board.get(x - 1).set(y - 1, new Piece(8, 1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			
		}
		
		for (int c = 0; c < 3; c++) {
			while (true) {
				x = (int)Math.floor(Math.random() * 4) + 1;
			y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
		}
			board.get(x - 1).set(y - 1, new Piece(7, 1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			
		}
		
		for (int c = 0; c < 4; c++) {
			while (true) {
				x = (int)Math.floor(Math.random() * 4) + 1;
			y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
		}
			board.get(x - 1).set(y - 1, new Piece(6, 1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			
		}
		
		for (int c = 0; c < 4; c++) {
			while (true) {
				x = (int)Math.floor(Math.random() * 4) + 1;
			y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
		}
			board.get(x - 1).set(y - 1, new Piece(5, 1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			
		}
		
		for (int c = 0; c < 4; c++) {
			while (true) {
				x = (int)Math.floor(Math.random() * 4) + 1;
			y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
		}
			board.get(x - 1).set(y - 1, new Piece(4, 1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			
		}
		
			
		//Player 2 set up
		
		
		
		System.out.println("It is " + b + "'s turn to set up their side of the board.");
		
		
		while (true) {
		x = (int)Math.floor(Math.random() * 4) + 7;
		fy2 = x;
		y = (int)Math.floor(Math.random() * 10) + 1;
		fx2 = y;
		if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
		
		
		}
		board.get(x - 1).set(y - 1, new Flag(2));
		board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
		
		x = 0;
		y = 0;
		
		
		
		for (int c = 0; c < 6; c++) {
			while (true) {
			x = (int)Math.floor(Math.random() * 4) + 7;
		y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
			
		}
			board.get(x - 1).set(y - 1, new Bomb(2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			
		}
		
		
		while (true) {
		x = (int)Math.floor(Math.random() * 4) + 7;
		y = (int)Math.floor(Math.random() * 10) + 1;
		if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
		}
		
		}
		board.get(x - 1).set(y - 1, new X(10, 2));
		board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
		x = 0;
		y = 0;
		
		
		
		while (true) {
		x = (int)Math.floor(Math.random() * 4) + 7;
		y = (int)Math.floor(Math.random() * 10) + 1;
		if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
		}
		
		}
		board.get(x - 1).set(y - 1, new Spy(2));
		board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
		x = 0;
		y = 0;
		
		
		for (int c = 0; c < 5; c++) {
			while (true) {
			x = (int)Math.floor(Math.random() * 4) + 7;
		y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
		}
			board.get(x - 1).set(y - 1, new Miner(2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			
		}
		
		for (int c = 0; c < 8; c++) {
			while (true) {
			x = (int)Math.floor(Math.random() * 4) + 7;
		y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
		}
			board.get(x - 1).set(y - 1, new Scout(2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			
		}
		
		
		while (true) {
		x = (int)Math.floor(Math.random() * 4) + 7;
		y = (int)Math.floor(Math.random() * 10) + 1;
		if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
		}
		
		}
		board.get(x - 1).set(y - 1, new Piece(9, 2));
		board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
		x = 0;
		y = 0;
		
		
		for (int c = 0; c < 2; c++) {
			while (true) {
			x = (int)Math.floor(Math.random() * 4) + 7;
		y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
		}
			board.get(x - 1).set(y - 1, new Piece(8, 2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			
		}
		
		for (int c = 0; c < 3; c++) {
			while (true) {
			x = (int)Math.floor(Math.random() * 4) + 7;
		y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
		}
			board.get(x - 1).set(y - 1, new Piece(7, 2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			
		}
		
		for (int c = 0; c < 4; c++) {
			while (true) {
			x = (int)Math.floor(Math.random() * 4) + 7;
		y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
		}
			board.get(x - 1).set(y - 1, new Piece(6, 2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			
		}
		
		for (int c = 0; c < 4; c++) {
			while (true) {
			x = (int)Math.floor(Math.random() * 4) + 7;
		y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
		}
			board.get(x - 1).set(y - 1, new Piece(5, 2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			
		}
		
		for (int c = 0; c < 4; c++) {
			while (true) {
			x = (int)Math.floor(Math.random() * 4) + 7;
		y = (int)Math.floor(Math.random() * 10) + 1;
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
		}
			board.get(x - 1).set(y - 1, new Piece(4, 2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			
		}
//			printBoard(board, 2);
		}
		else {
			
			
			
		
		
		//Player 1 set up
		
		System.out.println("It is " + a + "'s turn to set up their side of the board.");
		
		while (true) {
			System.out.println(a + ", where would you like to place your flag(F)?");
			System.out.print("y-coordinate(1-4): ");
			x = sc.nextInt();
			fy1 = x;
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			fx1 = y;
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
			printBoard(board, 1);
			System.out.println("This is not a valid placement. Please try again.");
		}
		board.get(x - 1).set(y - 1, new Flag(1));
		board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
		
		x = 0;
		y = 0;
		printBoard(board, 1);
		
		
		for (int c = 0; c < 6; c++) {
			while (true) {
				System.out.println(a + ", where would you like to place your bomb(B)?");
				
				System.out.print("y-coordinate(1-4): ");
				x = sc.nextInt();
				
				System.out.print("x-coordinate(1-10): ");
				y = sc.nextInt();

			
				if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
					
					break;
				}
				printBoard(board, 1);
				System.out.println("This is not a valid placement. Please try again.");
			
			}
			
			board.get(x - 1).set(y - 1, new Bomb(1));
			
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			
			x = 0;
			y = 0;
			printBoard(board, 1);
		}
		
		
		while (true) {
		System.out.println(a + ", where would you like to place your marshal(X)?");
		System.out.print("y-coordinate(1-4): ");
		x = sc.nextInt();
		System.out.print("x-coordinate(1-10): ");
		y = sc.nextInt();
		if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
			break;
		}
		printBoard(board, 1);
			System.out.println("This is not a valid placement. Please try again.");
		}
		board.get(x - 1).set(y - 1, new X(10, 1));
		board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
		x = 0;
		y = 0;
		printBoard(board, 1);
		
		
		while (true) {
		System.out.println(a + ", where would you like to place your spy(S)?");
		System.out.print("y-coordinate(1-4): ");
		x = sc.nextInt();
		System.out.print("x-coordinate(1-10): ");
		y = sc.nextInt();
		if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
			break;
		}
		printBoard(board, 1);
			System.out.println("This is not a valid placement. Please try again.");
		}
		board.get(x - 1).set(y - 1, new Spy(1));
		board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
		x = 0;
		y = 0;
		printBoard(board, 1);
		
		for (int c = 0; c < 5; c++) {
			while (true) {
			System.out.println(a + ", where would you like to place your miner(3)?");
			System.out.print("y-coordinate(1-4): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 1);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Miner(1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			printBoard(board, 1);
		}
		
		for (int c = 0; c < 8; c++) {
			while (true) {
			System.out.println(a + ", where would you like to place your scout(2)?");
			System.out.print("y-coordinate(1-4): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 1);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Scout(1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			printBoard(board, 1);
		}
		
		
		while (true) {
		System.out.println(a + ", where would you like to place your general(9)?");
		System.out.print("y-coordinate(1-4): ");
		x = sc.nextInt();
		System.out.print("x-coordinate(1-10): ");
		y = sc.nextInt();
		if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
			break;
		}
		printBoard(board, 1);
			System.out.println("This is not a valid placement. Please try again.");
		}
		board.get(x - 1).set(y - 1, new Piece(9, 1));
		board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
		x = 0;
		y = 0;
		printBoard(board, 1);
		
		for (int c = 0; c < 2; c++) {
			while (true) {
			System.out.println(a + ", where would you like to place your colonel(8)?");
			System.out.print("y-coordinate(1-4): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 1);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Piece(8, 1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			printBoard(board, 1);
		}
		
		for (int c = 0; c < 3; c++) {
			while (true) {
			System.out.println(a + ", where would you like to place your major(7)?");
			System.out.print("y-coordinate(1-4): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 1);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Piece(7, 1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			printBoard(board, 1);
		}
		
		for (int c = 0; c < 4; c++) {
			while (true) {
			System.out.println(a + ", where would you like to place your captain(6)?");
			System.out.print("y-coordinate(1-4): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 1);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Piece(6, 1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			printBoard(board, 1);
		}
		
		for (int c = 0; c < 4; c++) {
			while (true) {
			System.out.println(a + ", where would you like to place your lieutenant(5)?");
			System.out.print("y-coordinate(1-4): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 1);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Piece(5, 1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			printBoard(board, 1);
		}
		
		for (int c = 0; c < 4; c++) {
			while (true) {
			System.out.println(a + ", where would you like to place your sergeant(4)?");
			System.out.print("y-coordinate(1-4): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 1 && x <= 4) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 1);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Piece(4, 1));
			board.get(x - 1).get(y - 1).setVisibleToPlayer1(true);
			x = 0;
			y = 0;
			printBoard(board, 1);
		}
		
		printBoard(board, 1);
		
		//Player 2 set up
		printBoard(board, 2);
		
		System.out.println("It is " + b + "'s turn to set up their side of the board.");
		
		
		while (true) {
		System.out.println(b + ", where would you like to place your flag(F)?");
		System.out.print("y-coordinate(7-10): ");
		x = sc.nextInt();
		fy2 = x;
		System.out.print("x-coordinate(1-10): ");
		y = sc.nextInt();
		fx2 = y;
		if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
		
		printBoard(board, 2);
			System.out.println("This is not a valid placement. Please try again.");
		}
		board.get(x - 1).set(y - 1, new Flag(2));
		board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
		
		x = 0;
		y = 0;
		
		printBoard(board, 2);
		
		for (int c = 0; c < 6; c++) {
			while (true) {
			System.out.println(b + ", where would you like to place your bomb(B)?");
			System.out.print("y-coordinate(7-10): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			
			printBoard(board, 2);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Bomb(2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			printBoard(board, 2);
		}
		
		
		while (true) {
		System.out.println(b + ", where would you like to place your marshal(X)?");
		System.out.print("y-coordinate(7-10): ");
		x = sc.nextInt();
		System.out.print("x-coordinate(1-10): ");
		y = sc.nextInt();
		if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
		}
		printBoard(board, 2);
			System.out.println("This is not a valid placement. Please try again.");
		}
		board.get(x - 1).set(y - 1, new X(10, 2));
		board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
		x = 0;
		y = 0;
		printBoard(board, 2);
		
		
		while (true) {
		System.out.println(b + ", where would you like to place your spy(S)?");
		System.out.print("y-coordinate(7-10): ");
		x = sc.nextInt();
		System.out.print("x-coordinate(1-10): ");
		y = sc.nextInt();
		if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
		}
		printBoard(board, 2);
			System.out.println("This is not a valid placement. Please try again.");
		}
		board.get(x - 1).set(y - 1, new Spy(2));
		board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
		x = 0;
		y = 0;
		printBoard(board, 2);
		
		for (int c = 0; c < 5; c++) {
			while (true) {
			System.out.println(b + ", where would you like to place your miner(3)?");
			System.out.print("y-coordinate(7-10): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 2);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Miner(2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			printBoard(board, 2);
		}
		
		for (int c = 0; c < 8; c++) {
			while (true) {
			System.out.println(b + ", where would you like to place your scout(2)?");
			System.out.print("y-coordinate(7-10): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 2);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Scout(2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			printBoard(board, 2);
		}
		
		
		while (true) {
		System.out.println(b + ", where would you like to place your general(9)?");
		System.out.print("y-coordinate(7-10): ");
		x = sc.nextInt();
		System.out.print("x-coordinate(1-10): ");
		y = sc.nextInt();
		if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
		}
		printBoard(board, 2);
			System.out.println("This is not a valid placement. Please try again.");
		}
		board.get(x - 1).set(y - 1, new Piece(9, 2));
		board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
		x = 0;
		y = 0;
		printBoard(board, 2);
		
		for (int c = 0; c < 2; c++) {
			while (true) {
			System.out.println(b + ", where would you like to place your colonel(8)?");
			System.out.print("y-coordinate(7-10): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 2);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Piece(8, 2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			printBoard(board, 2);
		}
		
		for (int c = 0; c < 3; c++) {
			while (true) {
			System.out.println(b + ", where would you like to place your major(7)?");
			System.out.print("y-coordinate(7-10): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 2);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Piece(7, 2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			printBoard(board, 2);
		}
		
		for (int c = 0; c < 4; c++) {
			while (true) {
			System.out.println(b + ", where would you like to place your captain(6)?");
			System.out.print("y-coordinate(7-10): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 2);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Piece(6, 2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			printBoard(board, 2);
		}
		
		for (int c = 0; c < 4; c++) {
			while (true) {
			System.out.println(b + ", where would you like to place your lieutenant(5)?");
			System.out.print("y-coordinate(7-10): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 2);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Piece(5, 2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			printBoard(board, 2);
		}
		
		for (int c = 0; c < 4; c++) {
			while (true) {
			System.out.println(b + ", where would you like to place your sergeant(4)?");
			System.out.print("y-coordinate(7-10): ");
			x = sc.nextInt();
			System.out.print("x-coordinate(1-10): ");
			y = sc.nextInt();
			if ((x >= 7 && x <= 10) && (y >= 1 && y <= 10) && board.get(x - 1).get(y - 1).getRank() == -2) {
				break;
			}
			printBoard(board, 2);
			System.out.println("This is not a valid placement. Please try again.");
		}
			board.get(x - 1).set(y - 1, new Piece(4, 2));
			board.get(x - 1).get(y - 1).setVisibleToPlayer2(true);
			x = 0;
			y = 0;
			printBoard(board, 2);
		}
	}	
		
		
//		while(!gameOver) {
		while(true) {
			playerTurn(1, a, board);
				if(board.get(fy2 - 1).get(fx2 - 1).getRank() != 0) {
					System.out.println("Game Over!");
					System.out.println(a + " wins!");
					break;
				}
				
			for (int c = 0; c < 45; c++) {
				System.out.println(".");
			}
			System.out.print("Please switch players. Then press enter to continue: ");
			sc.nextLine();
				
			playerTurn(2, b, board);
				if(board.get(fy1 - 1).get(fx1 - 1).getRank() != 0) {
					System.out.println("Game Over!");
					System.out.println(b + " wins!");
					break;
				}
			for (int c = 0; c < 45; c++) {
				System.out.println(".");
			}
			System.out.print("Please switch players. Then press enter to continue: ");
			sc.nextLine();
			
		}
		
	}
	
	public static void printBoard(ArrayList<ArrayList<Piece>> board, int turn) {
/*		System.out.println("      1   2   3   4   5   6   7   8   9   X       ");
		System.out.println("     _______________________________________    ");
		System.out.println("1   |_1_|_2_|_3_|_4_|_5_|_6_|_7_|_8_|_9_|_X_|   ");
		System.out.println("2   |_1_|_2_|_3_|_4_|_5_|_6_|_7_|_8_|_9_|_X_|   ");
		System.out.println("3   |                                           ");
		System.out.println("4   |");
		System.out.println("5   |");
		System.out.println("6   |");
		System.out.println("7   |");
		System.out.println("8   |");
		System.out.println("9   |");
		System.out.println("X   |");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
*/		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("        1     2     3     4     5     6     7     8     9     X                             ");																											
		System.out.println("      ___________________________________________________________             ");																				
		System.out.println("     |     |     |     |     |     |     |     |     |     |     |       ");																		
		System.out.println("1    |  " + board.get(0).get(0).printPiece(turn) + "  |  " + board.get(0).get(1).printPiece(turn) + "  |  " + board.get(0).get(2).printPiece(turn) + "  |  " + board.get(0).get(3).printPiece(turn) + "  |  " + board.get(0).get(4).printPiece(turn) + "  |  " + board.get(0).get(5).printPiece(turn) + "  |  " + board.get(0).get(6).printPiece(turn) + "  |  " + board.get(0).get(7).printPiece(turn) + "  |  " + board.get(0).get(8).printPiece(turn) + "  |  " + board.get(0).get(9).printPiece(turn) + "  |          ");
		System.out.println("     |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|            ");																																
		System.out.println("     |     |     |     |     |     |     |     |     |     |     |       ");																																						
		System.out.println("2    |  " + board.get(1).get(0).printPiece(turn) + "  |  " + board.get(1).get(1).printPiece(turn) + "  |  " + board.get(1).get(2).printPiece(turn) + "  |  " + board.get(1).get(3).printPiece(turn) + "  |  " + board.get(1).get(4).printPiece(turn) + "  |  " + board.get(1).get(5).printPiece(turn) + "  |  " + board.get(1).get(6).printPiece(turn) + "  |  " + board.get(1).get(7).printPiece(turn) + "  |  " + board.get(1).get(8).printPiece(turn) + "  |  " + board.get(1).get(9).printPiece(turn) + "  |          ");
		System.out.println("     |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|            ");																												
		System.out.println("     |     |     |     |     |     |     |     |     |     |     |       ");																														
		System.out.println("3    |  " + board.get(2).get(0).printPiece(turn) + "  |  " + board.get(2).get(1).printPiece(turn) + "  |  " + board.get(2).get(2).printPiece(turn) + "  |  " + board.get(2).get(3).printPiece(turn) + "  |  " + board.get(2).get(4).printPiece(turn) + "  |  " + board.get(2).get(5).printPiece(turn) + "  |  " + board.get(2).get(6).printPiece(turn) + "  |  " + board.get(2).get(7).printPiece(turn) + "  |  " + board.get(2).get(8).printPiece(turn) + "  |  " + board.get(2).get(9).printPiece(turn) + "  |          ");
		System.out.println("     |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|            ");																																		
		System.out.println("     |     |     |     |     |     |     |     |     |     |     |       ");																															
		System.out.println("4    |  " + board.get(3).get(0).printPiece(turn) + "  |  " + board.get(3).get(1).printPiece(turn) + "  |  " + board.get(3).get(2).printPiece(turn) + "  |  " + board.get(3).get(3).printPiece(turn) + "  |  " + board.get(3).get(4).printPiece(turn) + "  |  " + board.get(3).get(5).printPiece(turn) + "  |  " + board.get(3).get(6).printPiece(turn) + "  |  " + board.get(3).get(7).printPiece(turn) + "  |  " + board.get(3).get(8).printPiece(turn) + "  |  " + board.get(3).get(9).printPiece(turn) + "  |          ");
		System.out.println("     |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|            ");																														
		System.out.println("     |     |     |~~~~~|~~~~~|     |     |~~~~~|~~~~~|     |     |       ");																																						
		System.out.println("5    |  " + board.get(4).get(0).printPiece(turn) + "  |  " + board.get(4).get(1).printPiece(turn) + "  |~~~~~|~~~~~|  " + board.get(4).get(4).printPiece(turn) + "  |  " + board.get(4).get(5).printPiece(turn) + "  |~~~~~|~~~~~|  " + board.get(4).get(8).printPiece(turn) + "  |  " + board.get(4).get(9).printPiece(turn) + "  |          ");
		System.out.println("     |_____|_____|~~~~~|~~~~~|_____|_____|~~~~~|~~~~~|_____|_____|            ");																																				
		System.out.println("     |     |     |~~~~~|~~~~~|     |     |~~~~~|~~~~~|     |     |       ");																											
		System.out.println("6    |  " + board.get(5).get(0).printPiece(turn) + "  |  " + board.get(5).get(1).printPiece(turn) + "  |~~~~~|~~~~~|  " + board.get(5).get(4).printPiece(turn) + "  |  " + board.get(5).get(5).printPiece(turn) + "  |~~~~~|~~~~~|  " + board.get(5).get(8).printPiece(turn) + "  |  " + board.get(5).get(9).printPiece(turn) + "  |          ");
		System.out.println("     |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|            ");																															
		System.out.println("     |     |     |     |     |     |     |     |     |     |     |       ");																																																											
		System.out.println("7    |  " + board.get(6).get(0).printPiece(turn) + "  |  " + board.get(6).get(1).printPiece(turn) + "  |  " + board.get(6).get(2).printPiece(turn) + "  |  " + board.get(6).get(3).printPiece(turn) + "  |  " + board.get(6).get(4).printPiece(turn) + "  |  " + board.get(6).get(5).printPiece(turn) + "  |  " + board.get(6).get(6).printPiece(turn) + "  |  " + board.get(6).get(7).printPiece(turn) + "  |  " + board.get(6).get(8).printPiece(turn) + "  |  " + board.get(6).get(9).printPiece(turn) + "  |          ");
		System.out.println("     |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|            ");																										
		System.out.println("     |     |     |     |     |     |     |     |     |     |     |       ");																									
		System.out.println("8    |  " + board.get(7).get(0).printPiece(turn) + "  |  " + board.get(7).get(1).printPiece(turn) + "  |  " + board.get(7).get(2).printPiece(turn) + "  |  " + board.get(7).get(3).printPiece(turn) + "  |  " + board.get(7).get(4).printPiece(turn) + "  |  " + board.get(7).get(5).printPiece(turn) + "  |  " + board.get(7).get(6).printPiece(turn) + "  |  " + board.get(7).get(7).printPiece(turn) + "  |  " + board.get(7).get(8).printPiece(turn) + "  |  " + board.get(7).get(9).printPiece(turn) + "  |          ");
		System.out.println("     |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|            ");																																	
		System.out.println("     |     |     |     |     |     |     |     |     |     |     |       ");																																																						
		System.out.println("9    |  " + board.get(8).get(0).printPiece(turn) + "  |  " + board.get(8).get(1).printPiece(turn) + "  |  " + board.get(8).get(2).printPiece(turn) + "  |  " + board.get(8).get(3).printPiece(turn) + "  |  " + board.get(8).get(4).printPiece(turn) + "  |  " + board.get(8).get(5).printPiece(turn) + "  |  " + board.get(8).get(6).printPiece(turn) + "  |  " + board.get(8).get(7).printPiece(turn) + "  |  " + board.get(8).get(8).printPiece(turn) + "  |  " + board.get(8).get(9).printPiece(turn) + "  |          ");
		System.out.println("     |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|            ");																																																													
		System.out.println("     |     |     |     |     |     |     |     |     |     |     |       ");																																																											
		System.out.println("X    |  " + board.get(9).get(0).printPiece(turn) + "  |  " + board.get(9).get(1).printPiece(turn) + "  |  " + board.get(9).get(2).printPiece(turn) + "  |  " + board.get(9).get(3).printPiece(turn) + "  |  " + board.get(9).get(4).printPiece(turn) + "  |  " + board.get(9).get(5).printPiece(turn) + "  |  " + board.get(9).get(6).printPiece(turn) + "  |  " + board.get(9).get(7).printPiece(turn) + "  |  " + board.get(9).get(8).printPiece(turn) + "  |  " + board.get(9).get(9).printPiece(turn) + "  |          ");
		System.out.println("     |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|            ");
		System.out.println("");
		System.out.println("");
		System.out.println("");
/*		System.out.println("2   |_1_|_2_|_3_|_4_|_5_|_6_|_7_|_8_|_9_|_X_|   ");
		System.out.println("3   |                                           ");
		System.out.println("4   |");
		System.out.println("5   |");
		System.out.println("6   |");
		System.out.println("7   |");
		System.out.println("8   |");
		System.out.println("9   |");
		System.out.println("X   |");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|"); */
	}
	
	
/*	public static void playerTurn (int turn, String name) {
		printBoard(board, turn);
		Scanner sc = new Scanner(System.in);
		int x1;
		int y1;
		System.out.println(name + ", it's your turn! Which piece would you like to move?")
		System.out.print("x-coordinate: ");
		x1 = sc.nextInt();
		System.out.print("y-coordinate: ");
		y1 = sc.nextInt();
	} */
	
	public static void playerTurn (int turn, String name, ArrayList<ArrayList<Piece>> board) {
		printBoard(board, turn);
		Scanner sc = new Scanner(System.in);
		int x1;
		int y1;
		String axis;
		String direction;
		
		int z = 1;
		
		while(true) {
			
			System.out.println(name + ", it's your turn! Which piece would you like to move?");
			System.out.print("y-coordinate: ");
			x1 = sc.nextInt() - 1;
			System.out.print("x-coordinate: ");
			y1 = sc.nextInt() - 1;
			String temp1 = sc.nextLine();
			
			
			
			System.out.print("Which direction would you like to move it? Horizontally(h) or vertically(v): ");
			axis = sc.nextLine();
			if (axis.equals("h")) { 
				System.out.print("Which direction would you like to move it? Left(l) or right(r): ");
				direction = sc.nextLine();
				if (direction.equals("l")) {
					z *= -1;
				}
			}
			if (axis.equals("v")) { 
				System.out.print("Which direction would you like to move it? Up(u) or down(d): ");
				direction = sc.nextLine();
				if (direction.equals("u")) {
					z *= -1;
				}
			}
			
			if (board.get(x1).get(y1).getRank() == 2) {
				System.out.print("How many spaces would you like to move it?: ");
				int temp = 1;
				temp = sc.nextInt();
				z *= temp;
			}
			
			if (validMove(x1, y1, axis, z, board, turn)) {
				break;
			}
			else {
				System.out.println("This is not a valid move. Please try again.");
			}
			
		}
		
		
/*		if (axis.equals("h")) {
			if (board.get(x1).get(y1).getRank() > board.get(x1).get(y1 + z).getRank() && board.get(x1).get(y1 + z).getRank() != -2) {
				
			}
			else if (board.get(x1).get(y1).getRank() == 3 && board.get(x1).get(y1 + z).getRank() == -1) {
					
			}
			else if (board.get(x1).get(y1).getRank() == 1 &&  board.get(x1).get(y1 + z).getRank() == 10) {
				
			}
			else {
				
			}
		}
*/		
		
		
		if (axis.equals("h")) {
			if (((board.get(x1).get(y1).getRank() == 3) && (board.get(x1).get(y1 + z).getRank() == -1)) || ((board.get(x1).get(y1).getRank() == 1) &&  (board.get(x1).get(y1 + z).getRank() == 10)) || ((board.get(x1).get(y1).getRank() >= board.get(x1).get(y1 + z).getRank()) && (board.get(x1).get(y1 + z).getRank() != -1) && (board.get(x1).get(y1 + z).getRank() != -2))) {
				
				board.get(x1).set(y1 + z, board.get(x1).get(y1));
	//			board.get(x1).set(y1 + z, board.get(x1).get(y1));
				board.get(x1).remove(y1);
				board.get(x1).add(y1, new Piece()); 
				board.get(x1).get(y1 + z).setVisibleToPlayer1(true);
				board.get(x1).get(y1 + z).setVisibleToPlayer2(true);
				
				
			}
			else if (board.get(x1).get(y1 + z).getRank() == -2) {
				board.get(x1).set(y1 + z, board.get(x1).get(y1));
	//			board.get(x1).set(y1 + z, board.get(x1).get(y1));
				board.get(x1).remove(y1);
				board.get(x1).add(y1, new Piece()); 
				System.out.println("else if h");
			}
			else {
				
				board.get(x1).remove(y1);
				board.get(x1).add(y1, new Piece());
				board.get(x1).get(y1 + z).setVisibleToPlayer1(true);
				board.get(x1).get(y1 + z).setVisibleToPlayer2(true);
				
			}
		}
		
		if (axis.equals("v")) {
			if (((board.get(x1).get(y1).getRank() == 3) && (board.get(x1 + z).get(y1).getRank() == -1)) || ((board.get(x1).get(y1).getRank() == 1) &&  (board.get(x1 + z).get(y1).getRank() == 10)) || ((board.get(x1).get(y1).getRank() >= board.get(x1 + z).get(y1).getRank()) && (board.get(x1 + z).get(y1).getRank() != -1) && (board.get(x1 + z).get(y1).getRank() != -2))) {
				
	//			board.get(x1).set(y1 + z, board.get(x1).get(y1));
				board.get(x1 + z).set(y1, board.get(x1).get(y1));
				board.get(x1).remove(y1);
				board.get(x1).add(y1, new Piece()); 
				board.get(x1 + z).get(y1).setVisibleToPlayer1(true);
				board.get(x1 + z).get(y1).setVisibleToPlayer2(true);
				
				
			}
			else if (board.get(x1 + z).get(y1).getRank() == -2) {
				System.out.println("else if v");
	//			board.get(x1).set(y1 + z, board.get(x1).get(y1));
				board.get(x1 + z).set(y1, board.get(x1).get(y1));
				board.get(x1).remove(y1);
				board.get(x1).add(y1, new Piece()); 
			}
			else {
				
				board.get(x1).remove(y1);
				board.get(x1).add(y1, new Piece());
				board.get(x1 + z).get(y1).setVisibleToPlayer1(true);
				board.get(x1 + z).get(y1).setVisibleToPlayer2(true);
				
			}
		}
		
		
		
		
		
		
		
	}

	public static boolean validMove(int x, int y, String axis, int z, ArrayList<ArrayList<Piece>> board, int turn) {
		
		if (turn != board.get(x).get(y).getOwner()) {
			return false;
		}
		
		if (board.get(x).get(y).getRank() == 0 || board.get(x).get(y).getRank() == -1 || board.get(x).get(y).getRank() == -2) {
			return false;
		}
		
		if (axis.equals("h")) { 
			if ((x == 4 || x == 5) && ((y + z) == 2 || (y + z) == 3 || (y + z) == 6 || (y + z) == 7)) {
				return false;
			}
		}
		
		if (axis.equals("v")) { 
			if ((((x + z) == 4 || (x + z) == 5)) && (y == 2 || y == 3 || y == 6 || y == 7)) {
				return false;
			}
		}
		
		if (axis.equals("h")) { 
			if (z < 0) {
				for (int c = 1; c < z; c++) {
					if (board.get(x).get(y - c).getRank() != -2) {
						return false;
					}
				}
			}
			else {
				for (int c = 1; c < z; c++) {
					if (board.get(x).get(y + c).getRank() != -2) {
						return false;
					}
				}
			}
		}
		
		
		if (axis.equals("v")) { 
			if (z < 0) {
				for (int c = 1; c < z; c++) {
					if (board.get(x - c).get(y).getRank() != -2) {
						return false;
					}
				}
			}
			else {
				for (int c = 1; c < z; c++) {
					if (board.get(x + c).get(y).getRank() != -2) {
						return false;
					}
				}
				
			}
		}
		
		
		return true;
		
		
	}

	

//	public boolean isValidMove() {
//		
//	}
}
