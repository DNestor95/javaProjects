package buttons;

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
		
		left = new JButton("Left");
		right = new JButton("Right");
		center  = new JButton("Center");
		add(left);
		add(center);
		add(right);
		
		
		
		
		HandlerClass handler = new HandlerClass();
		
		left.addActionListener(hander);
		right.addActionListener(hander);
		center.addActionListener(hander);
		
		
		
		
	}
	
	private class HandlerClass implements ActionListener {
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
			
			
		}

		
			
		}
		
		
		
	}
	
	
}

