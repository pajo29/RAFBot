package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.BotPlay;
import model.Signs;

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
	
	private Signs firstSign;
	private Signs secondSign;
	private Signs thirdSign;
	private Signs fourthSign;
	
	private int counter = 1;
	
	private PlayButtons playButtons;
	
	private ArrayList<Row> rows = new ArrayList<>();
	private ArrayList<Signs> signs = new ArrayList<>();
	
	private JButton botPlay;
	
	private BotPlay botPlayer;
	
	private GameView()
	{
		firstRow = new Row();
		secondRow = new Row();
		thirdRow = new Row();
		fourthRow = new Row();
		fifthRow = new Row();
		sixthRow = new Row();
		seventhRow = new Row();
		
		add(firstRow);
		add(secondRow);
		add(thirdRow);
		add(fourthRow);
		add(fifthRow);
		add(sixthRow);
		add(seventhRow);
		
		rows.add(firstRow);
		rows.add(secondRow);
		rows.add(thirdRow);
		rows.add(fourthRow);
		rows.add(fifthRow);
		rows.add(sixthRow);
		rows.add(seventhRow);
		
		botPlay = new JButton("Let me play!");
		botPlay.setIcon(new ImageIcon("src/images/robot.png"));
		botPlay.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				botPlayer = new BotPlay();
			}
		});
		
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		randomiseSigns();
		signs.add(firstSign);
		signs.add(secondSign);
		signs.add(thirdSign);
		signs.add(fourthSign);
	}
	
	public void restart()
	{
		counter = 1;
		for(int i = 0; i < 7; i++)
		{
			rows.get(i).setCounter(1);
			rows.get(i).getFirstButton().setIcon(new ImageIcon(""));
			rows.get(i).getSecondButton().setIcon(new ImageIcon(""));
			rows.get(i).getThirdButton().setIcon(new ImageIcon(""));
			rows.get(i).getFourthButton().setIcon(new ImageIcon(""));
			rows.get(i).getFirstButtonResult().setIcon(new ImageIcon(""));
			rows.get(i).getSecondButtonResult().setIcon(new ImageIcon(""));
			rows.get(i).getThirdButtonResult().setIcon(new ImageIcon(""));
			rows.get(i).getFourthButtonResult().setIcon(new ImageIcon(""));
			rows.get(i).setFirstButtonStatus(null);
			rows.get(i).setSecondButtonStatus(null);
			rows.get(i).setThirdButtonStatus(null);
			rows.get(i).setFourthButtonStatus(null);
			rows.get(i).setFirstButtonResultStatus(null);
			rows.get(i).setSecondButtonResultStatus(null);
			rows.get(i).setThirdButtonResultStatus(null);
			rows.get(i).setFourthButtonResultStatus(null);
		}
		randomiseSigns();
		signs.clear();
		signs.add(firstSign);
		signs.add(secondSign);
		signs.add(thirdSign);
		signs.add(fourthSign);
		botPlayer = null;
	}
	
	private void randomiseSigns()
	{
		Random rand = new Random();
		int first = rand.nextInt(6);
		int second = rand.nextInt(6);
		int third = rand.nextInt(6);
		int fourth = rand.nextInt(6);
		
		firstSign = Signs.values()[first];
		secondSign = Signs.values()[second];
		thirdSign = Signs.values()[third];
		fourthSign = Signs.values()[fourth];
		
		System.out.println("====================");
		System.out.println(firstSign);
		System.out.println(secondSign);
		System.out.println(thirdSign);
		System.out.println(fourthSign);
	}
	
	
	
	public ArrayList<Signs> getSigns()
	{
		return signs;
	}

	public Signs getFirstSign()
	{
		return firstSign;
	}

	public Signs getSecondSign()
	{
		return secondSign;
	}

	public Signs getThirdSign()
	{
		return thirdSign;
	}

	public Signs getFourthSign()
	{
		return fourthSign;
	}

	public static GameView getInstance()
	{
		if(instance == null)
			instance = new GameView();
		return instance;
	}
	
	public void addingPlayButtons()
	{
		playButtons = PlayButtons.getInstance();
		
		add(playButtons);
		
		add(botPlay);	
	}


	public ArrayList<Row> getRows()
	{
		return rows;
	}


	public void setRows(ArrayList<Row> rows)
	{
		this.rows = rows;
	}


	public void increaseCounter()
	{
		counter++;
	}
	
	public int getCounter() {
		return counter;
	}


	public void setCounter(int counter) {
		this.counter = counter;
	}


	public static void setInstance(GameView instance) {
		GameView.instance = instance;
	}


	public void setFirstRow(Row firstRow) {
		this.firstRow = firstRow;
	}


	public void setSecondRow(Row secondRow) {
		this.secondRow = secondRow;
	}


	public void setThirdRow(Row thirdRow) {
		this.thirdRow = thirdRow;
	}


	public void setFourthRow(Row fourthRow) {
		this.fourthRow = fourthRow;
	}


	public void setFifthRow(Row fifthRow) {
		this.fifthRow = fifthRow;
	}


	public void setSixthRow(Row sixthRow) {
		this.sixthRow = sixthRow;
	}


	public void setSeventhRow(Row seventhRow) {
		this.seventhRow = seventhRow;
	}


	public void setPlayButtons(PlayButtons playButtons) {
		this.playButtons = playButtons;
	}


	public Row getFirstRow() {
		return firstRow;
	}


	public Row getSecondRow() {
		return secondRow;
	}


	public Row getThirdRow() {
		return thirdRow;
	}


	public Row getFourthRow() {
		return fourthRow;
	}


	public Row getFifthRow() {
		return fifthRow;
	}


	public Row getSixthRow() {
		return sixthRow;
	}


	public Row getSeventhRow() {
		return seventhRow;
	}


	public PlayButtons getPlayButtons() {
		return playButtons;
	}
	
	
	
	

}
