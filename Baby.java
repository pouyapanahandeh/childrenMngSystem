import java.util.*;
import java.text.*;

public class Baby{

	private static Date birthday;
	private static BabyDet BabyDet;
	private static int age;

	public static void main(String args[]){
	
	Scanner userInput = new Scanner(System.in);
	SimpleDateFormat myformat = new SimpleDateFormat("yyyyMMdd");
	String userInput1;


	//List<String> BabyList = new ArrayList<String>();
	//Scanner userInput = new Scanner(System.in);
		
	GiftDet giftDet = new GiftDet();

	do{
			
	System.out.println("Welcome to Baby  Management System");
	
	System.out.println("1-Add new Baby." + "\n" +
	 "a-Add  Babies include Birthday" + "\n" +
	 "3-List of Babies by Name" + "\n" +
	 "4-Add new Gift" + "\n" +
	 "5-List of Gifts" + "\n");	

	System.out.println("please enter your choice : ");

	userInput1 = userInput1.next();
	switch(userInput1){
	
	case "add" :
		System.out.println("please add baby's name : ");
		String name = userInput1.next();
	
		System.out.println("please enter Birthday : ");
		Date day = new Date();

		boolean validDate = false;
		while(!validDate){
			try{
				day = myformat.parse(userInput.next());
				validDate = true;
			}catch(ParseException e){
				System.out.println("Invalid Date or Type " +
				"please try again Later.");
				validDate = false;
			}
		}

		BabyDet = new BabyDet(name, age, birthday);
		BabyDet g;
		giftDet.addGifts(g);
		System.out.println("add succefully");
		break;

		case "llist" :
			System.out.println("List of babys");
			giftDet.sort();
			giftDet.printAll();
		break;
		
		}	
	}

    }
}
