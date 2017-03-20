package datok;

import hsa_new.Console;

public class HelloConsole {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String responsee;
       Console c = new Console();
       c.println("hey what's up?");
       responsee = c.readString();
       Integer.parseInt(responsee);
       
       
	}

}
