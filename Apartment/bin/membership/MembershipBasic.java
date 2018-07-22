package membership;

import amenities.Maintenance;
import amenities.Security;

// Implementation for Basic Membership type
public class MembershipBasic extends BaseMembership
{

	@Override
	protected void setApplicableAmenities() 
	{	
		this.applicableAmenities.add(new Maintenance()); // Amenity 8
		this.applicableAmenities.add(new Security()); // Amenity 9
	}

}
