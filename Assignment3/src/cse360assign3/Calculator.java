package cse360assign3;

public class Calculator {

	private int total;
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		this.total = total + value;		//adds value
		this.history += " + " + value;
	}
	
	public void subtract (int value) {
		this.total = total - value;		//subtracts value
		this.history += " - " + value;
	}
	
	public void multiply (int value) {
		this.total = total * value;		//multiplies value
		this.history += " * " + value;
	}
	
	public void divide (int value) {
		if(value == 0){					//if dividing by 0, return 0
			total = 0;
		}
		else{
			total = total / value;		//else return int answer of total/value
		}
		history += " / " + value;
	}
	
	public String getHistory () {
		return history;						//return string history
	}
}
