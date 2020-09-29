import java.util.Scanner;

public class SphereVolume 
{ 
public static void main(String[] args) 
{ 
	double diam;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("The purpose of this program is calculating a sphere's volume.");
	System.out.print("Enter a diameter of a sphere: ");
	diam = input.nextDouble();
	if(diam > 0) {
		double radius = diam/2;
		
		double volume = (4/3) * Math.PI * Math.pow(radius, 3);
		
		System.out.println("The volume of the sphere is " + volume);
	}
	else {
		System.out.println("Invaild diameter.");
	}

} 
} 
