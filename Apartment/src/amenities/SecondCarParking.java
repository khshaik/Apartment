package amenities;

import member.MembershipType;

public class SecondCarParking  extends BaseAmenities
{
	
	private static final  MembershipType AMENITY_TYPE = MembershipType.ELITE;
	private static final  String AMENITY_NAME = "Secondcarparking";
	
	public SecondCarParking()
	{
		this.amenityType = AMENITY_TYPE;
		this.amentityName = AMENITY_NAME;
	}
}
