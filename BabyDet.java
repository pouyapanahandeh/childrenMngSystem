import java.util.*;
import java.text.*;

public class BabyDet{

	private String babyName;
	private int babyAge;
	private Date birthday;

	public BabyDet(){
	
	}
	
	public BabyDet(String babyName,int babyAge,Date birthday){
		this.babyName = babyName;
		this.babyAge  = babyAge;
		this.birthday = birthday;
		
	}


	public String getBabyName(){
		return babyName;
	}

	public void setBabyName(String babyName){
		this.babyName = babyName;
	}
	
	public int getBabyAge(){
		return babyAge;
	}

	public void setBabyAge(int age){
		this.babyAge = babyAge;
	}
	
	public Date getBirthday(){
		return birthday;
	}

	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}

	public boolean equals(BabyDet cnd){
		if(!this.babyName.equals(cnd.babyName))
			return false;
		return true;
	}

	public String toString(){
		return babyName + " " + babyAge.toString() 
			+ " " + birthday.toString();
	}
}
