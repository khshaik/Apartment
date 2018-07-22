package amenities;

import member.MembershipType;

public class SwimmingPool extends BaseAmenities
{
	private static final  MembershipType AMENITY_TYPE = MembershipType.ELITE;
	private static final  String AMENITY_NAME = "Swimmingpool";
	
	// set the attributes
	public SwimmingPool()
	{
		this.amenityType = AMENITY_TYPE;
		this.amentityName = AMENITY_NAME;
	}
}
