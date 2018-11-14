import java.sql.Statement;
import java.sql.ResultSet; 
import java.sql.DriverManager; 
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.sql.Connection;
import java.util.Set;
public class MapDemo
{
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
			employee.salary = resultSet.getInt("salary");
			employee.empId = resultSet.getInt("eid");
			empList.add(employee);
		}
		con.close();  
		return empList;
	}

 public HashMap<Integer ,List<Employee>> getSalaryWiseEmployees() throws Exception
 {   
	List<Employee> employees = this.getAllEmployees();
	HashMap<Integer ,List<Employee>> salaryEmployeesMap = new HashMap<Integer ,List<Employee>>();
	for(Employee emp : employees){
		if(salaryEmployeesMap.containsKey(emp.salary)){
			List<Employee> empList = salaryEmployeesMap.get(emp.salary);
			empList.add(emp);
		}else {
			List<Employee> empList = new ArrayList<Employee>();
			empList.add(emp);
			salaryEmployeesMap.put(emp.salary, empList);
		}
	}
	return salaryEmployeesMap;
 }
 
 public static void main(String args[])throws Exception{ 
    MapDemo demo = new MapDemo();
	HashMap<Integer ,List<Employee>> salaryEmpMap = demo.getSalaryWiseEmployees();
	
	Set<Integer> salaryKeys = salaryEmpMap.keySet();
	for(int salary : salaryKeys){
		List<Employee> empList = salaryEmpMap.get(salary);
		System.out.println(salary + " salary employees are : ");
		for(Employee employee : empList){
			System.out.println(employee.empId + " " +employee.empName);
		}
		System.out.println("============================");
	}
	
	//System.out.println(salaryEmpMap.toString());
	
 }
}