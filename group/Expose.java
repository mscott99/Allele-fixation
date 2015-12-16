package group;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;


public class Expose extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JTextArea field;
	public static JButton button;
	Expose(){
		setSize(800,800);
		
		JPanel panel = new JPanel();
		JPanel display = new JPanel();
		field= new JTextArea(40,60);
		field.setEditable(false);
		button = new JButton("launch");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				field.setText(null);
				Aleatoire.totalAmount = 0;
				Aleatoire.fixate(5);
				Expose.field.append("It took "+ Aleatoire.totalAmount+ " rounds to fixate all the population" + '\n');
			}
		});
		JScrollPane scroll = new JScrollPane(field);
		
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);		display.add(button);
		
		panel.add(scroll);
		
		add(panel,BorderLayout.CENTER);
		add(display,BorderLayout.NORTH);
		

	}
}