package week1.day2;

public class EmployeeDetails {

	//Arguments
	public void getEmployeeDetails(String empName, int empId) {
			System.out.println(empName + "-" + empId);
	}
	public String getAddress () {
		String address = "90, MukasiPidariyur, Erode";
		return address;
	
	}
	public static void main(String[] args) {
		
		EmployeeDetails emp = new EmployeeDetails();
		emp.getEmployeeDetails("Prabhu Ravi", 209202);
		//ctrl + 2, L
		String address = emp.getAddress(); 
		System.out.println(address);
		//System.out.println(emp.getAddress());

	}

}
