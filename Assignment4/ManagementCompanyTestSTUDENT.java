package Assignment4;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	Property p1 ,p2,p3,p4,p5,p6;
	ManagementCompany m ; 
	@Before
	public void setUp() throws Exception {
		//student create a management company
		
		 
		
		p1 = new Property ("Almost Aspen", "Rockville", 2300.00, "Amy Smith",5,1,2,2);
		p2 = new Property ("Ambiance", "Githersburg", 4500.0, "Sam Taylor",4,1,5,2);
		p3 = new Property ("Bear Creek Lodge", "Germantown", 4900, "Jack Burley",6,1,3,3);
		m= new ManagementCompany("Railey", "555555555",6);
		//student add three properties, with plots, to mgmt co
		m.addProperty(p1);
		
		m.addProperty(p2);
		m.addProperty(p3);
	}	

	@After
	public void tearDown() throws Exception {
		//student set mgmt co to null  
		p1=p2=p3=null;
		m=null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//fail("STUDENT test not implemented yet");
		//student should add property with 4 args & default plot (0,0,1,1)
		p4 = new Property ("sunny", "Beckman", 2600, "BillyBob Wilson",0,0,1,1);
		//student should add property with 8 args
		p5 = new Property ("emoji", "Nino", 3200, "Annie N",6,8,3,1);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
		p5 = new Property ("butter", "seven", 5600, "Mike N",3,3,3,2);
	}
 
	@Test
	public void testMaxRentProp() {
		//fail("STUDENT test not implemented yet");
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(m.maxRentProp(),4900.0,0);
	}

	@Test
	public void testTotalRent() {
		//fail("STUDENT test not implemented yet");
		//student should test if totalRent returns the total rent of properties
		assertEquals(m.totalRent(),11700.0,0);
	}

 }
