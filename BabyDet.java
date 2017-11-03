import java.util.*;
import java.text.*;

public class BabyDet{

	private String babyName;
	private int babyAge;
	
	public BabyDet(String babyName,int babyAge){
		this.babyName = babyName;
		this.babyAge  = babyAge;
	}
	
	
	public BabyDet() {
		
	}


	public String getBabyName(){
		return babyName;
	}
	
	public int getBabyAge(){
		return babyAge;
	}
	
	
	public void setBabyName(String name) {
		
		this.babyName = name;
	}
	
	public void setBabyAge(int age){
		this.babyAge = age;
	}


	public int setBabyAge(String next) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
	

