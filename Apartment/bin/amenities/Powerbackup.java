package amenities;

import member.MembershipType;

public class Powerbackup  extends BaseAmenities
{
	
	private static final  MembershipType AMENITY_TYPE = MembershipType.DELUXE;
	private static final  String AMENITY_NAME = "Powerbackup";
	
	public Powerbackup()
	{
		this.amenityType = AMENITY_TYPE;
		this.amentityName = AMENITY_NAME;
	}

}
