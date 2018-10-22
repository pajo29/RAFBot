package model;

public class ConfirmedSign
{
	
	private Signs sign;
	private int position;
	
	public ConfirmedSign(Signs sign, int position)
	{
		this.sign = sign;
		this.position = position;
	}

	public Signs getSign()
	{
		return sign;
	}

	public void setSign(Signs sign)
	{
		this.sign = sign;
	}

	public int getPosition()
	{
		return position;
	}

	public void setPosition(int position)
	{
		this.position = position;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof ConfirmedSign)
		{
			ConfirmedSign conf = (ConfirmedSign)obj;
			return conf.getPosition() == this.getPosition();
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		return "Znak: "+sign+" na poziciji: "+position;
	}

}
