package org.applet.hello;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import org.applet.textClasses.*;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class WelcomeApplet extends Applet implements ItemListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -268174780213122739L;
	Font myFont = new Font("TimesRoman", Font.BOLD, 18);
	JRadioButton visitorButton = new JRadioButton("visitor");
	JRadioButton fanButton = new JRadioButton("fan");
	JRadioButton friendButton = new JRadioButton("friend");
	JRadioButton nemesisButton = new JRadioButton("nemesis");
	
	
	//Group the radio buttons
	ButtonGroup group = new ButtonGroup();
	

	public void paint (Graphics g){
		
		g.setFont(myFont);
		Image img = Toolkit.getDefaultToolkit().getImage("hellUdo.gif");
		g.drawImage(img, 10, 150, 200, 200, null);
		g.drawString("Welcome! Who be ye?", 20, 380);
		group.add(visitorButton);
		group.add(fanButton);
		group.add(friendButton);
		group.add(nemesisButton);
		add(visitorButton);
		add(fanButton);
		add(friendButton);
		add(nemesisButton);
		
		
		
		

				
//		JRadioButton visitorButton = new JRadioButton("visitor");
		visitorButton.addItemListener(this);
		
//		JRadioButton fanButton = new JRadioButton("fan");
		fanButton.addItemListener(this);
		
//		JRadioButton friendButton = new JRadioButton("friend");
		friendButton.addItemListener(this);
		
//		JRadioButton nemesisButton = new JRadioButton("nemesis");
		nemesisButton.addItemListener(this);


	}
	
	public static void main(String[] args){
		WelcomeApplet app = new WelcomeApplet();
		app.setVisible(true);
	}
	


	public void itemStateChanged(ItemEvent e) {
		
		Panel p = new Panel();
		visitorText changeText = new visitorText();
		String text = changeText.visitorWelcomeString;
		Label label = new Label(text);
		
		if(visitorButton.isSelected() == true){
			
			//take me to the visitor dialogue
			p.add(label);
			
			
			
		}else if(fanButton.isSelected() == true){
			
			//take me to the fan dialogue
			p.add(label);
			
		}else if(friendButton.isSelected() == true){
			
			//take me to the friend dialogue
			p.add(label);
			
		}else if(nemesisButton.isSelected() == true){
			
			//take me to the nemesis dialogue
			p.add(label);
			
		}
		
	}
	

}
