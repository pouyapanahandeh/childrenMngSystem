import java.util.Date;
import java.text.*;
import java.util.ArrayList;

public class BabyDet{

//	private int babyAge;
//	private Date birthday;
	private String babyName;
	private Date birthday;
	private char sex;
	
	
	
	private ArrayList<GiftDet> gifts = new ArrayList<>();
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	
	public BabyDet(){
		
	}
	public BabyDet(String birthday,String babyName,char sex){
		try{
		this.birthday=dateFormat.parse(birthday);
		this.babyName = babyName;
		this.sex = sex;
		}catch(ParseException e){
			System.out.println("there is error.");
		}
	}
	public BabyDet(Date birthday,String babyName,char sex){
			this.birthday = birthday;
			this.babyName = babyName;
			this.sex = sex;
		}
	
//	public String getBabyName(){
//	return babyName;
//}
//
//public void setBabyName(String babyName){
//	this.babyName = babyName;
//}
//
//public int getBabyAge(){
//	return babyAge;
//}
//
//public void setBabyAge(int age){
//	this.babyAge = babyAge;
//}
//
//public Date getBirthday(){
//	return birthday;
//}
//
//public void setBirthday(Date birthday){
//	this.birthday = birthday;
//}
//
//public boolean equals(BabyDet cnd){
//	if(!this.babyName.equals(cnd.babyName))
//		return false;
//	return true;
//}
//
//public String toString(){
//	return babyName + " " + birthday.toString();
//}
	
	
	
	
	public String getbabyName(){
		return this.babyName;
	}
	public Date getBirthday(){
		return this.birthday;
	}
	public char getsex(){
		return this.sex;
	}
	public void setbabyName(String babyName){
			this.babyName = babyName;
	}
	public void setBirthday(Date birthday){
								this.birthday = birthday;
	}
	public void setBirthday(String birthday){
		try{
			this.birthday=dateFormat.parse(birthday);
		}catch(ParseException e){
			System.out.println(e);
		}
	}	
	public void setsex(char sex){
		this.sex = sex;
	}
		
		
	public boolean isOlder(BabyDet baby){
		if(this.birthday.compareTo(baby.getBirthday())<0)
			return true;
		else 
			return false;
	}
	public int howOld(){
		Date date = new Date();
		int age=0;
		if(this.birthday.getYear()<date.getYear()){
			age = date.getYear() - this.birthday.getYear();
		}
		if(this.birthday.getMonth()>date.getMonth()){
			age +=  1;
		}else if(this.birthday.getMonth()==date.getMonth()){
			if(this.birthday.getDay()>date.getDay()){
				age -= 1;
			}
		}
		return age;
	}
	public GiftDet addGiftDet(GiftDet GiftDet){
		gifts.add(GiftDet);
		return GiftDet;
	}
	public String showgifts(){
		String str="";
		for(GiftDet g : gifts){
			str+=g.toString()+"\n";
		}
		return str;
	}
	@Override
	public String toString(){
		
		return this.howOld() + dateFormat.format(birthday);
	
	}
	
}