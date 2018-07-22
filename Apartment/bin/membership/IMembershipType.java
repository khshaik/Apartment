package membership;

import java.util.ArrayList;

import amenities.IAmenities;

// interface for different membership types (basic/ Delux/ Elite etc
public interface IMembershipType 
{
	// returns list of Amenities for the membershipType
	public ArrayList<IAmenities> getApplicableAmentities();

}
