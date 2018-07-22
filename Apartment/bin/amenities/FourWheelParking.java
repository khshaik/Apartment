package amenities;

import member.MembershipType;

public class FourWheelParking  extends BaseAmenities
{

	private static final  MembershipType AMENITY_TYPE = MembershipType.DELUXE;
	private static final  String AMENITY_NAME = "4wheelerparking";
	
	public FourWheelParking()
	{
		this.amenityType = AMENITY_TYPE;
		this.amentityName = AMENITY_NAME;
	}

}
