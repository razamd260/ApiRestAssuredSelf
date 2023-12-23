package Session22;

import java.util.List;
import java.util.Map;

public class EmployeePojoClass {
	private String firstname;
	private String lastname;
	private String gender;
	private int age;
	private double salary;
	private EmployeeAddress address;
	private boolean Married;
	private String[] Hobbies;
   private List<String> Degree;
   private Map<String,String> FamilyMember;
   public Map<String, String> getFamilyMember() {
	return FamilyMember;
}

public void setFamilyMember(Map<String, String> familyMember) {
	FamilyMember = familyMember;
}

public List<String> getDegree() {
	return Degree;
}

public void setDegree(List<String> degree) {
	Degree = degree;
}

public boolean getMarried() {
		return Married;
	}

	public void setMarried(boolean married) {
		Married = married;
	}

	public String[] getHobbies() {
		return Hobbies;
	}

	public void setHobbies(String[] hobbies) {
		Hobbies = hobbies;
	}

public void setfirstname(String firstname) {
	   this.firstname=firstname;
   }
  
   public String getfirstname() {
	   return firstname;
   }

   public void setlastname(String lastname) {
	   this.lastname=lastname;
   }
  
   public String getlastname() {
	   return lastname;
   }
   public void setgender(String gender) {
	   this.gender=gender;
   }
  
   public String getgender() {
	   return gender;
   }
   public void setage(int age) {
	   this.age=age;
   }
  
   public int getage() {
	   return age;
   }
   public void setsalary(double salary) {
	   this.salary=salary;
   }
  
   public double getsalary() {
	   return salary;
   }

   public EmployeeAddress getAddress() {
		return address;
	}
	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	
}
