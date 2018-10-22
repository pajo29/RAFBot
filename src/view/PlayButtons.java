package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Controller;
import model.Signs;

public class PlayButtons extends JPanel
{
	
	private static PlayButtons instance = null;
	
	private JButton cloverSign;
	private JButton diamondSign;
	private JButton heartSign;
	private JButton spadesSign;
	private JButton aiSign;
	private JButton vodkaSign;
	
	private Controller controller;
	
	private PlayButtons()
	{
		controller = Controller.getInstance();
		
		cloverSign = new JButton();
		cloverSign.setIcon(new ImageIcon("src/images/clover.png"));
		cloverSign.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				controller.play(Signs.CLOVER);
			}
		});
		
		diamondSign = new JButton();
		diamondSign.setIcon(new ImageIcon("src/images/diamond.png"));
		diamondSign.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				controller.play(Signs.DIAMOND);
			}
		});
		
		
		heartSign = new JButton();
		heartSign.setIcon(new ImageIcon("src/images/heart.png"));
		heartSign.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				controller.play(Signs.HEART);
			}
		});
		
		
		spadesSign = new JButton();
		spadesSign.setIcon(new ImageIcon("src/images/spades.png"));
		spadesSign.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				controller.play(Signs.SPADES);
			}
		});
		
		
		aiSign = new JButton();
		aiSign.setIcon(new ImageIcon("src/images/ai.png"));
		aiSign.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				controller.play(Signs.AI);
			}
		});
		
		
		vodkaSign = new JButton();
		vodkaSign.setIcon(new ImageIcon("src/images/vodka.png"));
		vodkaSign.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				controller.play(Signs.VODKA);
			}
		});
		
		
		
		add(cloverSign);
		add(diamondSign);
		add(heartSign);
		add(spadesSign);
		add(aiSign);
		add(vodkaSign);
	}
	
	public static PlayButtons getInstance()
	{
		if(instance == null)
		{
			instance = new PlayButtons();
		}
		return instance;
	}

}
