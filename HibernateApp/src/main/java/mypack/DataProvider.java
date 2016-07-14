package mypack;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class DataProvider {
	@Id
	private int userid;
	private String firstname;
	private String secondname;
	private String password;
	
	public DataProvider(){}
	
	public DataProvider(String firstname,String secondname,String password){
		this.firstname=firstname;
		this.secondname=secondname;
		this.password=password;
		
	}
	
	
	
	
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
