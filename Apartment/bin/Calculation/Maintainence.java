package Calculation;
import java.util.Scanner;

import amenities.Powerbackup;
import amenities.SecondCarParking;
import member.IMember;
import member.Member;
import member.MembershipType;

public class Maintainence 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		IMember  member = new Member();
		// Set membership type for the member
		selectMembershipType(scanner, member);		
		// set additonal topups for the member
		selectTopupAmenities(scanner,member);		
		
		scanner.close();
		member.doCalculateAmenitiesPrice();
		System.out.println("Applicable Price : " + member.getMaintainence());
	}
	
	// Sets membership type for the member
	private static void selectMembershipType(Scanner aScanner, IMember aMember)
	{
		Integer membershipType = 0;
		while (membershipType < 1  || membershipType >3)
		{
			System.out.print("Please select any one of the  Membership type : \n");
			System.out.print("1. Basic\n");
			System.out.print("2. Delux\n");
			System.out.print("3. Elite\n");
			String input =  aScanner.nextLine();			
			membershipType =Integer.valueOf(input);
		} 
		
		if(membershipType == 1)
		{
			aMember.setMembershipType(MembershipType.BASIC);
		}
		else if(membershipType == 2)
		{
			aMember.setMembershipType(MembershipType.DELUXE);
		}
		else if(membershipType == 3)
		{
			aMember.setMembershipType(MembershipType.ELITE);
		}	
	}

	// add Additional topups for the member
	private static void selectTopupAmenities(Scanner aScanner, IMember aMember)
	{
		Integer topup = -1;
		while (topup < 0 || topup > 2)
		{
			System.out.print("Please select any one of the additonal topups: \n");
			System.out.print("0. No topups necessary\n");
			System.out.print("1. Power backup\n");
			System.out.print("2. Second car Parking\n");
			String input =  aScanner.nextLine();			
			topup =Integer.valueOf(input);
		} 
		if(topup == 1)
		{
			aMember.addAmenities(new Powerbackup());
		}
		else if(topup == 2)
		{
			aMember.addAmenities(new SecondCarParking());
		}
	}
}
