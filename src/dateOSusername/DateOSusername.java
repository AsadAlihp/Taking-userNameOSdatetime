package dateOSusername;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;


public class DateOSusername {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		//Time : 11:09am 
		//Date: Friday 13 March 2015
		System.out.println("The Operating system you are using is "+System.getenv("os"));
		System.out.println("The Current user name is "+System.getenv("username"));
		System.out.println("Operating system version "+System.getProperty("os.name"));
		System.out.println("User's current working directory is "+System.getProperty("user.dir"));
		
		//GETING USER'S CURRENT WORKING DIRECTORY BELOW
		System.out.println("Local host and user name is "+InetAddress.getLocalHost());
		//Getting current date and time below
		Date md = new Date();
		System.out.println(md.toString());

	}

}
