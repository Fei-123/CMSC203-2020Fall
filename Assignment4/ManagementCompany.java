package Assignment4;

import java.util.Arrays;

public class ManagementCompany {
	private String name;
	private String taxID;
	private Property[] properties;
	private double mgmFeePer;
	private final int MAX_PROPERTY=5;
	private final int MGMT_WIDTH=10;
	private final int MGMT_DEPTH=10;
	private Plot plot;

	ManagementCompany() {
		plot = new Plot(0,0,10,10);
		name="";
		taxID ="";
		properties = new Property[MAX_PROPERTY];
		for(int i = 0; i < properties.length;i++) {
			properties[i] = new Property();
		}
	}

	ManagementCompany(String name, String taxID, double mgmFee){
		plot = new Plot(0,0,10,10);
		this.name = name;
		this.taxID = taxID;
		mgmFeePer = mgmFee;
		properties = new Property[MAX_PROPERTY];
		for(int i = 0; i < properties.length;i++) {
			properties[i] = new Property();
		}
	}

	ManagementCompany(java.lang.String name, java.lang.String taxID, double mgmFee, int x, int y, int width, int depth){
		this.name = name;
		this.taxID = taxID;
		mgmFeePer = mgmFee;
		plot = new Plot(x,y,width,depth);
		properties = new Property[MAX_PROPERTY];
		for(int i = 0; i < properties.length;i++) {
			properties[i] = new Property();
		}
	}

	ManagementCompany(ManagementCompany otherCompany){
		properties = new Property[MAX_PROPERTY];
		mgmFeePer = otherCompany.getMgmFeePer();
		name = otherCompany.getName();

		taxID = otherCompany.getTaxID();
		plot = otherCompany.getPlot();
		for(int i = 0; i < properties.length;i++) {
			properties[i] = new Property();
		}

	}

	public int addProperty(Property property) {
		int size =0;
		if(property == null) {
			size= -2;
		}
		if(!plot.encompasses(property.getPlot())) {
			size= -3;
		}
		if(plot.overlaps(property.getPlot())) {
			size= -4;
		}

		for(int i =0;i<properties.length; i++) {
			if(properties[i].getRentAmount() == 0) {
				properties[i] = property;
				return i;
			}
		}
		return -1;
	}

	public int addProperty(String name,String city,double rent,String owner) {

		int size =0;
		Property property = new Property(name, city, rent, owner);

		if(property == null) {
			size= -2;
		}
		if(!plot.encompasses(property.getPlot())) {
			size= -3;
		}
		if(plot.overlaps(property.getPlot())) {
			size= -4;
		}

		for(int i =0;i<properties.length; i++) {
			if(properties[i].getRentAmount() == 0) {
				properties[i] = property;
				return i;
			}
		}
		return -1;
	}



	public int addProperty(String name,String city,double rent,String owner,int x,int y,int width,int depth) {
		
		Property property =  new Property(name,city,rent,owner,x,y,width,depth);
		int size =0;
		
		if(property == null) {
			size= -2;
		}
		
		if(!plot.encompasses(property.getPlot())) {
			size= -3;

		}
		System.out.println("3");
		if(plot.overlaps(property.getPlot())) {
			size= -4;

		}
		

		for(int i =0;i<properties.length; i++) {
			if(properties[i].getRentAmount() == 0) {
				properties[i] = property;
				return i;
			}
		}
		
		return -1;
	}

	public double totalRent() {
		double total = 0;

		for (int i =0; i < properties.length; i++)
		{
			total += properties[i].getRentAmount();
			//System.out.println("total rent "+ total);
		}

		return total;
	}


	public double maxRentProp() {
		//double maxRent = 0;

		double maxRent =0; 

		for(int i = 0; i < properties.length; i++) {
			if(properties[i].getRentAmount() > maxRent )
			{
				maxRent = properties[i].getRentAmount();
				//System.out.println("max rent "+ maxRent);
			}
		}
		return maxRent;

	}


	private int maxRentPropertyIndex() {
		int maxIndex = 0;
		double maxRent = 0;

		for(int i = 0; i < properties.length; i++) {
			if(properties[i].getRentAmount() > maxRent )
			{
				maxRent = properties[i].getRentAmount();
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	private java.lang.String displayPropertyAtIndex(int i){
		return properties[i].toString();
	}


	public java.lang.String toString(){
		double sum1 = 0;
		String str = "";
		for(int i = 0; i < properties.length; i++)
		{
			for (int i1 =0; i1 < properties.length; i1++)
			{
				str = properties[i1].toString()+"\n";
			}

			for(int j = 0; j< properties.length; j++)
			{
				sum1 += properties[j].getRentAmount();
			}
		}

		double a =getMgmFeePer()*sum1;
		return "List of properties for " + name + ", taxId= " + taxID +"\n" + 
		"\n" + 
		"----------------------------------------------------------\n" +
		str + "\n----------------------------------------------------------\n" +
		"total management Fee: "+ Double.toString(a);

	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxID() {
		return taxID;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public Property[] getProperties() {
		return properties;
	}

	public void setProperties(Property[] properties) {
		this.properties = properties;
	}

	public double getMgmFeePer() {
		return mgmFeePer;
	}

	public void setMgmFeePer(double mgmFeePer) {
		this.mgmFeePer = mgmFeePer;
	}

	public Plot getPlot() {
		return plot;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	public int getMAX_PROPERTY() {
		// TODO Auto-generated method stub
		return MAX_PROPERTY;
	}



}
