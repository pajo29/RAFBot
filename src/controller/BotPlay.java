package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import model.ConfirmedSign;
import model.Signs;
import model.Status;
import view.GameView;

public class BotPlay
{
		private GameView gameView;
		private Controller controller;
		
		private ArrayList<Signs> possibleSigns = new ArrayList<>();
		
		private ArrayList<ConfirmedSign> confirmedSigns = new ArrayList<>();
		
		private Signs firstSign;
		private Signs secondSign;
		private Signs thirdSign;
		private Signs fourthSign;
		
		public BotPlay()
		{
		possibleSigns.clear();
		confirmedSigns.clear();
		possibleSigns.add(Signs.AI);
		possibleSigns.add(Signs.CLOVER);
		possibleSigns.add(Signs.DIAMOND);
		possibleSigns.add(Signs.HEART);
		possibleSigns.add(Signs.SPADES);
		possibleSigns.add(Signs.VODKA);
		
//		System.out.println(possibleSigns);
		
		gameView = GameView.getInstance();
		controller = Controller.getInstance();
		
		for(int i = 0; i < 7; i++)
		{
			randomise();
			for(int j = 0; j < confirmedSigns.size(); j++)
			{
				if(confirmedSigns.get(j).getPosition() == 0)
					firstSign = confirmedSigns.get(j).getSign();
				if(confirmedSigns.get(j).getPosition() == 1)
					secondSign = confirmedSigns.get(j).getSign();
				if(confirmedSigns.get(j).getPosition() == 2)
					thirdSign = confirmedSigns.get(j).getSign();
				if(confirmedSigns.get(j).getPosition() == 3)
					fourthSign = confirmedSigns.get(j).getSign();
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
			
			System.out.println("-------------");
			System.out.println(possibleSigns);
			System.out.println(confirmedSigns);
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
