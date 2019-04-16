/*
 * This JAVA tutorial is all about Inheritance.
 * This is just a simple example sketch to understand the basics in inheritance concept.
 * I wish you could understand it.
 * Thank You.
 * Check out me on: LinkedIn: https://www.linkedin.com/in/babey/ 
 * 					GitHub: https://github.com/mbabeysekera/
 */

public class InheritanceTest {

	public static void main(String[] args) {
		//First create the object
		Vehicle v = new Vehicle();
		//Set the related fiealds.
		v.setVehicleDetails("ABC-1234", 120, 5);
		//Print them using get methods in the vehicle class.
		System.out.println("Vehicle details are: " + v.getVehicleNumber() + " Top Speed is " +
		v.getVehicleSpeed() + " and Number of seats are " + v.getVehicleSeats());
		
		/*-----------------------------------------------------------------------------------*/
		
		//First create the new car object as BMW.
		Cars BMW = new Cars();
		//Set the parameters to the new class.
		BMW.setCarDetails("Sedan", "CCC-5000", "Front", 150, 5, 6);
		//Print them as the output.
		System.out.println("Car details are: " + BMW.getVehicleNumber() + " and the Drive Type is "
				+ BMW.getDriveType() + ". The car Type is "+ BMW.getCarType() +". The car has " + 
				BMW.getVehicleSeats() + " Seats, Top speed of " + BMW.getVehicleSpeed() + "\n, and number of "
						+ "cylinders in the engine is " + BMW.getNoOfCylinders() + ".");
	}

}
/*
 * Following Class is a common class named as vehicles.
 * There are different types of vehicles. But most of them have same features as a number plate,
 * top Speed, seats.
 */
class Vehicle {
	//Let's declare our class parameters here.
	private String vehicleNumber = new String();
	private int vehicleSpeed;
	private int vehicleSeats;
	//Now it's the time to create methods.
	//It always a good practice to declare your class variable private and allow 
	//them to be accessed through class member methods.
	public void setVehicleDetails(String vNum, int vSpeed, int vSeats) {
		vehicleNumber = vNum;
		vehicleSpeed = vSpeed;
		vehicleSeats = vSeats;
	}
	//Declare get methods to get the related parameters in each variable.
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public int getVehicleSpeed() {
		return vehicleSpeed;
	}
	public int getVehicleSeats() {
		return vehicleSeats;
	}
}
/*
 * Above method is a common one for all vehicles. But we can make or declare more specific classes
 * for specific vehicle types.
 * It can be done as follows.
 * Here this extends keyword draw all the properties in vehicle class and put it on the cars class.
 */
class Cars extends Vehicle {
	//Add new parameters related to cars
	private String carType = new String(); // Sedan or Sport
	private String driveType = new String();// Front or Rear
	private int noOfCylinders;
	//Create the set methods.
	//Here "setVehicleDetails" method has called inside this method.
	//It is possible because now "setVehicleDetails" method is also belongs to this class too.
	public void setCarDetails(String cType, String number, String dType,int cSpeed, 
			int cSeats, int nCylinder) {
		// the "setVehicleDetails" function has called here. As you see no errors display now.
		setVehicleDetails(number, cSpeed, cSeats); //These values are set through the new car class 
												   //constructor
		//Set the other parameters in car class.
 		carType = cType; 
		driveType = dType;
		noOfCylinders = nCylinder;
	}
	//Get accessors to the new car method.
	public String getCarType() {
		return carType;
	}
	public String getDriveType() {
		return driveType;
	}
	public int getNoOfCylinders() {
		return noOfCylinders;
	}
}