import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class evenOddGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
			
			Scanner input = new Scanner(System.in);			
			
			evenOddGame myRandomNumber = new evenOddGame();
			
		    boolean even;    
		    boolean odd;
		    boolean jorge;
		    boolean luis;     
		    
		    boolean userNotDone = true;		
			
			while (userNotDone)
			{
				String input2 = JOptionPane.showInputDialog(
						 "Enter 1 to continue playing\n" +
						 "Enter 2 to exit the game" );
						
				 int choice = Integer.parseInt( input2 );			
				
				
				if (choice == 1) 
				{
					
					int lost = 0;
				    int win = 0;
				    int count = 0; 
				    
				    do {     
				    	
				    	 int game=myRandomNumber.displayMessage(); 			    			

				    	
				    	//int game = 0 + (int) (Math.random() * 10);
				    	
				    	String input3 = JOptionPane.showInputDialog( "Welcome, please type 2 for an even number and type 1 for an odd number\n");  	
						
				    	int user = Integer.parseInt( input3 );											
				    	
				    	even = false;
				    	
				    	
						even = (game % 2) == 0;						
						jorge = user == 2;
						luis = user == 1;				
						
						if  (jorge && even) 
						{
							String message =
									String.format( "Congratulations, this number %d is a even number. You have won the game.\n\n", game);
									JOptionPane.showMessageDialog( null, message );
									win++;
						}
						else if (luis && !even)
						{
							String message =
									String.format( "Congratulations, This number %d is a odd. Your number is %d. You have won the game.\n\n", game, user);
									JOptionPane.showMessageDialog( null, message );
									win++;
						}
						
						else 
						{
							String message =
									String.format( "System number is %d and your number is %d. You have lost the game.\n\n", game, user);
									JOptionPane.showMessageDialog( null, message );
									lost++;
							
						}
						
							count++; 			
				    }    
				    while (count < 3);    
				    
				    String message4 =
							String.format( "You have played this game %d\n\n", count);	
							JOptionPane.showMessageDialog( null, message4 );
							
					String message5 =
							String.format( "You have win this game %d\n\n", win);	
							JOptionPane.showMessageDialog( null, message5 );
									
					String message6 =
							String.format( "You have lost this game %d\n\n", lost);	
							JOptionPane.showMessageDialog( null, message6 );						
							   	
				}		
				else if (choice == 2) 
					userNotDone = false;
			}						
		}	 
		}
		
		

	