package membership;

import java.util.ArrayList;

import amenities.IAmenities;

// Super class implementing the interface
public abstract class BaseMembership implements IMembershipType 
{
	protected ArrayList<IAmenities> applicableAmenities = new ArrayList<>();
	
	public BaseMembership()
	{
		setApplicableAmenities();
	}
	public ArrayList<IAmenities> getApplicableAmentities()
	{
		return this.applicableAmenities;
	}
		
	// Appends Amenities based on Membershiptype
	protected abstract void setApplicableAmenities();
}
