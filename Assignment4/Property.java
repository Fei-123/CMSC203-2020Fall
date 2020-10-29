package Assignment4;

public class Property {
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	
	public  Property() {
		city="";
		owner = "";
		propertyName="";
		rentAmount=0;
		plot = new Plot(0,0,1,1);
	}
	
	public  Property(Property p) {
		city=p.city;
		owner = p.owner;
		propertyName=p.propertyName;
		rentAmount=p.rentAmount;
		plot = p.getPlot();
	}
	
	public  Property(String propertyName,String city, double rentAmount, String owner ) {
		this.city=city;
		this.owner =owner;
		this.propertyName=propertyName;
		this.rentAmount=rentAmount;
		plot = new Plot(0,0,1,1);
	}
	
	public Property(String propertyName,String city, double rentAmount, String owner, int x, int y, int width, int depth ) {
		this.city=city;
		this.owner =owner;
		this.propertyName=propertyName;
		this.rentAmount=rentAmount;
		plot = new Plot(x,y,width,depth);
	}
	
	public Property(String propertyName, String city, int rentAmount, String owner, int x, int y, int width,
			int depth) {
		this.city=city;
		this.owner =owner;
		this.propertyName=propertyName;
		this.rentAmount=rentAmount;
		plot = new Plot(x,y,width,depth);
	}

	public java.lang.String getPropertyName(){
		return propertyName;
	}
	
	public void setPropertyName(java.lang.String propertyName) {
		this.propertyName=propertyName;
	}
	
	public java.lang.String getCity(){
		return city;
	}
	
	public Plot setPlot(int x, int y, int width, int depth) {
		return plot = new Plot(x,y,width,depth);
	}
	
	public void setCity(java.lang.String city) {
		this.city = city;
	}
	
	public double getRentAmount() {
		return rentAmount;
		
	}
	
	public void setRentAmount(double rentAmount) {
		this.rentAmount=rentAmount;
	}
	
	public java.lang.String getOwner(){
		return owner;
	}
	
	public void setOwner(java.lang.String owner) {
		this.owner = owner;
	}

	/*public Plot getPlot() {
		return plot;
	}*/

	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	@Override
	public String toString() {
		return "Property Name: " + propertyName+ "/nLocated in city " + city +
				"/nBelonging to: " + owner + "/nRent Amount: " + rentAmount;
	}

	public Plot getPlot() {
		// TODO Auto-generated method stub
		return plot;
	}
	
	
}
