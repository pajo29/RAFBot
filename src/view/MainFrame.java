package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame
{
	
	private static MainFrame instance = null;
	
	private GameView gameView;
	
	private MainFrame()
	{
		gameView = GameView.getInstance();
		
		add(gameView, BorderLayout.WEST);
		
		gameView.addingPlayButtons();
		
		
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(screenSize.width/2, screenSize.height/2+200);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("MasterMind");
		
	}
	
	public static MainFrame getInstance()
	{
		if(instance == null)
		{
			instance = new MainFrame();
		}
		return instance;
	}

}
