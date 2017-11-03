import java.util.*;
import java.text.*;

public class Baby{

	public static void main(String args[]){
	
	Scanner userInput = new Scanner(System.in);
	SimpleDateFormat myformat = new SimpleDateFormat("yyyyMMdd");
	int userInput;


	//List<String> BabyList = new ArrayList<String>();
	//Scanner userInput = new Scanner(System.in);
		
	GiftDet giftDet = new GiftDet();

	do{
			
	System.out.println("Welcome to Baby  Management System");
	
	System.out.println("1-Add new Baby." + "\n" +
	 "2-Add  Babies include Birthday" + "\n" +
	 "3-List of Babies by Name" + "\n" +
	 "4-Add new Gift" + "\n" +
	 "5-List of Gifts" + "\n");	

	System.out.println("please enter your choice : ");

	userInput = scanner.next();
	switch(userInput){
	
	case 1 :
		System.out.println("please add baby's name : ");
		String name = userInput.next();
	
		System.out.println("please enter Birthday : ");
		Date day = new Date();

		boolean validDate = false;
		while(!validDate){
			try{
				day = myFormat.parse(Scanner.next());
				validDate = true;
			}catch(ParseException e){
				System.out.println("Invalid Date or Type " +
				"please try again Later.");
				ValidDate = false;
			}
		}

		BabyDet = new BabyDet(name, age, birthday);
		giftDet.addGifts(g);
		System.out.println("add succefully");
		break;

	


	}

    }
}
