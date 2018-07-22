package amenities;

import member.MembershipType;

public class Security  extends BaseAmenities
{
	private static final  MembershipType AMENITY_TYPE = MembershipType.BASIC;
	private static final  String AMENITY_NAME = "Security";
	
	public Security()
	{
		this.amenityType = AMENITY_TYPE;
		this.amentityName = AMENITY_NAME;
	}
}
