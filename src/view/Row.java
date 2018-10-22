package view;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Row extends JPanel
{
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton;
	private JButton fourthButton;
	
	public Row()
	{
		firstButton = new JButton();
		secondButton = new JButton();
		thirdButton = new JButton();
		fourthButton = new JButton();
		
		add(firstButton);
		add(secondButton);
		add(thirdButton);
		add(fourthButton);
	}

	public JButton getFirstButton()
	{
		return firstButton;
	}

	public JButton getSecondButton()
	{
		return secondButton;
	}

	public JButton getThirdButton()
	{
		return thirdButton;
	}

	public JButton getFourthButton()
	{
		return fourthButton;
	}
	
	
	
}
