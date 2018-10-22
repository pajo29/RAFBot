package view;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GameView extends JPanel
{
	
	private static GameView instance = null;
	
	private Row firstRow;
	private Row secondRow;
	private Row thirdRow;
	private Row fourthRow;
	private Row fifthRow;
	private Row sixthRow;
	private Row seventhRow;
	
	private PlayButtons playButtons;
	
	private GameView()
	{
		firstRow = new Row();
		secondRow = new Row();
		thirdRow = new Row();
		fourthRow = new Row();
		fifthRow = new Row();
		sixthRow = new Row();
		seventhRow = new Row();
		
		playButtons = PlayButtons.getInstance();
		
		add(firstRow);
		add(secondRow);
		add(thirdRow);
		add(fourthRow);
		add(fifthRow);
		add(sixthRow);
		add(seventhRow);
		
		add(playButtons);
		
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	}
	
	
	public static GameView getInstance()
	{
		if(instance == null)
			instance = new GameView();
		return instance;
	}

}
