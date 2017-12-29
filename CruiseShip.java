/*Name: My Nguyen
  Class: 35A
  Due date: 02/10/27
  Date submitted: 02/17/17
 */
package cruiseship.java;

import cruiseship.java.CruiseShip;
import ships.java.Ship;

public class CruiseShip extends Ship {
	
	private int passengerCapacity;
	
	//constructors
	public CruiseShip(){
		passengerCapacity = 0;
	}	
	public CruiseShip(String name, int year, String builder, String cost, int capacity){
		super(name, year, builder, cost);
		this.passengerCapacity = capacity;
	}
	
	//setter
	public void setPassengerCapacity(int capacity){
		passengerCapacity = capacity;
	}
	//getter
	public int getPassengerCapacity(){
		return passengerCapacity;
	}
	
	public void printShipInfo(){
		System.out.printf("Cruise Ship's information:");
		System.out.printf("\n1. Name      : " + getShipName());
		System.out.printf("\n2. Year built: " + getYearBuilt());
		System.out.printf("\n3. Builder   : " + getBuilder());
		System.out.printf("\n4. Cost      : $" + getBuildCost());
		System.out.printf("\n5. Capacity  : " + passengerCapacity + " passengers");
	}
}
