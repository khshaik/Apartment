package member;

import amenities.IAmenities;
import membership.IMembershipType;

// Interface for the Member Account 
public interface IMember 
{
	// returns the membershiptype for the member
	MembershipType getMembershipType();
	
	//Sets the membership type for the Member
	void setMembershipType(MembershipType aMembershipType);
	
	// retrusn the maintainence amount
	double getMaintainence();
		
	// Appends additional Amentities/ Topups
	void addAmenities(IAmenities aAmenities);
	
	// Appends Amemntities of a particular memebershipType
	void addMembershipType(IMembershipType aMemberShipType);
	
	// Calculates price for Memeber based on applicable Amentities
	void doCalculateAmenitiesPrice();
}
