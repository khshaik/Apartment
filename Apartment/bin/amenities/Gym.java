package amenities;

import member.MembershipType;

public class Gym extends BaseAmenities
{

	private static final  MembershipType AMENITY_TYPE = MembershipType.ELITE;
	private static final  String AMENITY_NAME = "Gym";
	
	public Gym()
	{		
		this.amenityType = AMENITY_TYPE;
		this.amentityName = AMENITY_NAME;		
	}
	
}
