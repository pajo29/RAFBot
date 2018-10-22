package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PlayButtons extends JPanel
{
	
	private static PlayButtons instance = null;
	
	private JButton cloverSign;
	private JButton diamondSign;
	private JButton heartSign;
	private JButton spadesSign;
	private JButton aiSign;
	private JButton vodkaSign;
	
	private PlayButtons()
	{
		cloverSign = new JButton();
		cloverSign.setIcon(new ImageIcon("src/images/clover.png"));
		diamondSign = new JButton();
		diamondSign.setIcon(new ImageIcon("src/images/diamond.png"));
		heartSign = new JButton();
		heartSign.setIcon(new ImageIcon("src/images/heart.png"));
		spadesSign = new JButton();
		spadesSign.setIcon(new ImageIcon("src/images/spades.png"));
		aiSign = new JButton();
		aiSign.setIcon(new ImageIcon("src/images/ai.png"));
		vodkaSign = new JButton();
		vodkaSign.setIcon(new ImageIcon("src/images/vodka.png"));
		
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
