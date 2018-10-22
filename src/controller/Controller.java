package controller;

import javax.swing.ImageIcon;

import model.Signs;
import view.GameView;
import view.Row;

public class Controller {
	
	private static Controller instance = null;
	
	private GameView gameView;
	
	private Controller() 
	{
		gameView = GameView.getInstance();
	}
	
	public static Controller getInstance()
	{
		if(instance == null)
			instance = new Controller();
		return instance;
	}
	
	public void checkResult(Row row)
	{
		if(row.getFirstButtonStatus() == gameView.getFirstSign())
			if(row.getSecondButtonStatus() == gameView.getSecondSign())
				if(row.getThirdButtonStatus() == gameView.getThirdSign())
					if(row.getFourthButtonStatus() == gameView.getFourthSign())
					{
						System.out.println("Uspeh!");
					}
		
		if(row.getFirstButtonStatus() == gameView.getSigns().get(0))
		{
			row.getFirstButtonResult().setIcon(new ImageIcon("src/images/likeGreen.png"));
		}
		else if(gameView.getSigns().contains(row.getFirstButtonStatus()))
		{
			row.getFirstButtonResult().setIcon(new ImageIcon("src/images/likeYellow.png"));
		}
		else
		{
			row.getFirstButtonResult().setIcon(new ImageIcon("src/images/wrong.png"));
		}
		
		if(row.getSecondButtonStatus() == gameView.getSigns().get(1))
		{
			row.getSecondButtonResult().setIcon(new ImageIcon("src/images/likeGreen.png"));
		}
		else if(gameView.getSigns().contains(row.getSecondButtonStatus()))
		{
			row.getSecondButtonResult().setIcon(new ImageIcon("src/images/likeYellow.png"));
		}
		else
		{
			row.getSecondButtonResult().setIcon(new ImageIcon("src/images/wrong.png"));
		}
		
		if(row.getThirdButtonStatus() == gameView.getSigns().get(2))
		{
			row.getThirdButtonResult().setIcon(new ImageIcon("src/images/likeGreen.png"));
		}
		else if(gameView.getSigns().contains(row.getThirdButtonStatus()))
		{
			row.getThirdButtonResult().setIcon(new ImageIcon("src/images/likeYellow.png"));
		}
		else
		{
			row.getThirdButtonResult().setIcon(new ImageIcon("src/images/wrong.png"));
		}
		
		if(row.getFourthButtonStatus() == gameView.getSigns().get(3))
		{
			row.getFourthButtonResult().setIcon(new ImageIcon("src/images/likeGreen.png"));
		}
		else if(gameView.getSigns().contains(row.getFourthButtonStatus()))
		{
			row.getFourthButtonResult().setIcon(new ImageIcon("src/images/likeYellow.png"));
		}
		else
		{
			row.getFourthButtonResult().setIcon(new ImageIcon("src/images/wrong.png"));
		}
		
			
	}
	
	//Do not open this method, it's a scary switch :o
	public void play(Signs sign)
	{
		if(sign == Signs.CLOVER)
		{
			switch(gameView.getCounter())
			{
			case 1:
				switch(gameView.getRows().get(0).getCounter())
				{
				case 1:
					gameView.getRows().get(0).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(0).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(0).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(0).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 2:
				switch(gameView.getRows().get(1).getCounter())
				{
				case 1:
					gameView.getRows().get(1).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(1).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(1).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(1).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 3:
				switch(gameView.getRows().get(2).getCounter())
				{
				case 1:
					gameView.getRows().get(2).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(2).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(2).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(2).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 4:
				switch(gameView.getRows().get(3).getCounter())
				{
				case 1:
					gameView.getRows().get(3).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(3).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(3).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(3).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 5:
				switch(gameView.getRows().get(4).getCounter())
				{
				case 1:
					gameView.getRows().get(4).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(4).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(4).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(4).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 6:
				switch(gameView.getRows().get(5).getCounter())
				{
				case 1:
					gameView.getRows().get(5).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(5).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(5).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(5).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 7:
				switch(gameView.getRows().get(6).getCounter())
				{
				case 1:
					gameView.getRows().get(6).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(6).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(6).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(6).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setFourthButtonStatus(sign);
					break;
				}
				break;
			}
		}
		if(sign == Signs.DIAMOND)
		{
			switch(gameView.getCounter())
			{
			case 1:
				switch(gameView.getRows().get(0).getCounter())
				{
				case 1:
					gameView.getRows().get(0).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(0).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(0).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(0).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 2:
				switch(gameView.getRows().get(1).getCounter())
				{
				case 1:
					gameView.getRows().get(1).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(1).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(1).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(1).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 3:
				switch(gameView.getRows().get(2).getCounter())
				{
				case 1:
					gameView.getRows().get(2).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(2).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(2).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(2).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 4:
				switch(gameView.getRows().get(3).getCounter())
				{
				case 1:
					gameView.getRows().get(3).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(3).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(3).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(3).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 5:
				switch(gameView.getRows().get(4).getCounter())
				{
				case 1:
					gameView.getRows().get(4).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(4).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(4).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(4).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 6:
				switch(gameView.getRows().get(5).getCounter())
				{
				case 1:
					gameView.getRows().get(5).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(5).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(5).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(5).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 7:
				switch(gameView.getRows().get(6).getCounter())
				{
				case 1:
					gameView.getRows().get(6).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(6).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(6).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(6).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setFourthButtonStatus(sign);
					break;
				}
				break;
			}
		}
		if(sign == Signs.HEART)
		{
			switch(gameView.getCounter())
			{
			case 1:
				switch(gameView.getRows().get(0).getCounter())
				{
				case 1:
					gameView.getRows().get(0).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(0).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(0).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(0).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 2:
				switch(gameView.getRows().get(1).getCounter())
				{
				case 1:
					gameView.getRows().get(1).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(1).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(1).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(1).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 3:
				switch(gameView.getRows().get(2).getCounter())
				{
				case 1:
					gameView.getRows().get(2).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(2).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(2).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(2).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 4:
				switch(gameView.getRows().get(3).getCounter())
				{
				case 1:
					gameView.getRows().get(3).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(3).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(3).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(3).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 5:
				switch(gameView.getRows().get(4).getCounter())
				{
				case 1:
					gameView.getRows().get(4).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(4).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(4).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(4).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 6:
				switch(gameView.getRows().get(5).getCounter())
				{
				case 1:
					gameView.getRows().get(5).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(5).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(5).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(5).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 7:
				switch(gameView.getRows().get(6).getCounter())
				{
				case 1:
					gameView.getRows().get(6).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(6).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(6).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(6).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setFourthButtonStatus(sign);
					break;
				}
				break;
			}
		}
		if(sign == Signs.SPADES)
		{
			switch(gameView.getCounter())
			{
			case 1:
				switch(gameView.getRows().get(0).getCounter())
				{
				case 1:
					gameView.getRows().get(0).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(0).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(0).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(0).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 2:
				switch(gameView.getRows().get(1).getCounter())
				{
				case 1:
					gameView.getRows().get(1).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(1).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(1).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(1).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 3:
				switch(gameView.getRows().get(2).getCounter())
				{
				case 1:
					gameView.getRows().get(2).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(2).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(2).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(2).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 4:
				switch(gameView.getRows().get(3).getCounter())
				{
				case 1:
					gameView.getRows().get(3).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(3).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(3).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(3).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 5:
				switch(gameView.getRows().get(4).getCounter())
				{
				case 1:
					gameView.getRows().get(4).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(4).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(4).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(4).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 6:
				switch(gameView.getRows().get(5).getCounter())
				{
				case 1:
					gameView.getRows().get(5).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(5).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(5).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(5).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 7:
				switch(gameView.getRows().get(6).getCounter())
				{
				case 1:
					gameView.getRows().get(6).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(6).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(6).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(6).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setFourthButtonStatus(sign);
					break;
				}
				break;
			}
		}
		if(sign == Signs.AI)
		{
			switch(gameView.getCounter())
			{
			case 1:
				switch(gameView.getRows().get(0).getCounter())
				{
				case 1:
					gameView.getRows().get(0).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(0).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(0).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(0).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 2:
				switch(gameView.getRows().get(1).getCounter())
				{
				case 1:
					gameView.getRows().get(1).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(1).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(1).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(1).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 3:
				switch(gameView.getRows().get(2).getCounter())
				{
				case 1:
					gameView.getRows().get(2).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(2).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(2).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(2).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 4:
				switch(gameView.getRows().get(3).getCounter())
				{
				case 1:
					gameView.getRows().get(3).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(3).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(3).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(3).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 5:
				switch(gameView.getRows().get(4).getCounter())
				{
				case 1:
					gameView.getRows().get(4).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(4).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(4).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(4).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 6:
				switch(gameView.getRows().get(5).getCounter())
				{
				case 1:
					gameView.getRows().get(5).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(5).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(5).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(5).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 7:
				switch(gameView.getRows().get(6).getCounter())
				{
				case 1:
					gameView.getRows().get(6).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(6).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(6).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(6).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setFourthButtonStatus(sign);
					break;
				}
				break;
			}
		}
		if(sign == Signs.VODKA)
		{
			switch(gameView.getCounter())
			{
			case 1:
				switch(gameView.getRows().get(0).getCounter())
				{
				case 1:
					gameView.getRows().get(0).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(0).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(0).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(0).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(0).increaseCounter();
					gameView.getRows().get(0).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 2:
				switch(gameView.getRows().get(1).getCounter())
				{
				case 1:
					gameView.getRows().get(1).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(1).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(1).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(1).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(1).increaseCounter();
					gameView.getRows().get(1).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 3:
				switch(gameView.getRows().get(2).getCounter())
				{
				case 1:
					gameView.getRows().get(2).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(2).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(2).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(2).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(2).increaseCounter();
					gameView.getRows().get(2).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 4:
				switch(gameView.getRows().get(3).getCounter())
				{
				case 1:
					gameView.getRows().get(3).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(3).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(3).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(3).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(3).increaseCounter();
					gameView.getRows().get(3).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 5:
				switch(gameView.getRows().get(4).getCounter())
				{
				case 1:
					gameView.getRows().get(4).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(4).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(4).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(4).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(4).increaseCounter();
					gameView.getRows().get(4).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 6:
				switch(gameView.getRows().get(5).getCounter())
				{
				case 1:
					gameView.getRows().get(5).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(5).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(5).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(5).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(5).increaseCounter();
					gameView.getRows().get(5).setFourthButtonStatus(sign);
					break;
				}
				break;
			case 7:
				switch(gameView.getRows().get(6).getCounter())
				{
				case 1:
					gameView.getRows().get(6).getFirstButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setFirstButtonStatus(sign);
					break;
				case 2:
					gameView.getRows().get(6).getSecondButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setSecondButtonStatus(sign);
					break;
				case 3:
					gameView.getRows().get(6).getThirdButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setThirdButtonStatus(sign);
					break;
				case 4:
					gameView.getRows().get(6).getFourthButton().setIcon(new ImageIcon("src/images/"+sign.toString().toLowerCase()+".png"));
					gameView.getRows().get(6).increaseCounter();
					gameView.getRows().get(6).setFourthButtonStatus(sign);
					break;
				}
				break;
			}
	}

	}
	}