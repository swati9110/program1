package org.cei.BusTicket.app;
public class SeatMap {

	public static final int ROWS = 10;
	public static final int COLS = 3;
	public static int [][] seats = new int[ROWS][COLS];
	
	static {
		for(int i=0; i<ROWS; i++) {
			for(int j=0; j<COLS; j++) {
				seats[i][j] = 0;
			}
		}
		seats[0][2] = 1; // Cos this seat doesn't exist
	}
	
	public void allocate(int row, int col) throws Exception {
		if(isSeatAvailable(row, col)) {
			seats[row][col] = 1;
		} else {
			throw new Exception("Seats not available!!");
		}
	}
	
	public static int getSeatNumber(int row, int col) throws Exception {
		if(row < 0 || row >= ROWS) {
			throw new Exception("Row number #" + row + " doesn't exist");
		} else if(col < 0 || col >= COLS) {
			throw new Exception("Column number #" + col + " doesn't exist");
		} else if (row == 0) {
			return col;
		} else {
			return row * COLS + col;
		}
	}
	
	/*public int getNoOfAvailableSeats(int row,int col)
	{
		
	}*/
	
	public static boolean isSeatAvailable(int row, int col) {
		return seats[row][col] == 0;
	}
	
	public static boolean isWomenSeat(int row, int col) {
		return row < 2;
	}
	
	public static boolean isSeniorCitizenSeat(int row, int col) {
		return row < 2;
	}
	
	public static boolean isMenSeat(int row, int col) {
		return (row  >= ROWS-2 && row < ROWS);
	}
	
	public static boolean isCentreSeat(int row, int col) {
		return (row >= 2 && row < ROWS-2);
	}
	
}
