import java.sql.Connection;  
import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.DriverManager; 
import java.util.List;
import java.util.ArrayList;
public class RetrieveMultipleRecordsDemo{ 

    public Employee getEmployeeById(int employeeId) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
		Statement stmt=con.createStatement();    
		ResultSet resultSet = stmt.executeQuery("select * from emp2 where eid="+employeeId);  
		Employee employee = new Employee();
		if(resultSet.next()){
			employee.empName = resultSet.getString("name");
			employee.phone = resultSet.getString("PHONE");
			employee.email = resultSet.getString("EMAIL"); 
		}
		con.close();  
		return employee;
	}
	
	 public List<Employee> getAllEmployees() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
		Statement stmt=con.createStatement();    
		ResultSet resultSet = stmt.executeQuery("select * from emp2");  
		List<Employee> empList = new ArrayList<Employee>();
		while(resultSet.next()){
			Employee employee = new Employee();
			employee.empName = resultSet.getString("name");
			employee.phone = resultSet.getString("PHONE");
			employee.email = resultSet.getString("EMAIL");
			empList.add(employee);
		}
		con.close();  
		return empList;
	}
	public static void main(String args[])throws Exception{  
	  RetrieveMultipleRecordsDemo demo = new RetrieveMultipleRecordsDemo();
	  Employee emp = demo.getEmployeeById(101);
	  System.out.println("EName : "+emp.empName + " Email : "+emp.email + " Phone : "+emp.phone );
	  System.out.println("===============================================================");
	  List<Employee>  listOfEmp = demo.getAllEmployees();
	  for(Employee employee : listOfEmp){
		   System.out.println("Ename : "+employee.empName + " Email : "+employee.email + " Phone : "+employee.phone );
	  }
	  
	}
		
}