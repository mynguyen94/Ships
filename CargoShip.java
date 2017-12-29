/*Name: My Nguyen
  Class: 35A
  Due date: 02/10/27
  Date submitted: 02/17/17
 */
package cargoship.java;

import cargoship.java.CargoShip;
import ships.java.Ship;

public class CargoShip extends Ship {
	
	private int cargoCapacity;
	
	//constructors
	public CargoShip(){
		cargoCapacity = 0;
	}
	public CargoShip(String name, String builder,int year, String cost, int capacity){
		super(name, year, builder, cost);
		this.cargoCapacity = capacity;
	}
	
	//setters
	public void setCargoCapacity(int capacity){
		cargoCapacity = capacity;
	}
	
	//getters
	public int getCargoCapacity(){
		return cargoCapacity;
	}
	
	public void printShipInfo(){
		System.out.printf("Cargo Ship's infomration: ");
		System.out.printf("\n1. Name      : " + getShipName());
		System.out.printf("\n2. Year built: " + getYearBuilt());
		System.out.printf("\n3. Builder   : " + getBuilder());
		System.out.printf("\n4. Cost      : $" + getBuildCost());
		System.out.printf("\n5. Capacity  : " + cargoCapacity + " tons");
		System.out.printf("\n" + "\n");
	}
	

}
