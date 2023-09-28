package lab3;

import java.util.*;

public class PlaneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p = new Plane();
		int newSeatID;
		int newCustID;
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) Show number of empty seats");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment");
		System.out.println("(7) Exit");
		System.out.print("Enter the number of your choice: ");
		int choice = sc.nextInt();
		while(choice != 7) {
			switch (choice) {
			case 1:
				p.showNumEmptySeats();
				break;
			case 2:
				p.showEmptySeats();
				break;
			case 3:
				p.showAssignedSeat(true);
				break;
			case 4:
				p.showAssignedSeat(false);
				break;
			case 5:
				System.out.println("Assigning seat...");
				System.out.print("Please enter SeatID: ");
				newSeatID = sc.nextInt();
				System.out.print("Please enter Customer ID: ");
				newCustID = sc.nextInt();
				if(newSeatID > 12 || newSeatID < 1) {
					System.out.println("Invalid Seat ID!");
					break;
				}
				else if (newCustID == 0) {
					System.out.println("Invalid Customer ID!");
					break;
				}
				p.assignSeat(newSeatID - 1, newCustID);
				break;
			case 6:
				System.out.print("Enter SeatID to unassign customer from: ");
				newSeatID = sc.nextInt();
				p.unAssignSeat(newSeatID - 1);
				break;
			default:
				System.out.println("Incorrect choice!");
				break;
			}
			System.out.print("Enter the number of your choice: ");
			choice = sc.nextInt();
		}
	}

}
