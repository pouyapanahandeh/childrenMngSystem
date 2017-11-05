import java.text.*;
import java.util.*;

public class BabyDet {

//		private String babyName;
//		private int babyAge;
		private String name;
		private Date birthday;
		private char gender;
		
		private ArrayList<GiftDet> gifts = new ArrayList<>();
//		SimpleDateFormat myformat = new SimpleDateFormat("yyyyMMdd");
		private SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
	
//		List<String> BabyList = new ArrayList<String>();
//		Scanner userInput = new Scanner(System.in);
		
	public BabyDet(){
		
	}
	

//	      List<GiftDet> gifts = Arrays.asList(myArray);
//	      Collections.reverse(myList);
//	      myList.toArray(myArray);
//	      System.out.println(Arrays.toString(myArray));
	
	public BabyDet(String birthday,String name,char gender){
		try{
			
			this.birthday = myFormat.parse(birthday);
			this.name = name;
			this.gender = gender;
		
		}catch(ParseException e){
			System.out.println(e);
		}
	}
	
//	public BabyDet(String babyName,int babyAge,Date birthday){
//		this.babyName = babyName;
//		this.babyAge  = babyAge;
//		this.birthday = birthday;
//		
//	}
	
	public BabyDet(Date birthday,String name,char gender){
			this.birthday = birthday;
			this.name = name;
			this.gender = gender;
		}
	
	public String getName(){
		return this.name;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public Date getBirthday(){
		return this.birthday;
	}
	
//	public void setBirthday(Date birthday) {
//		this.birthday = birthday;
//	}
	
	public char getGender(){
		return this.gender;
	}
	
	public void setName(String name){
			this.name = name;
	}
	
	public void setBirthday(Date birthday){
								this.birthday = birthday;
	}
	
	public void setBirthday(String birthday){
		try{
		
			this.birthday = myFormat.parse(birthday);
		
		}catch(ParseException e){
			
			System.out.println("This is an error.");
		
		}
	}	
	
	public void setGender(char gender){
		this.gender = gender;
	}
		
		
	public boolean isOlder(BabyDet baby){
	
		// implement from main that Baby.java
		
		if(this.birthday.compareTo(baby.getBirthday()) < 0)
			
			return true;
		
		else
			
			return false;
	}
	
	
//	public class BabyDet implements Comparable<BabyDet> {
//		   String name;
//		   int age;
//		   public Person(String name, int age) {
//		      this.name = name;
//		      this.age = age;
//		   }
//		   public String toString() {
//		      return "[name: " + name + ", age: " + age + "]";
//		   }
//	
	
	public int ageSort(){
		
		Date date = new Date();
		int age = 0 ;
		
		if(this.birthday.getYear() < date.getYear()){
			age = date.getYear() - this.birthday.getYear();
		}
		if(this.birthday.getMonth() > date.getMonth()){
			age +=  1;
		}else if(this.birthday.getMonth() == date.getMonth()){
			if(this.birthday.getDay() > date.getDay()){
				age -= 1;
			}
		}
		return age;
	}


//	public String getBabyName(){
//	return name;
//}
//
//public void setBabyName(String name){
//	this.name = name;
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
//	if(!this.name.equals(cnd.name))
//		return false;
//	return true;
//}
//
//public String toString(){
//	return name + " " + birthday.toString();
//}
	
////	public int ageSort(){
////		Date date = new Date();
////		int age = 0;
////		if(this.birthday.getYear() < date.getYear()){
////			age = date.getYear() - this.birthday.getYear();
////		}
////		if(this.birthday.getMonth() > date.getMonth()){
////			age +=  1;
////		}else if(this.birthday.getMonth()==date.getMonth()){
////			if(this.birthday.getDay() > date.getDay()){
////				age -= 1;
////			}
////		}
////		return age;
//	}
	
	public GiftDet addGift(GiftDet numgift){
		
		gifts.add(numgift);
		return numgift;
	
	}
	
	public String showGifts(){
		
		String str = "";
		
		for(GiftDet g : gifts){
		
			str += g.toString() + " " + " .";
		
		}
		
		return str;
	}
	@Override
	public String toString(){

		return "Name: "+name+" Age:"+this.ageSort()+" Birthday: "+ myFormat.format(birthday)+" gender: "+gender+"\n";

	}
	
}