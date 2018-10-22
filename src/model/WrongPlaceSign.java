package model;

import java.util.ArrayList;

public class WrongPlaceSign
{
	private Signs sign;
	private ArrayList<Integer> triedPositions = new ArrayList<>();
	
	public WrongPlaceSign(Signs sign, int position)
	{
		this.sign = sign;
		addTriedPosition(position);
	}
	
	public void addTriedPosition(int position)
	{
		if(!triedPositions.contains(position))
			triedPositions.add(position);
	}
	
	public boolean triedPositionsContains(int position)
	{
		for(Integer tp: triedPositions)
		{
			if(tp == position)
				return true;
		}
		return false;
	}

	public ArrayList<Integer> getTriedPositions()
	{
		return triedPositions;
	}

	public Signs getSign()
	{
		return sign;
	}

	public void setSign(Signs sign)
	{
		this.sign = sign;
	}

	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof WrongPlaceSign)
		{
			WrongPlaceSign wrconf = (WrongPlaceSign)obj;
			return wrconf.getSign() == this.getSign();
		}
		return false;
	}
	
	
	@Override
	public String toString()
	{
		return "Znak: "+sign+" na poziciji: "+triedPositions;
	}
}
