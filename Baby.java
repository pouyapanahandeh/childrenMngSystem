import java.util.*;
import java.text.*;

public class Baby{

	public static void main(String[] args){
	
		
	BabyDet objOne = new BabyDet();
	GiftDet objThree = new GiftDet();


	List<String> BabyList = new ArrayList<String>();
	Scanner userInput = new Scanner(System.in);
		
		

	System.out.println("Welcome to Baby  Management System");
	
	
	
	System.out.println("1-Add new Baby." + "\n" +
	 "2-List of Babies by Age" + "\n" +
	 "3-List of Babies by Name" + "\n" +
	 "4-Add new Gift" + "\n" +
	 "5-List of Gifts" + "\n");	

	System.out.println("please enter your choice : ");
	int selector = userInput.nextInt(); 	

	if(selector == 1){
		System.out.println("Please enter Babys Name : ");
		BabyList.add((String) objOne.setBabyName(userInput.next()));
		System.out.println("name added successfully." + "\n" + "Please enter the baby's age: ");
		BabyList.addAll((int) objOne.setBabyAge(userInput.next()), BabyList);
		
		for(int i = 0 ; i < BabyList.size() ; i++){
			System.out.println(BabyList.get(i).getBabyName() + " " + BabyList.get(i).getBabyAge());
		}
	}

    }
}
