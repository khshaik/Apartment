package member;

import java.util.ArrayList;

import amenities.IAmenities;
import membership.IMembershipType;
import membership.MembershipBasic;
import membership.MembershipDelux;
import membership.MembershipElite;

// Class implementation for Member account
public class Member implements IMember 
{
	// Applicable Amentities for Member
	protected ArrayList<IAmenities> applicableAmenities = new ArrayList<>();
	
	private double totalMaintenance = 0.0;
	
	// member variables
	private MembershipType membershipType ;
	
	// Constructor
	// initializes the default attributes
	public Member()
	{
		// Sets default membership type as Basic
		membershipType = MembershipType.BASIC;
	}
	
	
	@Override	
	public MembershipType getMembershipType() 
	{
		return membershipType;
	}

	@Override
	public void setMembershipType(MembershipType aMembershipType) 
	{
		membershipType= aMembershipType;
		// Sets default membership type as Basic
		if(aMembershipType.equals(MembershipType.BASIC))
		{
			IMembershipType membership = new MembershipBasic();
			this.applicableAmenities.addAll(membership.getApplicableAmentities());
		}
		else if(aMembershipType.equals(MembershipType.DELUXE))
		{
			IMembershipType membership = new MembershipDelux();
			this.applicableAmenities.addAll(membership.getApplicableAmentities());
		}
		else if(aMembershipType.equals(MembershipType.ELITE))
		{
			IMembershipType membership = new MembershipElite();
			this.applicableAmenities.addAll(membership.getApplicableAmentities());
		}		
	}

	@Override
	public double getMaintainence() 
	{
		return totalMaintenance;
	}

	@Override
	public void addAmenities(IAmenities aAmenities) 
	{
		this.applicableAmenities.add(aAmenities);		
	}

	@Override
	public void addMembershipType(IMembershipType aMemberShipType) 
	{
		this.applicableAmenities.addAll(aMemberShipType.getApplicableAmentities());	
	}

	@Override
	public void doCalculateAmenitiesPrice() 
	{
		// iterates through all applicable amentities to get the price for the memebr
		for (IAmenities amenity: applicableAmenities)
		{
			amenity.doReadPrice();		
			this.totalMaintenance += amenity.getPrice();
		}		
	}	
	
	
	

}
