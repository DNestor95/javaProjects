package encryption;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class translator extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JButton left;
	private JButton right;
	private JButton center;
	
	public translator(){
		super("Translator");
		setLayout(new FlowLayout());
		
		left = new JButton("left");
		right = new JButton("Right");
		center  = new JButton("Center");
		add(left);
		add(center);
		add(right);
		
		
		
		
		sinisterClass sinister = new sinisterClass();
		
		dexClass dexter = new dexClass();
		
		medClass med = new medClass();
		left.addActionListener(sinister);
		
		right.addActionListener(dexter);
		
	center.addActionListener(med);
		
		
		
		
	}
	
	private class sinisterClass implements ActionListener {
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, "The Latin Translation of Left is Sinister");
			
			
		}
	}
	private class dexClass implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			JOptionPane.showMessageDialog(null, "The Latin Translation of right is Dexter");
		}
		
		
	}
		private class medClass implements ActionListener{
			public void actionPerformed(ActionEvent event)
			{
				JOptionPane.showMessageDialog(null, "The Latin Transation of Center is Medium");
				
			}
			
			
		}
		
			
		}
		
		
		

	
	


