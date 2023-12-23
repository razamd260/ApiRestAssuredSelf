package Session20;

import java.io.Serializable;

public class ClassS_D implements Serializable {
        
	private String name;
	private int id;
	private String job;
	
	public String getname() {
		return name;
	}
	public int getid() {
		return id;
	}
	public String getjob() {
		return job;
	}
   
	public void setname(String name1) {
		name=name1;
	}
	public void setid(int id1) {
		id=id1;
	}
	public void setjob(String job1) {
		job=job1;
	}
}
