package membership;

import amenities.FourWheelParking;
import amenities.TwoWheelParking;

// Implementation for Delux Membership
public class MembershipDelux  extends BaseMembership
{
	@Override
	protected void setApplicableAmenities() 
	{	
		// Appends Basic Ementities
		IMembershipType basicMembership = new MembershipBasic();
		this.applicableAmenities.addAll(basicMembership.getApplicableAmentities());
		
		this.applicableAmenities.add(new FourWheelParking()); // Amenity 6
		this.applicableAmenities.add(new TwoWheelParking()); // Amenity 5
	}

}
