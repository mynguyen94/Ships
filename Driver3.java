/*Name: My Nguyen
  Class: 35A
  Due date: 02/10/27
  Date submitted: 02/17/17
  Description: demonstrates Ship class, CargoShip class and CruiseShip class
  				by using an array object, inheritance and polymorphism to print
  				out the information of the each ship.
 */
package driver3.java;

import driver3.java.Driver3;
import ships.java.Ship;
import cargoship.java.CargoShip;
import cruiseship.java.CruiseShip;

public class Driver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ship [] shipArray = new Ship[3];
		
		shipArray[0] = new Ship("SM Olympic", 1911, "Harland and Wolff, Belfast", "7.5 million");
		shipArray[1] = new CargoShip("Atlantic Conveyor", "Swan Hunter",1985, "1.2 bilion", 14950);
		shipArray[2] = new CruiseShip("Harmony of the Seas", 2015, "STX France SA", "1.35 billion", 5476);
		
		//print out the information for ship, cargo ship and cruise ship
		for(int i = 0; i < shipArray.length; i++)
		{
			shipArray[i].printShipInfo(); // polymorphism
		}		

	}//end main

}//end Driver3 class
