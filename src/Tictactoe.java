import java.util.*;

public class Tictactoe 
{
	private static char r1, r2, r3, r4, r5, r6, r7, r8, r9;
	private static Random rand = new Random();
	private static Scanner scan = new Scanner(System.in);
	private static int mode = 0;
	private static int turn = 1;
	private static boolean play = true;
	
	public static void main(String [] args)
	{
		r1='1'; r2='2'; r3='3'; r4='4'; r5='5'; r6='6'; r7='7'; r8='8'; r9='9';
		int guess, coin;
		while(true)
		{
			while(true)
			{
				try
				{
					System.out.println("Heads or tails? Winner goes first. Enter a '1' or a '0'.");
					guess = scan.nextInt();
					coin = rand.nextInt(2);
					if(guess == coin)
					{
						System.out.println("You go first!");
						pause(1);
						break;
					}
					else if(guess != 0 && guess != 1)
					{
						System.out.println("You can't follow instructions. You go second. \nSwitching to impossible mode.");
						mode = 1;
						pcTurn();
						pause(3);
						break;
					}
					else
					{
						System.out.println("Sorry! You go second.");
						pcTurn();
						pause(1);
						break;
					}
				}
				catch(InputMismatchException ie)
				{
					System.out.println("You did not enter a number. Please enter a '1' or a '0'.");
				}
			}
			int input;
			while(play)
			{
				System.out.print("\n\n" + graph());
				System.out.println("Enter the corresponding number for your choice.\n(Enter 0 to quit)");
				try
				{
					input = scan.nextInt();
				}
				catch(InputMismatchException ie)
				{
					System.out.println("Please enter a number on the graph corresponding to your choice or '0' to quit.");
					pause(3);
					scan.next();
					continue;
				}
				switch(input)
				{
					case 1:
						if(r1 == '1')
						{
							r1 = 'O';
							checkVictory();
							pcTurn();
						}
						else
							invalid();
						break;
					
					case 2:
						if(r2 == '2')
						{
							r2 = 'O';
							checkVictory();
							pcTurn();
						}
						else
							invalid();
						break;
					
					case 3:
						if(r3 == '3')
						{
							r3 = 'O';
							checkVictory();
							pcTurn();
						}
						else
							invalid();
						break;
						
					case 4:
						if(r4 == '4')
						{
							r4 = 'O';
							checkVictory();
							pcTurn();
						}
						else
							invalid();
						break;
						
					case 5:
						if(r5 == '5')
						{
							r5 = 'O';
							checkVictory();
							pcTurn();
						}
						else
							invalid();
						break;
					
					case 6:
						if(r6 == '6')
						{
							r6 = 'O';
							checkVictory();
							pcTurn();
						}
						else
							invalid();
						break;
					
					case 7:
						if(r7 == '7')
						{
							r7 = 'O';
							checkVictory();
							pcTurn();
						}
						else
							invalid();
						break;
					
					case 8:
						if(r8 == '8')
						{
							r8 = 'O';
							checkVictory();
							pcTurn();
						}
						else
							invalid();
						break;
					
					case 9:
						if(r9 == '9')
						{
							r9 = 'O';
							checkVictory();
							pcTurn();
						}
						else
							invalid();
						break;
					
					default:
						System.out.println("Please enter a number 1 - 9!");
						pause(3);
						break;
					
					case 0:
						System.out.println("Thanks for playing! Bye!");
						scan.close();
						System.exit(0);
				}
			}
			System.out.println("Play again? Enter '0' to quit or '1' to continue.");
			int token;
			while(true)
			{
				try
				{
					token = scan.nextInt();
					if(token == 0)
					{
						System.out.println("Thanks for playing! Bye!");
						scan.close();
						System.exit(0);
					}
					if(token == 1)
					{
						System.out.println("\n\n");
						break;
					}
					else
					{
						System.out.println("Invalid input. Defaulting to quit.\nThanks for playing! Bye!");
						scan.close();
						System.exit(0);
					}
				}
				catch(InputMismatchException ie)
				{
					System.out.println("Invalid input. Defaulting to quit.\nThanks for playing! Bye!");
					scan.close();
					System.exit(0);					
				}
			}
			r1='1'; r2='2'; r3='3'; r4='4'; r5='5'; r6='6'; r7='7'; r8='8'; r9='9';
			mode = 0;
			turn = 1;
			play = true;
		}
	}
	
	private static void checkVictory()
	{
		if(r1 == 'O' && r2 == 'O' && r3 == 'O')
		{
			win();
			return;
		}
		if(r4 == 'O' && r5 == 'O' && r6 == 'O')
		{
			win();
			return;
		}
		if(r7 == 'O' && r8 == 'O' && r9 == 'O')
		{
			win();
			return;
		}
		if(r1 == 'O' && r4 == 'O' && r7 == 'O')
		{
			win();
			return;
		}
		if(r2 == 'O' && r5 == 'O' && r8 == 'O')
		{
			win();
			return;
		}
		if(r3 == 'O' && r6 == 'O' && r9 == 'O')
		{
			win();
			return;
		}
		if(r1 == 'O' && r5 == 'O' && r9 == 'O')
		{
			win();
			return;
		}
		if(r3 == 'O' && r5 == 'O' && r7 == 'O')
		{
			win();
			return;
		}			
		if(r1 == 'X' && r2 == 'X' && r3 == 'X')
		{
			lose();
			return;
		}
		if(r4 == 'X' && r5 == 'X' && r6 == 'X')
		{
			lose();
			return;
		}
		if(r7 == 'X' && r8 == 'X' && r9 == 'X')
		{
			lose();
			return;
		}
		if(r1 == 'X' && r4 == 'X' && r7 == 'X')
		{
			lose();
			return;
		}
		if(r2 == 'X' && r5 == 'X' && r8 == 'X')
		{
			lose();
			return;
		}
		if(r3 == 'X' && r6 == 'X' && r9 == 'X')
		{
			lose();
			return;
		}
		if(r1 == 'X' && r5 == 'X' && r9 == 'X')
		{
			lose();
			return;
		}
		if(r3 == 'X' && r5 == 'X' && r7 == 'X')
		{
			lose();
			return;
		}
		if(r1 != '1' && r2 != '2' && r3 != '3' && r4 != '4' && r5 != '5' && r6 != '6' && r7 != '7' && r8 != '8' && r9 != '9')
		{
			System.out.println("\n\n" + graph());
			System.out.println("\nDraw, you lose!");
			play = false;
			return;
		}
		return;
	}
	
	private static void pcTurn()
	{
		if(mode == 1)
		{
			pcImpossible();
			return;
		}
		int input;
		boolean go = true;
		if(r1 != '1' && r2 != '2' && r3 != '3' && r4 != '4' && r5 != '5' && r6 != '6' && r7 != '7' && r8 != '8' && r9 != '9')
			return;
		while(go)
		{
			input = rand.nextInt(9)+1;
			switch(input)
			{
				case 1:
					if(r1 == '1')
					{
						r1 = 'X';
						checkVictory();
						go = false;
					}
					else
						continue;
					break;
					
				case 2:
					if(r2 == '2')
					{
						r2 = 'X';
						checkVictory();
						go = false;
					}
					else
						continue;
					break;
					
				case 3:
					if(r3 == '3')
					{
						r3 = 'X';
						checkVictory();
						go = false;
					}
					else
						continue;
					break;
					
				case 4:
					if(r4 == '4')
					{
						r4 = 'X';
						checkVictory();
						go = false;
					}
					else
						continue;
					break;
					
				case 5:
					if(r5 == '5')
					{
						r5 = 'X';
						checkVictory();
						go = false;
					}
					else
						continue;
					break;
					
				case 6:
					if(r6 == '6')
					{
						r6 = 'X';
						checkVictory();
						go = false;
					}
					else
						continue;
					break;
					
				case 7:
					if(r7 == '7')
					{
						r7 = 'X';
						checkVictory();
						go = false;
					}
					else
						continue;
					break;
					
				case 8:
					if(r8 == '8')
					{
						r8 = 'X';
						checkVictory();
						go = false;
					}
					else
						continue;
					break;
					
				case 9:
					if(r9 == '9')
					{
						r9 = 'X';
						checkVictory();
						go = false;
					}
					else
						continue;
					break;
					
				default:
					System.out.println("Something's wrong with the Random!");
					pause(3);
					System.exit(0);
			}
		}
	}
	
	private static void pcImpossible()
	{
		if(turn == 1)
		{
			r5 = 'X';
			turn++;
			return;
		}
		if(turn == 2)
		{
			if(r2 == 'O' || r4 == 'O' || r6 == 'O' || r8 == 'O')
			{
				r1 = 'X';
				turn = 5;
				return;
			}
			if(r1 == 'O' || r7 == 'O')
			{
				r4 = 'X';
				turn++;
				return;
			}
			if(r3 == 'O' || r9 == 'O')
			{
				r6 = 'X';
				turn++;
				return;
			}
			System.out.println("If error! Current turn: " + turn);
			return;
		}
		if(turn == 3)
		{
			if(r6 == 'O' && r1 == 'O')
			{
				r2 = 'X';
				turn++;
				return;
			}
			else if(r6 == '6' && r1 == 'O')
			{
				r6 = 'X';
				checkVictory();
				return;
			}
			if(r4 == 'O' && r3 == 'O')
			{
				r2 = 'X';
				turn++;
				return;
			}
			else if(r4 == '4' && r3 == 'O')
			{
				r4 = 'X';
				checkVictory();
				return;
			}
			if(r6 == 'O' && r7 == 'O')
			{
				r8 = 'X';
				turn++;
				return;
			}
			else if(r6 == '6' && r7 == 'O')
			{
				r6 = 'X';
				checkVictory();
				return;
			}
			if(r4 == 'O' && r9 == 'O')
			{
				r8 = 'X';
				turn++;
				return;
			}
			else if(r4 == '4' && r9 == 'O')
			{
				r4 = 'X';
				checkVictory();
				return;
			}
			System.out.println("If error! Current turn: " + turn);
			return;
		}
		if(turn == 4)
		{
			if(r8 == 'O' && r1 == 'O')
			{
				r9 = 'X';
				mode = 0;
				return;
			}
			else if(r8 == '8' && r1 == 'O')
			{
				r8 = 'X';
				checkVictory();
				return;
			}
			if(r8 == 'O' && r3 == 'O')
			{
				r7 = 'X';
				mode = 0;
				return;
			}
			else if(r8 == '8' && r3 == 'O')
			{
				r8 = 'X';
				checkVictory();
				return;
			}
			if(r2 == 'O' && r7 == 'O')
			{
				r3 = 'X';
				mode = 0;
				return;
			}
			else if(r2 == '2' && r7 == 'O')
			{
				r2 = 'X';
				checkVictory();
				return;
			}
			if(r2 == 'O' && r9 == 'O')
			{
				r1 = 'X';
				mode = 0;
				return;
			}
			else if(r2 == '2' && r9 == 'O')
			{
				r2 = 'X';
				checkVictory();
				return;
			}
			System.out.println("If error! Current turn: " + turn);
			return;
		}
		if(turn == 5)
		{
			if(r9 == '9')
			{
				r9 = 'X';
				checkVictory();
				return;
			}
			if(r2 == 'O' || r8 == 'O')
			{
				r7 = 'X';
				turn++;
				return;
			}
			if(r4 == 'O' || r6 == 'O')
			{
				r3 = 'X';
				turn++;
				return;
			}
			System.out.println("If error! Current turn: " + turn);
			return;
		}
		if(turn == 6)
		{
			if(r2 == 'O' && r4 == '4')
			{
				r4 = 'X';
				checkVictory();
				return;
			}
			if(r2 == 'O' && r3 == '3')
			{
				r3 = 'X';
				checkVictory();
				return;
			}
			if(r4 == 'O' && r2 == '2')
			{
				r2 = 'X';
				checkVictory();
				return;
			}
			if(r4 == 'O' && r7 == '7')
			{
				r7 = 'X';
				checkVictory();
				return;
			}
			if(r6 == 'O' && r2 == '2')
			{
				r2 = 'X';
				checkVictory();
				return;
			}
			if(r6 == 'O' && r7 == '7')
			{
				r2 = 'X';
				checkVictory();
				return;
			}
			if(r8 == 'O' && r3 == '3')
			{
				r3 = 'X';
				checkVictory();
				return;
			}
			if(r8 == 'O' && r4 == '4')
			{
				r4 = 'X';
				checkVictory();
				return;
			}
			System.out.println("If error! Current turn: " + turn);
			return;
		}
		System.out.println("Turn error! Current turn: " + turn);
		return;
	}
	
	private static String graph()
	{
		String out = r1 + "|" + r2 + "|" + r3 + "\n" +
		 		 	 "-----\n" +
		 		 	 r4 + "|" + r5 + "|" + r6 + "\n" +
		 		 	 "-----\n" +
		 		 	 r7 +"|" + r8 + "|" + r9 + "\n\n";
		return out;
	}
	
	private static void pause(int i)
	{
		int j = i*1000;
		try {
		    Thread.sleep(j);
		} catch (InterruptedException ie) {
		    return;
		}
		return;
	}
	
	private static void invalid()
	{
		System.out.println("Already used! Pick another!\n\n");
		pause(3);
		return;
	}
	
	private static void win()
	{
		System.out.println("\n\n" + graph());
		System.out.println("\nCongratulations, you win!");
		play = false;
		return;
	}
	
	private static void lose()
	{
		System.out.println("\n\n" + graph());
		System.out.println("\nComputer wins, you lose!");
		play = false;
		return;
	}
}
