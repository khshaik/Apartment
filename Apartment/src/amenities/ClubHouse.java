package amenities;

import member.MembershipType;

public class ClubHouse  extends BaseAmenities
{
	private static final  MembershipType AMENITY_TYPE = MembershipType.ELITE;
	private static final  String AMENITY_NAME = "Club";
	
	public ClubHouse()
	{
		this.amenityType = AMENITY_TYPE;
		this.amentityName = AMENITY_NAME;
	}
	
	

}
