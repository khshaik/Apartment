package amenities;

import member.MembershipType;

public class TwoWheelParking  extends BaseAmenities
{
	private static final  MembershipType AMENITY_TYPE = MembershipType.DELUXE;
	private static final  String AMENITY_NAME = "Twowheelerparking";
	
	public TwoWheelParking()
	{
		this.amenityType = AMENITY_TYPE;
		this.amentityName = AMENITY_NAME;
	}
}
