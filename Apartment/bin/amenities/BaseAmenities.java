package amenities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import member.MembershipType;

// super class for Amenities
public abstract class BaseAmenities implements IAmenities
{
	// Member variables
	protected double price;
	protected String amentityName = "NotSpecified";
	protected MembershipType amenityType = MembershipType.BASIC;
	
	
	public double getPrice()
	{
		return this.price;
	}
	
	public String getAmenityName()
	{
		return this.amentityName;
	}	
	
	public MembershipType getAmenityType()
	{
		return this.amenityType;
	}	
	
	@Override
	public void doReadPrice()
	{
		Properties prop = new Properties();
		InputStream input = null;

		try 
		{
			input = new FileInputStream("config.properties");
			// reads property value
			prop.load(input);
			String value = prop.getProperty(amentityName);
			price = Integer.valueOf(value);
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
			price = 0;
		} 
		finally 
		{
			try
			{
				if(input != null)
				{
					input.close();
				}
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}		
	}
	

	
}
