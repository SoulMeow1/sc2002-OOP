package lab3;

import java.util.*;

public class Plane {
	private PlaneSeat[] seat = new PlaneSeat[12];
	private int numEmptySeat;
	
	Plane(){
		for (int i = 0; i < this.seat.length; i++) {
			this.seat[i] = new PlaneSeat(i + 1);
		}
		this.numEmptySeat = 12;
	}
	
	private PlaneSeat[] sortSeats() {
		int[] arr = new int[12];
		int cnt = 0;
		
		for(PlaneSeat s : this.seat) {
			arr[cnt] = s.getCustID();
			cnt++;
		}
		
		InsertionSort iSort = new InsertionSort();
		arr = iSort.sort(arr);
		
		cnt = 0;
		PlaneSeat[] se = new PlaneSeat[12];
		for (int custID : arr) {
	        se[cnt] = new PlaneSeat(cnt);
	        se[cnt].assign(custID);
	        cnt++;
	    }
		return se;
	}
	
	public void showNumEmptySeats() {
		System.out.println("Number of Empty Seats: " + this.numEmptySeat);
	}
	
	public void showEmptySeats() {
		System.out.println("The following seats are empty:");
		for (PlaneSeat s : this.seat) {
			if(!s.isOccupied()) {
				System.out.println("SeatID " + s.getSeatID());
			}
		}
	}
	
	public void showAssignedSeat(boolean bySeatID) {
		System.out.println("The seat assignments are as follows:");
		if(!bySeatID) {
			for(PlaneSeat s : sortSeats()) {
				if(s.isOccupied()) {
					System.out.println("SeatID " + s.getSeatID() + " assigned to CustomerID " + s.getCustID() + ".");
				}
			}
		}
		else {
			for(PlaneSeat s : this.seat) {
				if(s.isOccupied()) {
					System.out.println("SeatID " + s.getSeatID() + " assigned to CustomerID " + s.getCustID() + ".");
				}
			}
		}
	}
	
	public void assignSeat(int seatID, int custID) {
		if(this.seat[seatID].isOccupied()) {
			System.out.println("Seat already assigned to a customer.");
		}
		else {
			this.seat[seatID].assign(custID);
			System.out.println("Seat Assigned!");
			this.numEmptySeat--;
		}
	}
	public void unAssignSeat(int seatID) {
		this.seat[seatID].unAssign();
		this.numEmptySeat++;
		System.out.println("Seat Unassigned!");
	}
}
