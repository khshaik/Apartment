package membership;

import amenities.ClubHouse;
import amenities.Gym;
import amenities.SwimmingPool;

// Imementation for Elite Membershiptype
public class MembershipElite  extends BaseMembership
{
	@Override
	protected void setApplicableAmenities() 
	{	
		// Appends Delux Ementities
		IMembershipType deluxMembership = new MembershipDelux();
		this.applicableAmenities.addAll(deluxMembership.getApplicableAmentities());
		
		this.applicableAmenities.add(new Gym()); // Amenity 1
		this.applicableAmenities.add(new SwimmingPool()); // Amenity 2
		this.applicableAmenities.add(new ClubHouse()); // Amenity 3
	}
	
	


}
