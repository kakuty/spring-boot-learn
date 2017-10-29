package hello.data;

public class Employee {
	private PersonInfo personInfo;
	private int employId;
	private String employeePosition;
	public Employee(PersonInfo personInfo, int employId, String employeePosition) {
		super();
		this.personInfo = personInfo;
		this.employId = employId;
		this.employeePosition = employeePosition;
	}
	public PersonInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
	public int getEmployId() {
		return employId;
	}
	public void setEmployId(int employId) {
		this.employId = employId;
	}
	public String getEmployeePosition() {
		return employeePosition;
	}
	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}
	
	
}
