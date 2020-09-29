package Assignment1;

import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("If you have a problem with internet connectivity,"+
		" this WiFi Diagnosis might work.");
		
		//first step
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		String answer = input.nextLine();
		
		if(answer.equalsIgnoreCase("yes"))
		{
		System.out.println("Rebooting your computer seemed to work");
		System.exit(0);
		}
		
		//second step
		System.out.println("Second step: reboot your router");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		answer = input.nextLine();
		if(answer.equalsIgnoreCase("yes"))
		{
		System.out.println("Rebooting your router seemed to work");
		System.exit(0);
		}
		
		//3rd step
		System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		answer = input.nextLine();
		
		if(answer.equalsIgnoreCase("yes"))
		{
		System.out.println("Checking the router's cables seemed to work");
		System.exit(0);
		}
		
		//4th step
		System.out.println("Fourth step: move your computer closer to your router");
		System.out.println("Now are you able to connect with the internet? (yes or no)");
		answer = input.nextLine();
		
		if(answer.equalsIgnoreCase("yes"))
		{
		System.out.println("Moving your computer seemed to work");
		System.exit(0);
		}
		
		//5th step
		System.out.println("Fifth step: contact your ISP");
		System.out.println("Make sure your ISP is hooked up to your router.");
		
		
	}

}
