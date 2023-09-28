package lab3;

public class PlaneSeat {
	private int seatID;
	private boolean assigned;
	private int custID;
	
	PlaneSeat(int s){
		this.seatID = s;
		this.assigned = false;
		this.custID = 0;
	}
	
	public int getSeatID(){
		return this.seatID;
	}
	
	public int getCustID() {
		return this.custID;
	}
	
	public boolean isOccupied() {
		return this.assigned;
	}
	
	public void assign(int c) {
		this.custID = c;
		if(this.custID != 0) this.assigned = true;
	}
	
	public void unAssign() {
		this.custID = 0;
		this.assigned = false;
	}
	
}
