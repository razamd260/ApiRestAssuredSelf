package Session24;

import java.util.List;
import java.util.Map;

import Session22.EmployeeAddress;
import Session22.EmployeePojoClass;

public class SchoolPOJOClass {
    
	private String Schoolname;
	
	private long Reg_number;;
	private List<String> Contactnumber;
	private Map<String,Integer> Cource;
	private EmployeePojoClass student;
	public String getSchoolname() {
		return Schoolname;
	}
	public void setSchoolname(String schoolname) {
		Schoolname = schoolname;
	}
	public long getReg_number() {
		return Reg_number;
	}
	public void setReg_number(long reg_number) {
		Reg_number = reg_number;
	}
	public List<String> getContactnumber() {
		return Contactnumber;
	}
	public void setContactnumber(List<String> contactnumber) {
		Contactnumber = contactnumber;
	}
	public Map<String, Integer> getCource() {
		return Cource;
	}
	public void setCource(Map<String, Integer> cource) {
		Cource = cource;
	}
	public EmployeePojoClass getstudent() {
		return student;
	}
	public void setstudent(EmployeePojoClass student) {
		this.student = student;
	}

	
	
}
