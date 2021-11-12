import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout; 
import java.awt.Color;
import java.util.Scanner;

/**
 *	Main Class
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("NEW GAME WHOO!");
		
		JFrame my_frame = new JFrame("Drawing Program");
		//Drawing my_drawing = new Drawing();
		Scanner in = new Scanner(System.in);
		
		my_frame.getContentPane().setBackground(Color.GREEN);
		my_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		my_frame.setSize(400, 300); // may use setBounds
		my_frame.setVisible(true);
		
		//JPanel my_panel = new JPanel();
		//my_panel.setBackground(Color.BLUE);
		//my_panel.setSize(20, 20);
		//my_panel.setVisible(true);
		//my_frame.getContentPane().add(my_panel, BorderLayout.CENTER);
		//my_frame.getContentPane().add(my_drawing);
	    int input = 1;
		while(input != 0) {
			System.out.print("Enter: ");
			input = in.nextInt();
			
			JPanel new_panel = new JPanel();
			new_panel.setBackground(Color.BLUE);
			new_panel.setSize(input, input);
			new_panel.setVisible(true);
			my_frame.getContentPane().add(new_panel, BorderLayout.CENTER);
		}
		
		in.close();
	}

}
