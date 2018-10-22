package view;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Controller;
import model.Signs;

public class Row extends JPanel
{
	private JButton firstButton;
	private Signs firstButtonStatus;
	private JButton secondButton;
	private Signs secondButtonStatus;
	private JButton thirdButton;
	private Signs thirdButtonStatus;
	private JButton fourthButton;
	private Signs fourthButtonStatus;
	
	private JButton separator;
	
	private JButton firstButtonResult;
	private JButton secondButtonResult;
	private JButton thirdButtonResult;
	private JButton fourthButtonResult;
	
	private int counter = 1;
	
	public Row()
	{
		firstButton = new JButton();
		secondButton = new JButton();
		thirdButton = new JButton();
		fourthButton = new JButton();
		
		separator = new JButton("||");
		
		firstButtonResult = new JButton();
		secondButtonResult = new JButton();
		thirdButtonResult = new JButton();
		fourthButtonResult = new JButton();
		
		add(firstButton);
		add(secondButton);
		add(thirdButton);
		add(fourthButton);
		
		add(separator);
		
		add(firstButtonResult);
		add(secondButtonResult);
		add(thirdButtonResult);
		add(fourthButtonResult);
	}
	
	public void increaseCounter()
	{
		counter++;
		if(counter == 5)
		{
			GameView.getInstance().increaseCounter();
			Controller.getInstance().checkResult(this);
		}
	}

	public void setSeparator(JButton separator)
	{
		this.separator = separator;
	}

	public void setFirstButtonResult(JButton firstButtonResult)
	{
		this.firstButtonResult = firstButtonResult;
	}

	public void setSecondButtonResult(JButton secondButtonResult)
	{
		this.secondButtonResult = secondButtonResult;
	}

	public void setThirdButtonResult(JButton thirdButtonResult)
	{
		this.thirdButtonResult = thirdButtonResult;
	}

	public void setFourthButtonResult(JButton fourthButtonResult)
	{
		this.fourthButtonResult = fourthButtonResult;
	}

	public void setCounter(int counter)
	{
		this.counter = counter;
	}

	public JButton getSeparator()
	{
		return separator;
	}

	public JButton getFirstButtonResult()
	{
		return firstButtonResult;
	}

	public JButton getSecondButtonResult()
	{
		return secondButtonResult;
	}

	public JButton getThirdButtonResult()
	{
		return thirdButtonResult;
	}

	public JButton getFourthButtonResult()
	{
		return fourthButtonResult;
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

	public Signs getFirstButtonStatus() {
		return firstButtonStatus;
	}

	public void setFirstButtonStatus(Signs firstButtonStatus) {
		this.firstButtonStatus = firstButtonStatus;
	}

	public Signs getSecondButtonStatus() {
		return secondButtonStatus;
	}

	public void setSecondButtonStatus(Signs secondButtonStatus) {
		this.secondButtonStatus = secondButtonStatus;
	}

	public Signs getThirdButtonStatus() {
		return thirdButtonStatus;
	}

	public void setThirdButtonStatus(Signs thirdButtonStatus) {
		this.thirdButtonStatus = thirdButtonStatus;
	}

	public Signs getFourthButtonStatus() {
		return fourthButtonStatus;
	}

	public void setFourthButtonStatus(Signs fourthButtonStatus) {
		this.fourthButtonStatus = fourthButtonStatus;
	}

	public int getCounter() {
		return counter;
	}

	public void setFirstButton(JButton firstButton) {
		this.firstButton = firstButton;
	}

	public void setSecondButton(JButton secondButton) {
		this.secondButton = secondButton;
	}

	public void setThirdButton(JButton thirdButton) {
		this.thirdButton = thirdButton;
	}

	public void setFourthButton(JButton fourthButton) {
		this.fourthButton = fourthButton;
	}
	
	
}
