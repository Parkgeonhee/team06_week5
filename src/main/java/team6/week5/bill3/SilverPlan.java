package team6.week5.bill3;

public class SilverPlan implements Plan {
	double basecost;
	int basetraffic;
	String grade;
	double addlinecost;
	double overflowtrafficcost;
	
	public SilverPlan() {
		this.basecost = 29.95;
		this.basetraffic = 500;
		this.grade = "SILVER";
		this.addlinecost = 21.5;
		this.overflowtrafficcost = 0.54;	
	}
	

	public double getBasecost() {
		return this.basecost;
	}
	
	public int getBaseTraffic() {
		return this.basetraffic;
	}
	

	public double getAddLineCost()
	{
		return this.addlinecost;
	}
	
	public double getOverflowTrafficCost() {
		return this.overflowtrafficcost;
	}
	
}