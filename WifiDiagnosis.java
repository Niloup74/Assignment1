
import java.util.Scanner;

public class WifiDiagnosis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//some of the messages  that were going to be repeated are here for later use as shortcut.
				String didItFix = "Did that fix the problem?";
				Scanner keyboard = new Scanner(System.in);
				String imSorry = "I'm sorry that did not work. lets try something else";
				String fixed = "Great, Glad I could help";
				String plzrepeat = "Sorry I did not get that.";
				String startmsg = "Welcome to WIFI Diagnosis! If you are having issues with internet connectivity, this will help.";
				
				
				
		//start
				
				System.out.println(startmsg);
				
				
				
		//first step. Reboot.
				String rebootmsg = "Try rebooting your computer.";
				System.out.println(rebootmsg);
				System.out.println(didItFix);
				
		//response to rebooting
				String response1; //users response to rebooting computer.
				String not = "no";
				String yea = "yes";
						
				response1 = keyboard.next();
				
				//if statement to decide what to do next based on user response.
				if (response1.equals(not)) {
					System.out.println(imSorry + " please reboot your router and try to connect");
					System.out.println(didItFix);
				}
				if (response1.equals(yea)) {
					System.out.println(fixed);
					System.exit(0);
				}
				
				
				
		//cablecheck
				String response2;
				response2 = keyboard.next();
				String jibrish2;
				if (response2.equals(not)) {
					System.out.print(imSorry + " Please make sure the cable connecting the router are firmly plugged in and power is getting to the router.");
					System.out.println(didItFix);
				}
				if (response2.equals(yea)){
					System.out.println(fixed);
					System.exit(0);
				}
		//move computer closer to router.
				String response3;
				response3 = keyboard.next();
				if (response3.equals(not)) {
					System.out.print(imSorry + "Please try moving the computer closer to the router and try connecting. ");
					System.out.print(didItFix);
				}
				if(response3.equals(yea)) {
					System.out.print(fixed);
					System.exit(0);
				}
				
		//contact your isp.
				String response4;
				response4 = keyboard.next();
				if (response4.equals(not)) {
					System.out.print("I'm sorry that did not work. Please try contacting your ISP");
				}
				if(response3.equals(yea)) {
					System.out.print(fixed);
					System.exit(0);
				}
				
			}



	}


