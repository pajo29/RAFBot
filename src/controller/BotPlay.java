package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import model.ConfirmedSign;
import model.Signs;
import model.Status;
import model.WrongPlaceSign;
import view.GameView;

public class BotPlay
{
		private GameView gameView;
		private Controller controller;
		
		private ArrayList<Signs> possibleSigns = new ArrayList<>();
		
		private ArrayList<ConfirmedSign> confirmedSigns = new ArrayList<>();
		
		private ArrayList<WrongPlaceSign> wrongPlaceSigns = new ArrayList<>();
		
		ArrayList<Signs> noWrongPlaceSign = new ArrayList<>();
		
		private Signs firstSign;
		private Signs secondSign;
		private Signs thirdSign;
		private Signs fourthSign;
		
		private boolean firstSignConfirmed = false;
		private boolean secondSignConfirmed = false;
		private boolean thirdSignConfirmed = false;
		private boolean fourthSignConfirmed = false;
		
		
		public BotPlay()
		{
		possibleSigns.clear();
		confirmedSigns.clear();
		wrongPlaceSigns.clear();
		wrongPlaceSigns.clear();
		possibleSigns.add(Signs.AI);
		possibleSigns.add(Signs.CLOVER);
		possibleSigns.add(Signs.DIAMOND);
		possibleSigns.add(Signs.HEART);
		possibleSigns.add(Signs.SPADES);
		possibleSigns.add(Signs.VODKA);
		
		
		gameView = GameView.getInstance();
		controller = Controller.getInstance();
		
		for(int i = 0; i < 7; i++)
		{
			
			if(i > 0 && gameView.getCounter() ==1)
				return;
			
				randomise();
			
			for(int j = 0; j < confirmedSigns.size(); j++)
			{
				if(confirmedSigns.get(j).getPosition() == 0)
				{
					firstSign = confirmedSigns.get(j).getSign();
					firstSignConfirmed = true;
				}
				if(confirmedSigns.get(j).getPosition() == 1)
				{
					secondSign = confirmedSigns.get(j).getSign();
					secondSignConfirmed = true;
				}
				if(confirmedSigns.get(j).getPosition() == 2)
				{
					thirdSign = confirmedSigns.get(j).getSign();
					thirdSignConfirmed = true;
				}
				if(confirmedSigns.get(j).getPosition() == 3)
				{
					fourthSign = confirmedSigns.get(j).getSign();
					fourthSignConfirmed = true;
				}
			}
			
			for(int j = 0; j < wrongPlaceSigns.size(); j++)
			{
				if(!wrongPlaceSigns.get(j).triedPositionsContains(0) && !firstSignConfirmed)
				{
					firstSign = wrongPlaceSigns.get(j).getSign();
				}
				if(!wrongPlaceSigns.get(j).triedPositionsContains(1) && !secondSignConfirmed)
				{
					secondSign = wrongPlaceSigns.get(j).getSign();
				}
				if(!wrongPlaceSigns.get(j).triedPositionsContains(2) && !thirdSignConfirmed)
				{
					thirdSign = wrongPlaceSigns.get(j).getSign();
				}
				if(!wrongPlaceSigns.get(j).triedPositionsContains(3) && !fourthSignConfirmed)
				{
					fourthSign = wrongPlaceSigns.get(j).getSign();
				}
			}
			
			
			
			
			controller.play(firstSign);
			controller.play(secondSign);
			controller.play(thirdSign);
			controller.play(fourthSign);
			
			if(gameView.getRows().get(i).getFirstButtonResultStatus() == Status.RIGHT)
			{
				if(!confirmedSigns.contains(new ConfirmedSign(firstSign, 0)))
					confirmedSigns.add(new ConfirmedSign(firstSign, 0));
			}
			else
				if(gameView.getRows().get(i).getFirstButtonResultStatus() == Status.WRONG)
				{
					possibleSigns.remove(firstSign);
				}
				else
				{
					WrongPlaceSign wrplc = new WrongPlaceSign(firstSign, 0);
					if(!wrongPlaceSigns.contains(wrplc))
						wrongPlaceSigns.add(wrplc);
					else
					{
						for(WrongPlaceSign wr: wrongPlaceSigns)
						{
							if(wr.getSign() == wrplc.getSign())
								wr.addTriedPosition(0);
						}
					}
				}
			
			//////
			if(gameView.getRows().get(i).getSecondButtonResultStatus() == Status.RIGHT)
			{
				if(!confirmedSigns.contains(new ConfirmedSign(secondSign, 1)))
					confirmedSigns.add(new ConfirmedSign(secondSign, 1));
			}
			else
				if(gameView.getRows().get(i).getSecondButtonResultStatus() == Status.WRONG)
				{
					possibleSigns.remove(secondSign);
				}
				else
				{
					WrongPlaceSign wrplc = new WrongPlaceSign(secondSign, 1);
					if(!wrongPlaceSigns.contains(wrplc))
						wrongPlaceSigns.add(wrplc);
					else
					{
						for(WrongPlaceSign wr: wrongPlaceSigns)
						{
							if(wr.getSign() == wrplc.getSign())
								wr.addTriedPosition(1);
						}
					}
				}
			
			//////
			if(gameView.getRows().get(i).getThirdButtonResultStatus() == Status.RIGHT)
			{
				if(!confirmedSigns.contains(new ConfirmedSign(thirdSign, 2)))
					confirmedSigns.add(new ConfirmedSign(thirdSign, 2));
			}
			else
				if(gameView.getRows().get(i).getThirdButtonResultStatus() == Status.WRONG)
				{
					possibleSigns.remove(thirdSign);
				}
				else
				{
					WrongPlaceSign wrplc = new WrongPlaceSign(thirdSign, 2);
					if(!wrongPlaceSigns.contains(wrplc))
						wrongPlaceSigns.add(wrplc);
					else
					{
						for(WrongPlaceSign wr: wrongPlaceSigns)
						{
							if(wr.getSign() == wrplc.getSign())
								wr.addTriedPosition(2);
						}
					}
				}
			
			//////
			if(gameView.getRows().get(i).getFourthButtonResultStatus() == Status.RIGHT)
			{
				if(!confirmedSigns.contains(new ConfirmedSign(fourthSign, 3)))
					confirmedSigns.add(new ConfirmedSign(fourthSign, 3));
			}
			else
				if(gameView.getRows().get(i).getFourthButtonResultStatus() == Status.WRONG)
				{
					possibleSigns.remove(fourthSign);
				}
				else
				{
					WrongPlaceSign wrplc = new WrongPlaceSign(fourthSign, 3);
					if(!wrongPlaceSigns.contains(new WrongPlaceSign(fourthSign, 3)))
						wrongPlaceSigns.add(new WrongPlaceSign(fourthSign, 3));
					else
					{
						for(WrongPlaceSign wr: wrongPlaceSigns)
						{
							if(wr.getSign() == wrplc.getSign())
								wr.addTriedPosition(3);
						}
					}
				}
			
			System.out.println("-------------");
			System.out.println(possibleSigns);
			System.out.println(confirmedSigns);
			System.out.println(wrongPlaceSigns);
			System.out.println("-------------");
			
			
				
			try
			{
				Thread.sleep(10);
			} catch (InterruptedException e1)
			{
				e1.printStackTrace();
			}

		}
	}
		
		
	
	private void randomise()
	{
		Random r = new Random();

		firstSign = possibleSigns.get(r.nextInt(possibleSigns.size()));
		secondSign = possibleSigns.get(r.nextInt(possibleSigns.size()));
		thirdSign = possibleSigns.get(r.nextInt(possibleSigns.size()));
		fourthSign = possibleSigns.get(r.nextInt(possibleSigns.size()));
	}
	
}
