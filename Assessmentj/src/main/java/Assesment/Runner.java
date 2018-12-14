package Assesment;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Player player1 = new Player((Math.random()) * 10, (Math.random()) * 10);
		Portal portal1 = new Portal((Math.random()) * 10, (Math.random()) * 10);

		System.out.println("You have entered a large overgrown and destute swamp, You cannot see due to fog;\r\n"
				+ "however you have a magic compass that tells you where a hidden portal is,\r\n"
				+ "freeing you from this groggy place! you can only ask wether you can travel north, south, east or west...\r\n"
				+ "Choose wisely");
		do {
			Scanner position = new Scanner(System.in);
			System.out.println("Please type 'north', 'east', 'south', west'..?");
			String input = position.next();
			if (input.equals("north")) {
				player1.getPlayerPositionY();
				double n = player1.getPlayerPositionY();
				n++;

			} else if (input.equals("east")) {
				player1.getPlayerPositionX();
				double n = player1.getPlayerPositionX();
				n++;

			} else if (input.equals("south")) {
				player1.getPlayerPositionY();
				double n = player1.getPlayerPositionY();
				n--;

			} else if (input.equals("west")) {
				player1.getPlayerPositionX();
				double n = player1.getPlayerPositionX();
				n--;

			}
		} while (player1.getPlayerPositionX() != portal1.getPortalPosition()
				&& player1.getPlayerPositionY() != portal1.getPortalPositionY());
		{
			System.out.println("you are " + "m from the portal");
			if (player1.getPlayerPositionX() == portal1.getPortalPosition()
					&& player1.getPlayerPositionY() == portal1.getPortalPositionY()) {

			}
			System.out.println("You are FREE!! Enjoy it while it lasts....");
		}
	}

}
