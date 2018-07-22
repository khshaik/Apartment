package amenities;

import member.MembershipType;

// Interfrace for applicable Aminities/ Services
public interface IAmenities 
{
	// returns the price for the amenity
	public double getPrice();
	
	//  Returns Amenity Name
	public String getAmenityName();
	
	
	//Returns Amenity type applicable based on membership Type
	public MembershipType getAmenityType();	
	
	// Reads the price data from the configiuration file
	void doReadPrice();
}
