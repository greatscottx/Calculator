package cse360assign3;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		this.total = total + value;		//adds value
	}
	
	public void subtract (int value) {
		this.total = total - value;		//subtracts value
	}
	
	public void multiply (int value) {
		this.total = total * value;		//multiplies value
	}
	
	public void divide (int value) {
		if(value == 0){					//if dividing by 0, return 0
			total = 0;
		}
		else{
			total = total / value;		//else return int answer of total/value
		}
	}
	
	public String getHistory () {
		return "";						//return empty string (for now)
	}
}
