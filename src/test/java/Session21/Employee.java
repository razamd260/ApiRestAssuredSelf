package Session21;

public class Employee {
	private String firstname;
	private String lastname;
	private String gender;
	private int age;
	private double salary;
   
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

}
