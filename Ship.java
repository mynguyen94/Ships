/*Name: My Nguyen
  Class: 35A
  Due date: 02/10/27
  Date submitted: 02/17/17
 */
package ships.java;

import ships.java.Ship;

public class Ship {
	private String shipName;
	private int yearBuilt;
	private String builder;
	private String buildCost;
	
	//constructors
	public Ship(){
		shipName ="";
		yearBuilt = 0;
		builder = "";
		buildCost = "";
	}
	public Ship(String name, int year, String group, String cost){
		shipName = name;
		yearBuilt = year;
		builder = group;
		buildCost = cost;
	}
	
	//setters
	public void setShipName(String name){
		shipName = name;
	}
	public void setYearBuilt(int year){
		yearBuilt = year;
	}
	public void setBuilder(String group){
		builder = group;
	}
	public void setBuildCost(String cost){
		buildCost = cost;
	}
	
	//getters
	public String getShipName(){
		return shipName;
	}
	public int getYearBuilt(){
		return yearBuilt;
	}
	public String getBuilder(){
		return builder;
	}	
	public String getBuildCost(){
		return buildCost;
	}
	
	//print out information of the ship
	public void printShipInfo()
	{
		System.out.print("Ship's information:");
		System.out.printf("\n1. Name      : " + shipName);
		System.out.printf("\n2. Year built: " + yearBuilt);
		System.out.printf("\n3. Builder   : " + builder);
		System.out.printf("\n4. Cost      : $" + buildCost);
		System.out.printf("\n" + "\n");
	}
	

}//end Ship class
