package amenities;

import member.MembershipType;

public class Maintenance  extends BaseAmenities
{
	private static final  MembershipType AMENITY_TYPE = MembershipType.BASIC;
	private static final  String AMENITY_NAME = "Gym";

	public  Maintenance()
	{
		this.amenityType = AMENITY_TYPE;
		this.amentityName = AMENITY_NAME;
	}
}
